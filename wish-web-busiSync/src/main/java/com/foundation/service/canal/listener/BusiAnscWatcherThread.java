package com.foundation.service.canal.listener;

import com.alibaba.otter.canal.client.CanalConnector;
import com.alibaba.otter.canal.client.CanalConnectors;
import com.alibaba.otter.canal.protocol.CanalEntry;
import com.alibaba.otter.canal.protocol.Message;
import com.foundation.common.config.Global;
import com.foundation.common.date.DateUtils;
import com.foundation.common.http.HttpClientUtils;
import com.foundation.common.utils.IdGen;
import com.foundation.common.utils.SpringContextHolder;
import com.foundation.service.canal.common.*;
import com.google.common.collect.Maps;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotNull;
import java.net.InetSocketAddress;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 处理监听体检系统业务表变更的
 * Created by fqh on 2016/1/12
 */
public class BusiAnscWatcherThread extends Thread {

    static Logger logger = LoggerFactory.getLogger(BusiAnscWatcherThread.class);
    //private static final ExecutorService threadPool = Executors.newFixedThreadPool(3);

    private static String sourceKey = "sync.source.";
    private static String busi_sync_url = Global.getConfig("sync.busi.result.url");
    private final String listenerDb = "tjxt-busi-cs";
    private final String isTest = Global.getConfig("isTest");
    private CanalConnector connector;
    BusiSyncHandle busiSyncHandle = SpringContextHolder.getBean(BusiSyncHandle.class);

    @Override
    public void run() {
        if (connector == null) {
            //zk方式：TODO://正式环境应该切换zk模式
            String zkAddress = Global.getConfig("canal.zk");
            String canalHost = Global.getConfig("canal.host");
            String canalPost = Global.getConfig("canal.port");
            String destination = Global.getConfig("canal.destination");
            String username = Global.getConfig("canal.username");
            String password = Global.getConfig("canal.password");
            // 创建链接
            if (StringUtils.isNotBlank(zkAddress)){
                logger.info("canal zkCluster  working...............");
                connector = CanalConnectors.newClusterConnector(zkAddress, destination, username, password);
            }else{
                logger.info("canal Single working...............");
                connector = CanalConnectors.newSingleConnector(new InetSocketAddress(canalHost, Integer.valueOf(canalPost)), destination, username, password);
            }
        }
        init();//配置初始化，并且订阅dataChange事件
    }

    /**
     * 初始化配置信息,并且每隔1秒从canal server读取binlog日志产生的消息体信息
     */
    private void init() {
        int i = 0;
        boolean flag = true;
        while (i++ < 3 && flag) {
            System.out.println("connect canal count:" + i);
            try {
                connector.connect();
                connector.subscribe(".*\\..*");
                connector.rollback();
                flag = false;
                logger.warn("canal连接次数：" + i);
            } catch (Exception e) {
                flag = true;
                logger.error("canal连接重试ing...");
            }
        }

        while (true) {
            Message message = connector.getWithoutAck(1000); // 获取指定数量的数据
            long batchId = message.getId();
            int size = message.getEntries().size();
            if (batchId == -1 || size == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            } else {
                long beginTime = DateUtils.nowDateToTimestamp();
                //逻辑:1先判断插入与更新2如果是状态已完成4，则获取数据。进行保存，存mongdb
                try {
                    switchHandle(message.getEntries());
                    connector.ack(batchId); // 提交确认
                } catch (Exception e) {
                    logger.error("fqh同步错误，需要回滚", e);
                    e.printStackTrace();
                    connector.rollback(batchId);
                }
                long endTime = DateUtils.nowDateToTimestamp();
                logger.info("此次同步时间是:" + (endTime - beginTime) + " ms");
            }
        }
    }

    /**
     * 处理行名
     *
     * @param entrys
     */
    private void switchHandle(@NotNull List<CanalEntry.Entry> entrys) {
        for (CanalEntry.Entry entry : entrys) {
            if (entry.getEntryType() == CanalEntry.EntryType.TRANSACTIONBEGIN || entry.getEntryType() == CanalEntry.EntryType.TRANSACTIONEND) {
                continue;
            }
            CanalEntry.RowChange rowChage = null;
            try {
                rowChage = CanalEntry.RowChange.parseFrom(entry.getStoreValue());
            } catch (Exception e) {
                logger.error("ERROR ## parser of eromanga-event has an error , data:" + entry.toString(), e);
                continue;
            }

            /*if (isTest.equals("1") && !(entry.getHeader().getSchemaName().equalsIgnoreCase(listenerDb))) {
                logger.info(String.format("Schema And TableName[%s,%s]=======continue=======>listenDb[%s] ",
                        entry.getHeader().getSchemaName(), entry.getHeader().getTableName(), listenerDb));
                continue;
            }*/

            CanalEntry.EventType eventType = rowChage.getEventType();
            logger.info(String.format("================> binlog[%s:%s] , name[%s,%s] , eventType : %s",
                    entry.getHeader().getLogfileName(), entry.getHeader().getLogfileOffset(),
                    entry.getHeader().getSchemaName(), entry.getHeader().getTableName(),
                    eventType));

            String schemaName = entry.getHeader().getSchemaName();
            String tableName = entry.getHeader().getTableName();
            if (!BusicTableNameEnum.isContains(tableName)) {
                logger.info("schema[" + schemaName + "]table:[" + tableName + "]数据变更，无需同步数据，已经过滤");
                continue;
            }

            for (CanalEntry.RowData rowData : rowChage.getRowDatasList()) {
                boolean flag = true;
                List<CanalEntry.Column> columns = rowData.getAfterColumnsList();//所有列
                if (eventType == CanalEntry.EventType.INSERT && isComplete(columns)) {//插入操作，并且业务表状态是4
                    flag = false;
                    //处理业务数据
                    dealBusinessData(tableName, getIdByCol(columns, tableName), CanalEntry.EventType.INSERT, BusicTableNameEnum.getSexTypeByName(tableName), schemaName);
                } else if (eventType == CanalEntry.EventType.UPDATE && isComplete(columns)) {//更新操作，并且业务表状态是4
                    flag = false;
                    //处理业务数据
                    dealBusinessData(tableName, getIdByCol(columns, tableName), CanalEntry.EventType.UPDATE, BusicTableNameEnum.getSexTypeByName(tableName), schemaName);
                }
                //如果是 丈夫妻子基础信息表，不管是否是已经完成状态，都要进行用户信息的同步
                if ((tableName.equals(BusicTableNameEnum.busi_husband_basic_info.getTableName()) || tableName.equals(BusicTableNameEnum.busi_wife_basic_info.getTableName()))
                        && flag) {
                    String id = getIdByCol(columns, tableName);
                    BusiPersonSexTypeEnum sexEnum = BusicTableNameEnum.getSexTypeByName(tableName);
                    //同步数据
                    logger.info("同步 schema[" + schemaName + "]table:[" + tableName + "[-[" + sexEnum.getSexType() + "]基本信息,id:" + id);
                    gotoSyncData(tableName, id, CanalEntry.EventType.UPDATE, sexEnum, schemaName, getExampleName(schemaName));
                }

            }
        }
    }

    /**
     * @param
     * @return
     * @throws
     * @Title:
     * @Description: TODO 根据表名处理相关业务数据
     * @author
     * @date 2016/10/24 20:36
     */
    public void dealBusinessData(String tableName, String id, CanalEntry.EventType canalEntry, BusiPersonSexTypeEnum busiPersonSexTypeEnum, String sourceName) {
        if (StringUtils.isEmpty(tableName)) {
            return;
        }
        String exampleName = getExampleName(sourceName);

        //同步数据
        Map<String, Object> resultMap = gotoSyncData(tableName, id, canalEntry, busiPersonSexTypeEnum, sourceName, exampleName);

        //将同步结果通知其他系统
        try {
            gotoSyncResult(resultMap, tableName, id);
        } catch (Exception e) {
            logger.info("goto sync 单据状态变化 error: table:" + tableName + " PKID:" + id + "  e:" + e);
        }

    }

    /**
     * @param
     * @return
     * @throws
     * @Title:
     * @Description: 通过sourceName获取 实例名字
     * @author chunyangli
     * @date 2016/12/7 19:49
     */
    public static String getExampleName(String sourceName) {
        String exampleName = "";
        if (StringUtils.isNotBlank(sourceName)) {
            exampleName = Global.getConfig(sourceKey + sourceName.replace("-", "_"));
        }
        return exampleName;
    }

    /**
     * @param
     * @return
     * @throws
     * @Title:
     * @Description: 同步数据
     * @author chunyangli
     * @date 2016/12/1 15:04
     */
    public Map<String, Object> gotoSyncData(String tableName, String id, CanalEntry.EventType canalEntry, BusiPersonSexTypeEnum busiPersonSexTypeEnum, String sourceName, String exampleName) {
        Map<String, Object> resultMap = Maps.newHashMap();
        logger.info("同步过来的表名是：" + tableName + " 业务Id是：" + id + " begin ");
        if (tableName.equals(BusicTableNameEnum.busi_pregnancy_archive.getTableName())) {//妊娠服务档案表
            resultMap = busiSyncHandle.syncFamilyArchiveInfo(id, canalEntry, sourceName, exampleName);
        } else if (tableName.equals(BusicTableNameEnum.busi_wife_basic_info.getTableName())) {//妻子基本信息表
            resultMap = busiSyncHandle.syncUserBasicInfo(id, BusiPersonSexTypeEnum.busi_wife, sourceName, exampleName);
        } else if (tableName.equals(BusicTableNameEnum.busi_husband_basic_info.getTableName())) {//丈夫基本信息表
            resultMap = busiSyncHandle.syncUserBasicInfo(id, BusiPersonSexTypeEnum.busi_hasband, sourceName, exampleName);
        } else if (tableName.equals(BusicTableNameEnum.busi_wife_general_situation.getTableName())) {//妻子一般情况表
            resultMap = busiSyncHandle.syncUserGeneralSituationInfo(id, busiPersonSexTypeEnum, sourceName, exampleName);
        } else if (tableName.equals(BusicTableNameEnum.busi_wife_physical_exam.getTableName())) {//妻子体格检查表
            resultMap = busiSyncHandle.syncUserPhysicalExamInfo(id, busiPersonSexTypeEnum, sourceName, exampleName);
        } else if (tableName.equals(BusicTableNameEnum.busi_exam_value_b.getTableName())) {//临床检查结果值（丈夫）
            resultMap = busiSyncHandle.syncBusiExamValue(id, busiPersonSexTypeEnum, sourceName, exampleName);
        } else if (tableName.equals(BusicTableNameEnum.busi_exam_value_w.getTableName())) {//临床检查结果值（妻子）
            resultMap = busiSyncHandle.syncBusiExamValue(id, busiPersonSexTypeEnum, sourceName, exampleName);
        } else if (tableName.equals(BusicTableNameEnum.busi_wife_hemoglobin.getTableName())) {//妻子血红蛋白分析表
            resultMap = busiSyncHandle.syncBusiHemoglobin(id, busiPersonSexTypeEnum, sourceName, exampleName);
        } else if (tableName.equals(BusicTableNameEnum.busi_wife_gene.getTableName())) {//妻子基因检测值表
            resultMap = busiSyncHandle.syncBusiWifeGene(id, busiPersonSexTypeEnum, sourceName, exampleName);
        } else if (tableName.equals(BusicTableNameEnum.busi_husband_general_situation.getTableName())) {//丈夫一般情况表
            resultMap = busiSyncHandle.syncUserGeneralSituationInfo(id, busiPersonSexTypeEnum, sourceName, exampleName);
        } else if (tableName.equals(BusicTableNameEnum.busi_wife_b_value.getTableName())) {//妻子妇科B超检查结果表
            resultMap = busiSyncHandle.syncBusiWifeBValue(id, canalEntry, sourceName, exampleName);
        } else if (tableName.equals(BusicTableNameEnum.busi_wife_genital_exam_value.getTableName())) {//妻子生殖系统检查值表
            resultMap = busiSyncHandle.syncBusiGenitalExamValue(id, busiPersonSexTypeEnum, sourceName, exampleName);
        } else if (tableName.equals(BusicTableNameEnum.busi_husband_genital_exam_value.getTableName())) {//丈夫生殖系统检查值表
            resultMap = busiSyncHandle.syncBusiGenitalExamValue(id, busiPersonSexTypeEnum, sourceName, exampleName);
        } else if (tableName.equals(BusicTableNameEnum.busi_husband_hemoglobin.getTableName())) {//丈夫血红蛋白分析表
            resultMap = busiSyncHandle.syncBusiHemoglobin(id, busiPersonSexTypeEnum, sourceName, exampleName);
        } else if (tableName.equals(BusicTableNameEnum.busi_husband_gene.getTableName())) {//丈夫基因检测值表
            resultMap = busiSyncHandle.syncBusiWifeGene(id, busiPersonSexTypeEnum, sourceName, exampleName);
        } else if (tableName.equals(BusicTableNameEnum.busi_husband_physical_exam.getTableName())) {//丈夫体格检查表
            resultMap = busiSyncHandle.syncUserPhysicalExamInfo(id, busiPersonSexTypeEnum, sourceName, exampleName);
        }
        logger.info("同步过来的表名是：" + tableName + " 业务Id是：" + id + " end ");
        return resultMap;
    }

    /**
     * @param
     * @return
     * @throws
     * @Title:
     * @Description: 同步完成后通知其他系统
     * @author chunyangli
     * @date 2016/12/1 15:00
     */
    public void gotoSyncResult(Map<String, Object> resultMap, String tableName, String id) {
        logger.info(" goto sync 单据状态变化，通知结果  table:" + tableName + " PKID:" + id + "   begin");
        if (null != resultMap && resultMap.size() > 0) {
            String zoneCode = "";
            String pregnancyArchiveId = "";
            if ((null != resultMap.get("zoneCode") && !"".equals(resultMap.get("zoneCode"))) && (null != resultMap.get("pregnancyArchiveId") && !"".equals(resultMap.get("pregnancyArchiveId")))) {
                zoneCode = resultMap.get("zoneCode").toString();
                try {
                    zoneCode = zoneCode.substring(0, 2);
                } catch (Exception e) {

                }
                pregnancyArchiveId = resultMap.get("pregnancyArchiveId").toString();
                SyncResultDto resultDto = new SyncResultDto();
                String uuid = IdGen.uuid();
                uuid = uuid.replaceAll("-", "");
                resultDto.setRequestid(uuid);
                resultDto.setRequestsource(SyncConstants.REQUESTSOURCE);
                resultDto.setRequestuser(SyncConstants.REQUESTUSER);
                resultDto.setSessionid(SyncConstants.SESSIONID);
                resultDto.setMethod(SyncConstants.METHOD);
                resultDto.setVersion(SyncConstants.VERSION);
                resultDto.setSignature(SyncConstants.SIGNATURE);
                List<SyncResultChildDto> list = new ArrayList<SyncResultChildDto>();
                SyncResultChildDto syncResultChildDto = new SyncResultChildDto();
                syncResultChildDto.setShardDBName(zoneCode);
                syncResultChildDto.setArchiveId(pregnancyArchiveId);
                list.add(syncResultChildDto);
                resultDto.setRequestlist(list);
                String json = com.alibaba.fastjson.JSONObject.toJSONString(resultDto);

                logger.info("[syncUrl is :]" + busi_sync_url + " [json] is :" + json);
                String result = "";
                try {
                    result = HttpClientUtils.doPost(busi_sync_url, json);
                } catch (Exception e) {
                    logger.error("goto sync单据状态变化 error http-result:[" + result + "]，原因：同步出错 table:" + tableName + " PKID:" + id + " zoneCode：" + zoneCode, e);
                }

            } else {
                logger.error("goto sync 单据状态变化 error ，原因：zoneCode 或者 pregnancyArchiveId 没有返回值 table:" + tableName + " PKID:" + id + " zoneCode：" + zoneCode);
            }
        } else {
            logger.error("goto sync 单据状态变化 error ，原因：zoneCode 或者 pregnancyArchiveId 没有返回值 table:" + tableName + " PKID:" + id);
        }
        logger.info(" goto sync 单据状态变化，通知结果  table:" + tableName + " PKID:" + id + "   end");
    }

    /**
     * 判断记录是否是已完成状态
     *
     * @param columns
     * @return
     */
    private static boolean isComplete(@NotNull List<CanalEntry.Column> columns) {
        boolean flag = false;
        for (CanalEntry.Column column : columns) {
            if (column.getName().equals(SyncConstants.ISCOMPLATE) &&
                    StringUtils.isNotBlank(column.getValue()) &&
                    column.getValue().trim().equals(SyncConstants.ISCOMPLATENUM)) {//"iscomplete"是业务表的数据状态
                flag = true;
            }
        }
        return flag;
    }

    /**
     * 根据列获取对应的id
     *
     * @param columns
     * @return
     */
    private static String getIdByCol(@NotNull List<CanalEntry.Column> columns, String tableName) {
        boolean flag = false;
        String idName = BusicTableNameEnum.getIdByName(tableName);
        String idValue = "";
        if (null != idName && !"".equals(idName)) {
            for (CanalEntry.Column column : columns) {
                if (column.getName().equals(idName) && StringUtils.isNotBlank(column.getValue())) {//"iscomplete"是业务表的数据状态
                    idValue = column.getValue();
                }
            }
        }

        return idValue;
    }

}
