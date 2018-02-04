package com.foundation.service.canal.client;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.foundation.canal.invoke.ICanalInvoke;
import com.foundation.common.bean.Constants;
import com.foundation.common.utils.IdGen;
import com.foundation.dao.entity.archive.DistArchiveIndicator;
import com.foundation.service.dist.service.IDistArchiveIndicatorService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author fqh
 * @version 1.0  2016/10/14
 * dict_risk_factor_mapping
 */
public class DictIndicatorSyncInvoke implements ICanalInvoke {

    Logger logger= LoggerFactory.getLogger(DictIndicatorSyncInvoke.class);

    @Autowired
    IDistArchiveIndicatorService distArchiveIndicatorService;

    @Override
    public void onInsert(CanalEntry.RowData rowData) {
        List<CanalEntry.Column> columns=rowData.getAfterColumnsList();//获取所有列
        if(!CollectionUtils.isEmpty(columns)){
            //拼装 指标实体类
            DistArchiveIndicator indicator=getArchiveindicator(columns);
            try {
                indicator.setId(IdGen.uuid());
                distArchiveIndicatorService.save(indicator);
            } catch (Exception e) {
                logger.error("同步字典数据出错"+e.getMessage());
                e.printStackTrace();
            }
        }
       // printColumn(rowData.getAfterColumnsList());
    }

    @Override
    public void onDelete(CanalEntry.RowData rowData) {
        List<CanalEntry.Column> columns=rowData.getAfterColumnsList();//获取所有列
        if(!CollectionUtils.isEmpty(columns)){
            //拼装 指标实体类
            DistArchiveIndicator indicator=getArchiveindicator(columns);
            try {
                distArchiveIndicatorService.deleteByCodeAndSex(indicator.getCode(),indicator.getSex());
            } catch (Exception e) {
                logger.error("同步字典数据出错"+e.getMessage());
                e.printStackTrace();
            }
        }
        printColumn(rowData.getBeforeColumnsList());
    }

    /**
    * @Title: ${enclosing_method}
    * @Description: ${todo}(这里用一句话描述这个方法的作用)
    * @param rowData
    * @return ${return_type}    返回类型
    * @throws
    */
    @Override
    public void onUpdate(CanalEntry.RowData rowData) {
        System.out.println("-------> before");
        printColumn(rowData.getBeforeColumnsList());
        System.out.println("-------> after");
        printColumn(rowData.getAfterColumnsList());

        List<CanalEntry.Column> columns=rowData.getAfterColumnsList();//获取所有列
        if(!CollectionUtils.isEmpty(columns)){
            //拼装 指标实体类
            DistArchiveIndicator indicator=getArchiveindicator(columns);
            for (CanalEntry.Column column : columns) {
                System.out.println("DictindicatorItem Insert: "+column.getName() + " : " + column.getValue() + "    update=" + column.getUpdated());
            }
            try {
                distArchiveIndicatorService.updateByCode(indicator);
            } catch (Exception e) {
                logger.error("同步字典数据出错"+e.getMessage());
                e.printStackTrace();
            }
        }
        printColumn(rowData.getBeforeColumnsList());
    }

    /**
    * @Title:
    * @Description: 输出日志
    * @param  columns
    * @return 返回类型
    * @throws
    */
    private static void printColumn(List<CanalEntry.Column> columns) {
        for (CanalEntry.Column column : columns) {
            System.out.println("dictIndicator change:"+column.getName() + " : " + column.getValue() + "    update=" + column.getUpdated());
        }
    }


    /**
    * @Title:
    * @Description: 根据canal列，组装获取指标实体信息
    * @param  columns
    * @return 返回类型
    * @throws
    */
    private static DistArchiveIndicator getArchiveindicator(List<CanalEntry.Column> columns) {
        DistArchiveIndicator indicator=new DistArchiveIndicator();
        for (CanalEntry.Column column : columns) {
            String value = column.getValue();
            switch (column.getName()) {
                case "risk_factor_name":
                    indicator.setName(value);
                    break;
                case "risk_factor_code":
                    indicator.setCode(value);
                    break;
              /*  case "item_type":
                    indicator.setType(value);
                    break;*/
                case "column_name":
                    if(StringUtils.isNotBlank(value))
                        indicator.setColumnName(value.toLowerCase());
                    break;
                case "table_name":
                    if(StringUtils.isNotBlank(value))
                        indicator.setTableName(value.toLowerCase());
                    break;
            /*    case "allow_min":
                    if (StringUtils.isNotBlank(value)) {
                        indicator.setMinValue(Float.valueOf(value));
                    }
                    break;
                case "allow_max":
                    if (StringUtils.isNotBlank(value)) {
                        indicator.setMaxValue(Float.valueOf(value));
                    }
                    break;*/
                case "isDelete":
                    if (StringUtils.isNotBlank(value)) {
                        try {
                            indicator.setDelFlag(Integer.valueOf(value));
                        } catch (Exception e) {
                            indicator.setDelFlag(Constants.DEL_FLAG_NORMAL);
                        }
                    }
                    break;
                case "sex_type":
                    if (StringUtils.isNotBlank(value)) {
                        try {
                            indicator.setSex(Integer.valueOf(value));
                        } catch (Exception e) {
                            indicator.setSex(Constants.DEL_FLAG_NORMAL);
                        }
                    }
                    break;
                case "is_char":
                    if (StringUtils.isNotBlank(value)) {
                        try {
                            indicator.setIsChar(Integer.valueOf(value));
                        } catch (Exception e) {
                            indicator.setIsChar(Constants.DEL_FLAG_NORMAL);
                        }
                    }
                    break;
            }
        }
        return indicator;
    }

    /*`exam_item_id` varchar(32) NOT NULL,
    `item_code` varchar(50) NOT NULL,
    `item_name` varchar(50) NOT NULL,
    `item_type` tinyint(4) NOT NULL,
    `column_name` varchar(50) NOT NULL,
    `sex_type` tinyint(4) DEFAULT NULL,
    `item_script` varchar(2000) DEFAULT NULL,
    `allow_min` varchar(50) DEFAULT NULL,
    `allow_max` varchar(50) DEFAULT NULL,
    `create_user_id` varchar(50) DEFAULT NULL,
    `create_datetime` datetime DEFAULT NULL,
            `update_user_id` varchar(50) DEFAULT NULL,
    `update_datetime` datetime DEFAULT NULL,
    `isdelete` tinyint(4) DEFAULT NULL,*/

}
