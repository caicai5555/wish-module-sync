package com.foundation.service.canal.listener;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.foundation.common.bean.Constants;
import com.foundation.common.utils.IdGen;
import com.foundation.common.utils.StringUtils;
import com.foundation.dao.entity.archive.FamilyArchive;
import com.foundation.dao.entity.sync.*;
import com.foundation.dao.entity.sys.User;
import com.foundation.mongo.entity.record.BaseRecordEntity;
import com.foundation.mongo.entity.record.Indicator;
import com.foundation.service.canal.common.*;
import com.foundation.service.dist.service.IFamilyArchiveService;
import com.foundation.service.record.service.impl.IndicatorRecordService;
import com.foundation.service.tjxtSync.service.*;
import com.foundation.service.usercenter.biz.IUserBiz;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.xml.bind.annotation.XmlElementDecl;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author fqh
 * @Description: 业务同步处理类
 */
@Service
public class BusiSyncHandle {

    Logger logger = LoggerFactory.getLogger(BusiSyncHandle.class);
    private final String sourceNameKey = "sourceName";
    private final String idKey = "id";
    private final String sourceKey = "source";
    private final Map<String, Object> params_query = Maps.newConcurrentMap();
    private final String zoneCodeKey = "zoneCode";
    private final String pregnancyArchiveIdKey = "pregnancyArchiveId";
    //private final String certificateNumberKey = "certificateNumber";
    private final String sexKey = "sex";
    private final String ageKey = "age";
    private final String ageName = "年龄";


    @Autowired
    IUserBiz userBiz;
    @Autowired
    IndicatorRecordService indicatorRecordService;
    @Autowired
    IBusiPregnancyArchiveSerive busiPregnancyArchiveSerive;
    @Autowired
    IFamilyArchiveService familyArchiveService;
    @Autowired
    IBusiHusbandBasicInfoService busiHusbandBasicInfoService;
    @Autowired
    IBusiWifeBasicInfoService busiWifeBasicInfoService;
    @Autowired
    IBusiHusbandGeneralSituationService busiHusbandGeneralSituationService;
    @Autowired
    IBusiWifeGeneralSituationService busiWifeGeneralSituationService;
    @Autowired
    IBusiWifeGeneralValueService busiWifeGeneralValueService;
    @Autowired
    IBusiHusbandGeneralValueService busiHusbandGeneralValueService;
    @Autowired
    IBusiWifePhysicalExamService busiWifePhysicalExamService;
    @Autowired
    IBusiHusbandPhysicalExamService busiHusbandPhysicalExamService;

    @Autowired
    private IBusiWifeBValueService busiWifeBValueService;
    @Autowired
    private IBusiWifeGeneService busiWifeGeneService;
    @Autowired
    private IBusiHusbandGeneService busiHusbandGeneService;
    @Autowired
    private IBusiExamValueWService busiExamValueWService;
    @Autowired
    private IBusiExamValueBService busiExamValueBService;
    @Autowired
    private IBusiWifeHemoglobinService busiWifeHemoglobinService;
    @Autowired
    private IBusiHusbandHemoglobinService busiHusbandHemoglobinService;
    @Autowired
    private IBusiHusbandGenitalExamValueService busiHusbandGenitalExamValueService;
    @Autowired
    private IBusiWifeGenitalExamValueService busiWifeGenitalExamValueService;
    @Autowired
    private BusiConvertUtil busiConvertUtil;

    @Autowired
    private IBusiExamValueWScopeService busiExamValueWScopeService;
    @Autowired
    private IBusiExamValueBScopeService busiExamValueBScopeService;



    /**
     * 同步家庭档案信息
     * to:mysql
     *
     * @param id
     * @param eventType
     */
    public Map<String, Object> syncFamilyArchiveInfo(String id, CanalEntry.EventType eventType, String sourceName, String exampleName) {
        Map<String, Object> resultMap = Maps.newHashMap();
        //组装基本数据
        try {
            getMap(id, sourceName, exampleName);

            BusiPregnancyArchive archive = busiPregnancyArchiveSerive.queryDataBySourceName(params_query);
            if (archive != null) {
                if (StringUtils.isNotBlank(archive.getZoneProvinceCode())) {
                    resultMap.put(zoneCodeKey, archive.getZoneProvinceCode());
                }
                if (StringUtils.isNotBlank(archive.getPregnancyArchiveId())) {
                    resultMap.put(pregnancyArchiveIdKey, archive.getPregnancyArchiveId());
                }

                FamilyArchive familyArchive = busiConvertUtil.familyArchiveConvert(archive);
                //插入操作
               /* if (CanalEntry.EventType.INSERT == eventType) {
                    familyArchive.setId(IdGen.uuid());
                    familyArchiveService.save(familyArchive);
                } else if (CanalEntry.EventType.UPDATE == eventType) {//更新操作（需要先查询是否存在，再决定是更新还是插入）
*/
                Map<String, Object> params_family = Maps.newHashMap();
                if (StringUtils.isNotBlank(archive.getPregnancyArchiveId())) {
                    params_family.put(pregnancyArchiveIdKey, familyArchive.getPregnancyArchiveId());
                }

                List<FamilyArchive> familyArchiveList = familyArchiveService.queryList(params_family);

                if (!CollectionUtils.isEmpty(familyArchiveList)) {
                    logger.info("档案已经存在，更新操作"+familyArchive.getPregnancyArchiveId());
                    FamilyArchive f = familyArchiveList.get(0);
                    familyArchive.setId(f.getId());
                    familyArchive.setUpdateDate(new Date());
                    if (null != f.getCreateDate()) {
                        familyArchive.setCreateDate(f.getCreateDate());
                    }
                    familyArchiveService.updateById(familyArchive);
                } else {
                    logger.info("档案未存在，插入操作"+familyArchive.getPregnancyArchiveId());
                    familyArchive.setId(IdGen.uuid());
                    familyArchiveService.save(familyArchive);
                }

                /*}*/
            } else {
                logger.error("同步家庭信息，查询实体为null,id为" + id);
            }
        } catch (Exception e) {
            System.out.println(e);
            logger.error("同步家庭档案数据出错 id===" + id, e);
        }
        return resultMap;
    }

    /**
     * 同步 妻子和丈夫基本信息
     * to:mysql
     *
     * @param id
     */
    public Map<String, Object> syncUserBasicInfo(String id, BusiPersonSexTypeEnum sexTypeEnum, String sourceName, String exampleName) {
        Map<String, Object> resultMap = Maps.newHashMap();

        getMap(id, sourceName, exampleName);

        try {
            //查询数据库--根据id获取数据
            if (sexTypeEnum == BusiPersonSexTypeEnum.busi_hasband) {
                BusiHusbandBasicInfo manInfo = busiHusbandBasicInfoService.queryDataBySourceName(params_query);
                if (manInfo != null) {
                    if (StringUtils.isNotBlank(manInfo.getZoneProvinceCode())) {
                        resultMap.put(zoneCodeKey, manInfo.getZoneProvinceCode());
                    }
                    if (StringUtils.isNotBlank(manInfo.getPregnancyArchiveId())) {
                        resultMap.put(pregnancyArchiveIdKey, manInfo.getPregnancyArchiveId());
                    }
                    User man = busiConvertUtil.userHusbandConvert(manInfo);
                    if (null != man) {
                        //查询
                        Map params=Maps.newHashMap();
                        params.put(pregnancyArchiveIdKey, manInfo.getPregnancyArchiveId());//档案编号
                        params.put(sexKey, Constants.SEX_MAN);
                        User user = userBiz.getUserByCertNum(params);
                        if(user!=null){
                            logger.info("更新【丈夫】用户信息"+manInfo.getPregnancyArchiveId());
                            man.setId(user.getId());
                            userBiz.updateUser(man);
                        }else {
                            logger.info("插入【丈夫】用户信息"+manInfo.getPregnancyArchiveId());
                            userBiz.insertUser(man);
                        }
                        if (null != man.getAge()&&man.getAge()>0) {
                            Map<String, BaseRecordEntity> recordMap = Maps.newHashMap();
                            Indicator indicator = new Indicator();
                            indicator.setUserId(man.getId());
                            indicator.setCertNum(man.getCertificateNumber());
                            indicator.setCode(ageKey);
                            indicator.setName(ageName);
                            indicator.setValue(man.getAge().toString());
                            recordMap.put(ageKey, indicator);
                            indicatorRecordService.saveIndicators(recordMap, true);
                        }
                    }
                } else {
                    logger.error("同步【男】用户基本信息，查询实体为null,id为" + id);
                }
            } else if (sexTypeEnum == BusiPersonSexTypeEnum.busi_wife) {
                BusiWifeBasicInfo womanInfo = busiWifeBasicInfoService.queryDataBySourceName(params_query);
                if (womanInfo != null) {
                    if (StringUtils.isNotBlank(womanInfo.getZoneProvinceCode())) {
                        resultMap.put(zoneCodeKey, womanInfo.getZoneProvinceCode());
                    }
                    if (StringUtils.isNotBlank(womanInfo.getPregnancyArchiveId())) {
                        resultMap.put(pregnancyArchiveIdKey, womanInfo.getPregnancyArchiveId());
                    }

                    User wife = busiConvertUtil.userWifeConvert(womanInfo);
                    if (null != wife) {
                        //查询
                        Map params=Maps.newHashMap();
                        params.put(pregnancyArchiveIdKey, wife.getPregnancyArchiveId());//档案编号
                        params.put(sexKey, Constants.SEX_WOMAN);
                        User user = userBiz.getUserByCertNum(params);
                        if(user!=null){
                            logger.info("更新【妻子】用户信息"+wife.getPregnancyArchiveId());
                            wife.setId(user.getId());
                            userBiz.updateUser(wife);
                        }else {
                            logger.info("插入【妻子】用户信息"+wife.getPregnancyArchiveId());
                            userBiz.insertUser(wife);
                        }
                        if (null != wife.getAge()&&wife.getAge()>0) {
                            Map<String, BaseRecordEntity> recordMap = Maps.newHashMap();
                            Indicator indicator = new Indicator();
                            indicator.setUserId(wife.getId());
                            indicator.setCertNum(wife.getCertificateNumber());
                            indicator.setCode(ageKey);
                            indicator.setName(ageName);
                            indicator.setValue(wife.getAge().toString());
                            recordMap.put(ageKey, indicator);
                            indicatorRecordService.saveIndicators(recordMap, true);
                        }
                    }
                } else {
                    logger.error("同步【女】用户基本信息，查询实体为null,id为" + id);
                }
            }
        } catch (Exception e) {
            logger.error("同步个人基本信息id===" + id, e);
        }
        return resultMap;
    }

    /**
     * 同步妻子一般情况
     * to mongdb
     *
     * @param id
     */
    public Map<String, Object> syncUserGeneralSituationInfo(String id, BusiPersonSexTypeEnum sexTypeEnum, String sourceName, String exampleName) {
        Map<String, Object> resultMap = Maps.newHashMap();
        getMap(id, sourceName, exampleName);
        try {
            //查询数据库--根据id获取数据
            if (sexTypeEnum == BusiPersonSexTypeEnum.busi_hasband) {
                BusiHusbandGeneralSituation entity = busiHusbandGeneralSituationService.queryDataBySourceName(params_query);

                if (null != entity && StringUtils.isNotBlank(entity.getCertNum())) {
                    Map<String, Object> params = Maps.newHashMap();

                    if (StringUtils.isNotBlank(entity.getZoneProvinceCode())) {
                        resultMap.put(zoneCodeKey, entity.getZoneProvinceCode());
                    }
                    if (StringUtils.isNotBlank(entity.getPregnancyArchiveId())) {
                        resultMap.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());
                    }

                    params.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());//档案编号
                    params.put(sexKey, Constants.SEX_MAN);
                    User user = userBiz.getUserByCertNum(params);
                    if (null == user) {
                        logger.error("同步方法：syncUserGeneralSituationInfo  通过档案标号：" + entity.getPregnancyArchiveId() + " 和 性别 ：男" + "查询的user为null");

                    }
                    EntityParamsCommon entityParamsCommon = new EntityParamsCommon();
                    entityParamsCommon.setCertNum(entity.getCertNum());
                    entityParamsCommon.setEntity(entity);
                    entityParamsCommon.setTableNameEnum(BusicTableNameEnum.busi_husband_general_situation);
                    entityParamsCommon.setUserId(user.getId());
                    Map<String, BaseRecordEntity> recordMap = busiConvertUtil.recordEntityConvertCommon(entityParamsCommon);
                    indicatorRecordService.saveIndicators(recordMap, true);
                } else {
                    logger.error("同步【男】用户一般情况，查询实体为null,id为" + id);
                }

            } else if (sexTypeEnum == BusiPersonSexTypeEnum.busi_wife) {
                BusiWifeGeneralSituation entity = busiWifeGeneralSituationService.queryDataBySourceName(params_query);

                if (null != entity && StringUtils.isNotBlank(entity.getCertNum())) {
                    if (StringUtils.isNotBlank(entity.getZoneProvinceCode())) {
                        resultMap.put(zoneCodeKey, entity.getZoneProvinceCode());
                    }
                    if (StringUtils.isNotBlank(entity.getPregnancyArchiveId())) {
                        resultMap.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());
                    }

                    Map<String, Object> params = Maps.newHashMap();
                    params.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());//档案编号
                    params.put(sexKey, Constants.SEX_WOMAN);
                    User user = userBiz.getUserByCertNum(params);
                    if (user == null) {
                        logger.error("同步方法：syncUserGeneralSituationInfo  通过档案标号：" + entity.getPregnancyArchiveId() + " 和 性别 ：女" + "查询的user为null");

                    }
                    EntityParamsCommon entityParamsCommon = new EntityParamsCommon();
                    entityParamsCommon.setCertNum(entity.getCertNum());
                    entityParamsCommon.setEntity(entity);
                    entityParamsCommon.setTableNameEnum(BusicTableNameEnum.busi_wife_general_situation);
                    entityParamsCommon.setUserId(user.getId());
                    Map<String, BaseRecordEntity> recordMap = busiConvertUtil.recordEntityConvertCommon(entityParamsCommon);
                    indicatorRecordService.saveIndicators(recordMap, true);
                } else {
                    logger.error("同步【女】用户一般情况，查询实体为null,id为" + id);
                }

            }
        } catch (Exception e) {
            logger.error("同步个人一般情况信息id===" + id, e);
        }
        return resultMap;
    }


    /**
     * 同步妻子体格检查数据
     *
     * @param id
     */
    public Map<String, Object> syncUserPhysicalExamInfo(String id, BusiPersonSexTypeEnum sexTypeEnum, String sourceName, String exampleName) {
        Map<String, Object> resultMap = Maps.newHashMap();
        getMap(id, sourceName, exampleName);
        try {
            //查询数据库--根据id获取数据
            if (sexTypeEnum == BusiPersonSexTypeEnum.busi_hasband) {
                BusiHusbandPhysicalExam entity = busiHusbandPhysicalExamService.queryDataBySourceName(params_query);

                if (null != entity && StringUtils.isNotBlank(entity.getCertNum())) {
                    if (StringUtils.isNotBlank(entity.getZoneProvinceCode())) {
                        resultMap.put(zoneCodeKey, entity.getZoneProvinceCode());
                    }
                    if (StringUtils.isNotBlank(entity.getPregnancyArchiveId())) {
                        resultMap.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());
                    }

                    Map<String, Object> params = Maps.newHashMap();
                    params.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());//档案编号
                    params.put(sexKey, Constants.SEX_MAN);
                    User user = userBiz.getUserByCertNum(params);
                    if (user == null) {
                        logger.error("同步方法：syncUserPhysicalExamInfo  通过档案标号：" + entity.getPregnancyArchiveId() + " 和 性别 ：男" + "查询的user为null");
                    }

                    EntityParamsCommon entityParamsCommon = new EntityParamsCommon();
                    entityParamsCommon.setCertNum(entity.getCertNum());
                    entityParamsCommon.setEntity(entity);
                    entityParamsCommon.setTableNameEnum(BusicTableNameEnum.busi_husband_physical_exam);
                    entityParamsCommon.setUserId(user.getId());
                    Map<String, BaseRecordEntity> recordMap = busiConvertUtil.recordEntityConvertCommon(entityParamsCommon);
                    indicatorRecordService.saveIndicators(recordMap, true);
                } else {
                    logger.error("同步【男】体格检查表，查询实体为null,id为" + id);
                }
            } else if (sexTypeEnum == BusiPersonSexTypeEnum.busi_wife) {
                BusiWifePhysicalExam entity = busiWifePhysicalExamService.queryDataBySourceName(params_query);

                if (null != entity && StringUtils.isNotBlank(entity.getCertNum())) {

                    if (StringUtils.isNotBlank(entity.getZoneProvinceCode())) {
                        resultMap.put(zoneCodeKey, entity.getZoneProvinceCode());
                    }
                    if (StringUtils.isNotBlank(entity.getPregnancyArchiveId())) {
                        resultMap.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());
                    }
                    Map<String, Object> params = Maps.newHashMap();
                    params.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());//档案编号
                    params.put(sexKey, Constants.SEX_WOMAN);
                    User user = userBiz.getUserByCertNum(params);
                    if (user == null) {
                        logger.error("同步方法：syncUserPhysicalExamInfo  通过档案标号：" + entity.getPregnancyArchiveId() + " 和 性别 ：女" + "查询的user为null");

                    }
                    EntityParamsCommon entityParamsCommon = new EntityParamsCommon();
                    entityParamsCommon.setCertNum(entity.getCertNum());
                    entityParamsCommon.setEntity(entity);
                    entityParamsCommon.setTableNameEnum(BusicTableNameEnum.busi_wife_physical_exam);
                    entityParamsCommon.setUserId(user.getId());
                    Map<String, BaseRecordEntity> recordMap = busiConvertUtil.recordEntityConvertCommon(entityParamsCommon);
                    indicatorRecordService.saveIndicators(recordMap, true);
                } else {
                    logger.error("同步【女】体格检查表，查询实体为null,id为" + id);
                }
            }
        } catch (Exception e) {
            logger.error("同步个人体格检查信息id===" + id, e);
        }
        return resultMap;
    }

    /**
     * 同步妻子妇科B超检查结果信息
     *
     * @param id
     * @param eventType
     */

    public Map<String, Object> syncBusiWifeBValue(String id, CanalEntry.EventType eventType, String sourceName, String exampleName) {

        Map<String, Object> resultMap = Maps.newHashMap();

        getMap(id, sourceName, exampleName);

        //组装基本数据
        try {
            BusiWifeBValue entity = busiWifeBValueService.queryDataBySourceName(params_query);

            if (null != entity && StringUtils.isNotBlank(entity.getCertNum())) {
                if (StringUtils.isNotBlank(entity.getZoneProvinceCode())) {
                    resultMap.put(zoneCodeKey, entity.getZoneProvinceCode());
                }
                if (StringUtils.isNotBlank(entity.getPregnancyArchiveId())) {
                    resultMap.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());
                }

                Map<String, Object> params = Maps.newHashMap();
                params.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());//档案编号
                params.put(sexKey, Constants.SEX_WOMAN);
                User user = userBiz.getUserByCertNum(params);//TODO:根据身份证号获取个人信息
                if (user == null) {
                    logger.error("同步方法：syncBusiWifeBValue  通过档案标号：" + entity.getPregnancyArchiveId() + " 和 性别 ：女" + "查询的user为null");
                }
                EntityParamsCommon entityParamsCommon = new EntityParamsCommon();
                entityParamsCommon.setCertNum(entity.getCertNum());
                entityParamsCommon.setEntity(entity);
                entityParamsCommon.setTableNameEnum(BusicTableNameEnum.busi_wife_b_value);
                entityParamsCommon.setUserId(user.getId());
                Map<String, BaseRecordEntity> recordMap = busiConvertUtil.recordEntityConvertCommon(entityParamsCommon);
                indicatorRecordService.saveIndicators(recordMap, true);

            } else {
                logger.error("同步【女】B超检查结果信息表，查询实体为null,id为" + id);
            }
        } catch (Exception e) {
            logger.error("同步妻子妇科B超检查结果信息id===" + id, e);
        }
        return resultMap;
    }

    /**
     * 同步丈夫和妻子生殖系统
     *
     * @param id
     * @param sexTypeEnum
     */

    public Map<String, Object> syncBusiGenitalExamValue(String id, BusiPersonSexTypeEnum sexTypeEnum, String sourceName, String exampleName) {

        Map<String, Object> resultMap = Maps.newHashMap();

        getMap(id, sourceName, exampleName);
        try {
            //查询数据库--根据id获取数据
            if (sexTypeEnum == BusiPersonSexTypeEnum.busi_hasband) {
                BusiHusbandGenitalExamValue entity = busiHusbandGenitalExamValueService.queryDataBySourceName(params_query);

                if (null != entity && StringUtils.isNotBlank(entity.getCertNum())) {
                    if (StringUtils.isNotBlank(entity.getZoneProvinceCode())) {
                        resultMap.put(zoneCodeKey, entity.getZoneProvinceCode());
                    }
                    if (StringUtils.isNotBlank(entity.getPregnancyArchiveId())) {
                        resultMap.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());
                    }

                    Map<String, Object> params = Maps.newHashMap();
                    params.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());//档案编号
                    params.put(sexKey, Constants.SEX_MAN);
                    User user = userBiz.getUserByCertNum(params);
                    if (user == null) {
                        logger.error("同步方法：syncBusiGenitalExamValue  通过档案标号：" + entity.getPregnancyArchiveId() + " 和 性别 ：男" + "查询的user为null");

                    }
                    EntityParamsCommon entityParamsCommon = new EntityParamsCommon();
                    entityParamsCommon.setCertNum(entity.getCertNum());
                    entityParamsCommon.setEntity(entity);
                    entityParamsCommon.setTableNameEnum(BusicTableNameEnum.busi_husband_genital_exam_value);
                    entityParamsCommon.setUserId(user.getId());
                    Map<String, BaseRecordEntity> recordMap = busiConvertUtil.recordEntityConvertCommon(entityParamsCommon);
                    indicatorRecordService.saveIndicators(recordMap, true);
                } else {
                    logger.error("同步【男】生殖系统检查表，查询实体为null,id为" + id);
                }
            } else if (sexTypeEnum == BusiPersonSexTypeEnum.busi_wife) {
                BusiWifeGenitalExamValue entity = busiWifeGenitalExamValueService.queryDataBySourceName(params_query);

                if (null != entity && StringUtils.isNotBlank(entity.getCertNum())) {
                    if (StringUtils.isNotBlank(entity.getZoneProvinceCode())) {
                        resultMap.put(zoneCodeKey, entity.getZoneProvinceCode());
                    }
                    if (StringUtils.isNotBlank(entity.getPregnancyArchiveId())) {
                        resultMap.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());
                    }

                    Map<String, Object> params = Maps.newHashMap();
                    params.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());//档案编号
                    params.put(sexKey, Constants.SEX_WOMAN);
                    User user = userBiz.getUserByCertNum(params);
                    if (user == null) {
                        logger.error("同步方法：syncBusiGenitalExamValue  通过档案标号：" + entity.getPregnancyArchiveId() + " 和 性别 ：女" + "查询的user为null");
                    }
                    EntityParamsCommon entityParamsCommon = new EntityParamsCommon();
                    entityParamsCommon.setCertNum(entity.getCertNum());
                    entityParamsCommon.setEntity(entity);
                    entityParamsCommon.setTableNameEnum(BusicTableNameEnum.busi_wife_genital_exam_value);
                    entityParamsCommon.setUserId(user.getId());
                    Map<String, BaseRecordEntity> recordMap = busiConvertUtil.recordEntityConvertCommon(entityParamsCommon);
                    indicatorRecordService.saveIndicators(recordMap, true);
                } else {
                    logger.error("同步【女】生殖系统检查表，查询实体为null,id为" + id);
                }
            }
        } catch (Exception e) {
            logger.error("同步丈夫和妻子生殖系统出错id===" + id, e);
        }
        return resultMap;
    }


    /**
     * @param
     * @return
     * @throws
     * @Description: 血红蛋白同步表
     * @date 2016/10/24 15:32
     */
    public Map<String, Object> syncBusiHemoglobin(String id, BusiPersonSexTypeEnum sexTypeEnum, String sourceName, String exampleName) {
        Map<String, Object> resultMap = Maps.newHashMap();

        getMap(id, sourceName, exampleName);

        try {
            //查询数据库--根据id获取数据
            if (sexTypeEnum == BusiPersonSexTypeEnum.busi_hasband) {
                BusiHusbandHemoglobin entity = busiHusbandHemoglobinService.queryDataBySourceName(params_query);
                if (null != entity && StringUtils.isNotBlank(entity.getCertNum())) {
                    if (StringUtils.isNotBlank(entity.getZoneProvinceCode())) {
                        resultMap.put(zoneCodeKey, entity.getZoneProvinceCode());
                    }
                    if (StringUtils.isNotBlank(entity.getPregnancyArchiveId())) {
                        resultMap.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());
                    }

                    Map<String, Object> params = Maps.newHashMap();
                    params.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());//档案编号
                    params.put(sexKey, Constants.SEX_MAN);
                    User user = userBiz.getUserByCertNum(params);
                    if (user == null) {
                        logger.error("同步方法：syncBusiHemoglobin  通过档案标号：" + entity.getPregnancyArchiveId() + " 和 性别 ：男" + "查询的user为null");
                    }
                    EntityParamsCommon entityParamsCommon = new EntityParamsCommon();
                    entityParamsCommon.setCertNum(entity.getCertNum());
                    entityParamsCommon.setEntity(entity);
                    entityParamsCommon.setTableNameEnum(BusicTableNameEnum.busi_husband_hemoglobin);
                    entityParamsCommon.setUserId(user.getId());
                    Map<String, BaseRecordEntity> recordMap = busiConvertUtil.recordEntityConvertCommon(entityParamsCommon);
                    indicatorRecordService.saveIndicators(recordMap, true);
                } else {
                    logger.error("同步【男】血红蛋白同步表，查询实体为null,id为" + id);
                }
            } else if (sexTypeEnum == BusiPersonSexTypeEnum.busi_wife) {
                BusiWifeHemoglobin entity = busiWifeHemoglobinService.queryDataBySourceName(params_query);

                if (null != entity && StringUtils.isNotBlank(entity.getCertNum())) {
                    if (StringUtils.isNotBlank(entity.getZoneProvinceCode())) {
                        resultMap.put(zoneCodeKey, entity.getZoneProvinceCode());
                    }
                    if (StringUtils.isNotBlank(entity.getPregnancyArchiveId())) {
                        resultMap.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());
                    }

                    Map<String, Object> params = Maps.newHashMap();
                    params.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());//档案编号
                    params.put(sexKey, Constants.SEX_WOMAN);
                    User user = userBiz.getUserByCertNum(params);

                    if (user == null) {
                        logger.error("同步方法：syncBusiHemoglobin  通过档案标号：" + entity.getPregnancyArchiveId() + " 和 性别 ：女" + "查询的user为null");
                    }
                    EntityParamsCommon entityParamsCommon = new EntityParamsCommon();
                    entityParamsCommon.setCertNum(entity.getCertNum());
                    entityParamsCommon.setEntity(entity);
                    entityParamsCommon.setTableNameEnum(BusicTableNameEnum.busi_wife_hemoglobin);
                    entityParamsCommon.setUserId(user.getId());
                    Map<String, BaseRecordEntity> recordMap = busiConvertUtil.recordEntityConvertCommon(entityParamsCommon);
                    indicatorRecordService.saveIndicators(recordMap, true);
                } else {
                    logger.error("同步【女】血红蛋白同步表，查询实体为null,id为" + id);
                }
            }
        } catch (Exception e) {
            logger.error("同步血红蛋白分析出错id===" + id, e);
        }
        return resultMap;
    }


    /**
     * @param
     * @return
     * @throws
     * @Title: 妻子基因检测值表 和丈夫基因检测值表
     * @date 2016/10/24 15:32
     */
    public Map<String, Object> syncBusiWifeGene(String id, BusiPersonSexTypeEnum sexTypeEnum, String sourceName, String exampleName) {
        Map<String, Object> resultMap = Maps.newHashMap();

        getMap(id, sourceName, exampleName);
        try {
            //查询数据库--根据id获取数据
            if (sexTypeEnum == BusiPersonSexTypeEnum.busi_hasband) {
                BusiHusbandGene entity = busiHusbandGeneService.queryDataBySourceName(params_query);
                if (null != entity && StringUtils.isNotBlank(entity.getCertNum())) {
                    if (StringUtils.isNotBlank(entity.getZoneProvinceCode())) {
                        resultMap.put(zoneCodeKey, entity.getZoneProvinceCode());
                    }
                    if (StringUtils.isNotBlank(entity.getPregnancyArchiveId())) {
                        resultMap.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());
                    }

                    Map<String, Object> params = Maps.newHashMap();
                    params.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());//档案编号
                    params.put(sexKey, Constants.SEX_MAN);
                    User user = userBiz.getUserByCertNum(params);
                    if (user == null) {
                        logger.error("同步方法：syncBusiWifeGene  通过档案标号：" + entity.getPregnancyArchiveId() + " 和 性别 ：男" + "查询的user为null");
                    }
                    EntityParamsCommon entityParamsCommon = new EntityParamsCommon();
                    entityParamsCommon.setCertNum(entity.getCertNum());
                    entityParamsCommon.setEntity(entity);
                    entityParamsCommon.setTableNameEnum(BusicTableNameEnum.busi_husband_gene);
                    entityParamsCommon.setUserId(user.getId());
                    Map<String, BaseRecordEntity> recordMap = busiConvertUtil.recordEntityConvertCommon(entityParamsCommon);
                    indicatorRecordService.saveIndicators(recordMap, true);
                } else {
                    logger.error("同步【男】基因检测值表，查询实体为null,id为" + id);
                }
            } else if (sexTypeEnum == BusiPersonSexTypeEnum.busi_wife) {
                BusiWifeGene entity = busiWifeGeneService.queryDataBySourceName(params_query);

                if (null != entity && StringUtils.isNotBlank(entity.getCertNum())) {
                    if (StringUtils.isNotBlank(entity.getZoneProvinceCode())) {
                        resultMap.put(zoneCodeKey, entity.getZoneProvinceCode());
                    }
                    if (StringUtils.isNotBlank(entity.getPregnancyArchiveId())) {
                        resultMap.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());
                    }

                    Map<String, Object> params = Maps.newHashMap();
                    params.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());//档案编号
                    params.put(sexKey, Constants.SEX_WOMAN);
                    User user = userBiz.getUserByCertNum(params);

                    if (user == null) {
                        logger.error("同步方法：syncBusiWifeGene  通过档案标号：" + entity.getPregnancyArchiveId() + " 和 性别 ：女" + "查询的user为null");
                    }
                    EntityParamsCommon entityParamsCommon = new EntityParamsCommon();
                    entityParamsCommon.setCertNum(entity.getCertNum());
                    entityParamsCommon.setEntity(entity);
                    entityParamsCommon.setTableNameEnum(BusicTableNameEnum.busi_wife_gene);
                    entityParamsCommon.setUserId(user.getId());
                    Map<String, BaseRecordEntity> recordMap = busiConvertUtil.recordEntityConvertCommon(entityParamsCommon);
                    indicatorRecordService.saveIndicators(recordMap, true);
                } else {
                    logger.error("同步【女】基因检测值表，查询实体为null,id为" + id);
                }
            }
        } catch (Exception e) {
            logger.error("同步妻子基因检测值表 和丈夫基因检测值表出错 id====" + id, e);
        }
        return resultMap;
    }


    /**
     * @param
     * @return
     * @throws
     * @Title: 临床检查结果值（妻子） 和 床检查结果值（丈夫）
     * @Description: 血红蛋白同步表
     * @date 2016/10/24 15:32
     */
    public Map<String, Object> syncBusiExamValue(String id, BusiPersonSexTypeEnum sexTypeEnum, String sourceName, String exampleName) {
        Map<String, Object> resultMap = Maps.newHashMap();
        BusiExamValueScopeCommon busiExamValueScopeCommon = new BusiExamValueScopeCommon();

        getMap(id, sourceName, exampleName);
        try {
            //查询数据库--根据id获取数据
            if (sexTypeEnum == BusiPersonSexTypeEnum.busi_hasband) {
                BusiExamValueB entity = busiExamValueBService.queryDataBySourceName(params_query);
                if (null != entity) {
                    params_query.put(pregnancyArchiveIdKey,entity.getPregnancyArchiveId());
                    BusiExamValueBScope entityB = busiExamValueBScopeService.queryDataBySourceName(params_query);
                    logger.info("[丈夫]entryB:"+entityB);
                    busiExamValueScopeCommon.setEntity(entityB);
                    busiExamValueScopeCommon.setBusiPersonSexTypeEnum(BusiPersonSexTypeEnum.busi_hasband);

                    if (StringUtils.isNotBlank(entity.getZoneProvinceCode())) {
                        resultMap.put(zoneCodeKey, entity.getZoneProvinceCode());
                    }
                    if (StringUtils.isNotBlank(entity.getPregnancyArchiveId())) {
                        resultMap.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());
                    }
                    Map<String, Object> params = Maps.newHashMap();
                    params.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());//档案编号
                    params.put(sexKey, Constants.SEX_MAN);
                    User user = userBiz.getUserByCertNum(params);
                    if (user == null) {
                        logger.error("同步方法：syncBusiExamValue 通过档案标号：" + entity.getPregnancyArchiveId() + " 和 性别 ：女" + " 查询的user为null");
                    }
                    EntityParamsCommon entityParamsCommon = new EntityParamsCommon();
                    entityParamsCommon.setCertNum(entity.getCertNum());
                    entityParamsCommon.setEntity(entity);
                    entityParamsCommon.setTableNameEnum(BusicTableNameEnum.busi_exam_value_b);
                    entityParamsCommon.setUserId(user.getId());
                    Map<String, BaseRecordEntity> recordMap = busiConvertUtil.recordEntityBusiExam(entityParamsCommon,busiExamValueScopeCommon);
                    indicatorRecordService.saveIndicators(recordMap, true);
                } else {
                    logger.error("同步【丈夫】临床检查结果值表，查询实体为null,id为" + id);
                }
            } else if (sexTypeEnum == BusiPersonSexTypeEnum.busi_wife) {
                BusiExamValueW entity = busiExamValueWService.queryDataBySourceName(params_query);

                if (null != entity) {
                    params_query.put(pregnancyArchiveIdKey,entity.getPregnancyArchiveId());
                    BusiExamValueWScope entityW = busiExamValueWScopeService.queryDataBySourceName(params_query);
                    logger.info("[妻子]entryW:"+entityW);
                    busiExamValueScopeCommon.setEntity(entityW);
                    busiExamValueScopeCommon.setBusiPersonSexTypeEnum(BusiPersonSexTypeEnum.busi_wife);

                    if (StringUtils.isNotBlank(entity.getZoneProvinceCode())) {
                        resultMap.put(zoneCodeKey, entity.getZoneProvinceCode());
                    }
                    if (StringUtils.isNotBlank(entity.getPregnancyArchiveId())) {
                        resultMap.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());
                    }

                    Map<String, Object> params = Maps.newHashMap();
                    params.put(pregnancyArchiveIdKey, entity.getPregnancyArchiveId());//档案编号
                    params.put(sexKey, Constants.SEX_WOMAN);
                    User user = userBiz.getUserByCertNum(params);

                    if (user == null) {
                        logger.error("同步方法：syncBusiExamValue 通过档案标号：" + entity.getPregnancyArchiveId() + " 和 性别 ：女" + " 查询的user为null");
                    }
                    EntityParamsCommon entityParamsCommon = new EntityParamsCommon();
                    entityParamsCommon.setCertNum(entity.getCertNum());
                    entityParamsCommon.setEntity(entity);
                    entityParamsCommon.setTableNameEnum(BusicTableNameEnum.busi_exam_value_w);
                    entityParamsCommon.setUserId(user.getId());
                    Map<String, BaseRecordEntity> recordMap = busiConvertUtil.recordEntityBusiExam(entityParamsCommon,busiExamValueScopeCommon);;
                    indicatorRecordService.saveIndicators(recordMap, true);
                } else {
                    logger.error("同步【妻子】临床检查结果值表，查询实体为null,id为" + id);
                }
            }
        } catch (Exception e) {
            logger.error("同步妻子ExamValue出错id===" + id, e);
            e.printStackTrace();
        }
        return resultMap;
    }

    /**
     * 通用获取参数方法
     *
     * @param id
     * @param sourceName
     * @param source
     */
    public void getMap(String id, String sourceName, String source) {
        params_query.put(idKey, id);
        params_query.put(sourceNameKey, "`" + sourceName + "`");
        params_query.put(sourceKey, source);
    }

}
