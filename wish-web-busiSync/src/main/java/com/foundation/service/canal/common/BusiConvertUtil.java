package com.foundation.service.canal.common;

import com.foundation.common.bean.Constants;
import com.foundation.common.utils.Pinyin4jUtil;
import com.foundation.common.utils.Reflections;
import com.foundation.common.utils.StringUtils;
import com.foundation.dao.entity.archive.DistArchiveIndicator;
import com.foundation.dao.entity.archive.FamilyArchive;
import com.foundation.dao.entity.base.DictExamItemRange;
import com.foundation.dao.entity.sync.BusiHusbandBasicInfo;
import com.foundation.dao.entity.sync.BusiPregnancyArchive;
import com.foundation.dao.entity.sync.BusiWifeBasicInfo;
import com.foundation.dao.entity.sys.Role;
import com.foundation.dao.entity.sys.User;

import com.foundation.mongo.entity.record.BaseRecordEntity;
import com.foundation.mongo.entity.record.Indicator;
import com.foundation.service.dist.service.IDistArchiveIndicatorService;
import com.foundation.service.tjxtSync.service.IBusiExamValueBScopeService;
import com.foundation.service.tjxtSync.service.IBusiExamValueWScopeService;
import com.foundation.service.tjxtSync.service.IDictExamItemRangeService;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @author fqh
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 业务类转化Util
 * @date ${date} ${time}
 */
@Service
public class BusiConvertUtil {

    static Logger logger = LoggerFactory.getLogger(BusiConvertUtil.class);

    private static String unCheckedValue = "0";
    private static String checkValue = "1";
    private static Set<String> colNameSetB = Sets.newConcurrentHashSet();
    private static Set<String> colNameSetW = Sets.newConcurrentHashSet();
    private static final int colLengthB = 101;
    private static String idKey = "id";
    @Autowired
    private IDistArchiveIndicatorService dictService;

    @Autowired
    private IBusiExamValueWScopeService busiExamValueWScopeService;

    @Autowired
    private IBusiExamValueBScopeService busiExamValueBScopeService;

    @Autowired
    private IDictExamItemRangeService dictExamItemRangeService;

    static {
        for (int i = 1; i < colLengthB; i++) {
            colNameSetB.add("b" + i);
            colNameSetW.add("w" + i);
        }
    }

    /**
     * 转换家庭档案表
     *
     * @param busiArchive
     * @return
     */
    public FamilyArchive familyArchiveConvert(BusiPregnancyArchive busiArchive) {
        FamilyArchive archive = new FamilyArchive();
        archive.setPregnancyArchiveId(busiArchive.getPregnancyArchiveId());
        archive.setHusbandCertNum(busiArchive.getHusbandCertNum());
        archive.setHusbandName(busiArchive.getHusbandName());
        archive.setWifeCertNum(busiArchive.getWifeCertNum());
        archive.setWifeName(busiArchive.getWifeName());
        archive.setServiceZone(busiArchive.getServiceOrganizationName());
        archive.setServiceZoneCode(busiArchive.getServiceZoneCode());
        archive.setInformedConsentSigned(busiArchive.getInformedConsentSigned());
        archive.setProvinceCode(busiArchive.getProvinceCode());
        return archive;
    }

    /**
     * 转换普通用户(丈夫)
     *
     * @param info
     * @return
     */
    public User userHusbandConvert(BusiHusbandBasicInfo info) {
        User user = new User();
        user.setName(info.getName());
        user.setSex(Constants.SEX_MAN);
        user.setUserType(Constants.UserRole.Common);
        user.setLoginName(Pinyin4jUtil.getPinYin(info.getName()));
        //user.setPassword(PwdSha1Util.entryptPassword("123456"));
        user.setAge(info.getAge());
        user.setAddressCity(StringUtils.isNotBlank(info.getAddressCity()) ? info.getAddressCity() : "");
        user.setAddressCounty(StringUtils.isNotBlank(info.getAddressCounty()) ? info.getAddressCounty() : "");
        user.setCardNo(StringUtils.isNotBlank(info.getCertificateNumber()) ? info.getCertificateNumber() : "");
        user.setCertificateNumber(StringUtils.isNotBlank(info.getCertificateNumber()) ? info.getCertificateNumber() : "");
        user.setNation(Constants.NationTypeEnum.getNationValueByKey(info.getNation() + ""));
        user.setAddressProvince(StringUtils.isNotBlank(info.getAddressProvince()) ? info.getAddressProvince() : "");
        user.setAddressTown(StringUtils.isNotBlank(info.getAddressTown()) ? info.getAddressTown() : "");
        user.setAddressVillage(StringUtils.isNotBlank(info.getAddressVillage()) ? info.getAddressVillage() : "");
        user.setCertificateType(info.getCertificateType());
        user.setEducation(info.getEducation());//教育
        user.setOccupation(info.getOccupation());//职业
        user.setHukouCity(StringUtils.isNotBlank(info.getHukouCity()) ? info.getHukouCity() : "");
        user.setHukouCounty(StringUtils.isNotBlank(info.getHukouCounty()) ? info.getHukouCounty() : "");
        user.setHukouProvince(StringUtils.isNotBlank(info.getHukouProvince()) ? info.getHukouProvince() : "");
        user.setHukouTown(StringUtils.isNotBlank(info.getHukouTown()) ? info.getHukouTown() : "");
        user.setHukouVillage(StringUtils.isNotBlank(info.getHukouVillage()) ? info.getHukouVillage() : "");
        user.setPregnancyArchiveId(info.getPregnancyArchiveId());
        if (info.getBirthday() != null) {
            user.setBirthday(info.getBirthday());
        }
        if (info.getMarryDate() != null) {
            user.setMarryDate(info.getMarryDate());
        }
        if (null != info.getHukouType()) {
            user.setHukouType(info.getHukouType());
        }
        user.setPhone(StringUtils.isNotBlank(info.getPhoneNum()) ? info.getPhoneNum() : "");
        user.setPostCode(StringUtils.isNotBlank(info.getPostCode()) ? info.getPostCode() : "");

        //TODO 为用户设置一个普通角色
        Role role = new Role();
        role.setEnname("d");
        role.setOfficeIds("2");
        List<Role> roleList = new ArrayList<Role>();
        roleList.add(role);
        user.setRoleList(roleList);
        return user;
    }

    /**
     * 转换普通用户（妻子）
     *
     * @param info
     * @return
     */
    public User userWifeConvert(BusiWifeBasicInfo info) {
        User user = new User();
        user.setName(info.getName());
        user.setSex(Constants.SEX_WOMAN);
        user.setUserType(Constants.UserRole.Common);
        user.setLoginName(Pinyin4jUtil.getPinYin(info.getName()));
        //user.setPassword(PwdSha1Util.entryptPassword("123456"));
        user.setAge(info.getAge());
        user.setAddressCity(StringUtils.isNotBlank(info.getAddressCity()) ? info.getAddressCity() : "");
        user.setAddressCounty(StringUtils.isNotBlank(info.getAddressCounty()) ? info.getAddressCounty() : "");
        user.setCardNo(StringUtils.isNotBlank(info.getCertificateNumber()) ? info.getCertificateNumber() : "");
        user.setCertificateNumber(StringUtils.isNotBlank(info.getCertificateNumber()) ? info.getCertificateNumber() : "");
        user.setNation(Constants.NationTypeEnum.getNationValueByKey("" + info.getNation()));
        user.setAddressProvince(StringUtils.isNotBlank(info.getAddressProvince()) ? info.getAddressProvince() : "");
        user.setAddressTown(StringUtils.isNotBlank(info.getAddressTown()) ? info.getAddressTown() : "");
        user.setAddressVillage(StringUtils.isNotBlank(info.getAddressVillage()) ? info.getAddressVillage() : "");
        user.setCertificateType(info.getCertificateType());
        user.setEducation(info.getEducation());//教育
        user.setOccupation(info.getOccupation());//职业
        user.setHukouCity(StringUtils.isNotBlank(info.getHukouCity()) ? info.getHukouCity() : "");
        user.setHukouCounty(StringUtils.isNotBlank(info.getHukouCounty()) ? info.getHukouCounty() : "");
        user.setHukouProvince(StringUtils.isNotBlank(info.getHukouProvince()) ? info.getHukouProvince() : "");
        user.setHukouTown(StringUtils.isNotBlank(info.getHukouTown()) ? info.getHukouTown() : "");
        user.setHukouVillage(StringUtils.isNotBlank(info.getHukouVillage()) ? info.getHukouVillage() : "");
        user.setPregnancyArchiveId(info.getPregnancyArchiveId());
        if (info.getBirthday() != null) {
            user.setBirthday(info.getBirthday());
        }
        if (info.getMarryDate() != null) {
            user.setMarryDate(info.getMarryDate());
        }
        if (null != info.getHukouType()) {
            user.setHukouType(info.getHukouType());
        }
        user.setPhone(StringUtils.isNotBlank(info.getPhoneNum()) ? info.getPhoneNum() : "");
        user.setPostCode(StringUtils.isNotBlank(info.getPostCode()) ? info.getPostCode() : "");
        //TODO 为用户设置一个普通角色
        Role role = new Role();
        role.setEnname("d");
        role.setOfficeIds("2");
        List<Role> roleList = new ArrayList<Role>();
        roleList.add(role);
        user.setRoleList(roleList);
        return user;
    }


    /**
     * 获取字典数据
     *
     * @param tableName
     * @return
     * @throws Exception
     */
    public List<DistArchiveIndicator> getDistArchiveIndicator(String tableName) throws Exception {
        return dictService.queryByTableName(tableName);
    }

    /**
     * BusiExam 转换实体
     *
     * @param entityParamsCommon
     * @return
     * @throws Exception
     */
    public Map<String, BaseRecordEntity> recordEntityBusiExam(EntityParamsCommon entityParamsCommon, BusiExamValueScopeCommon busiExamValueScopeCommon) throws Exception {
        String talbleName = entityParamsCommon.getTableNameEnum().getTableName();
        List<DistArchiveIndicator> distList = getDistArchiveIndicator(talbleName);//TODO://加缓存存储字典数据

        Map<String, BaseRecordEntity> entityMap = Maps.newHashMap();
        if (!CollectionUtils.isEmpty(distList)) {
            Set<String> columnSet = Sets.newHashSet();
            for (DistArchiveIndicator dist : distList) {
                String columnName = dist.getColumnName();
                if (dist.getIsChar() == SyncConstants.ISChar_YES && columnSet.contains(columnName)) {
                    continue;
                }
                columnSet.add(columnName);
                try {
                    Boolean flag = true;
                    //补领字段为0或者1的情况
                    if (dist.getIsChar().intValue() == SyncConstants.ISChar_YES
                            && SupplementZeroColumnEnum.isContainsTable(talbleName)) {//包含这些表的话
                        //查询当前表与字典表列是否存在非零的枚举类型
                        List<SupplementZeroColumnEnum> zeroColumnEnumList = SupplementZeroColumnEnum.getTablesColumnEnumList(talbleName, columnName);
                        for (SupplementZeroColumnEnum zeroColumnEnum : zeroColumnEnumList) {
                            try {
                                Object zeroValue = Reflections.convertAndInvokeGetter(entityParamsCommon.getEntity(), zeroColumnEnum.getZeroColumnName());
                                if (zeroValue != null && zeroValue.toString().equals("2")) {//0的情况，后续都要反选
                                    flag = false;
                                    //所有反选指标的值设置为0
                                    entityMap.putAll(getAllUnCheckedRecordEntityMap(zeroColumnEnum.getColumnName(), entityParamsCommon.getUserId(), entityParamsCommon.getCertNum()));
                                }
                            } catch (Exception e) {
                                logger.error("同步临床检验报错", e);
                                e.printStackTrace();
                            }
                        }
                    }
                    //当前列已经反选
                    if (flag) {
                        Object columnValue = Reflections.convertAndInvokeGetter(entityParamsCommon.getEntity(), columnName);

                        //同时获取 busi_exam_value_b_scope 或者 busi_exam_value_w_scope 相应字段的id
                        if (dist.getIsChar().intValue() == SyncConstants.ISChar_YES) {
                            //其他正常情况（非补零情况---补零字段为0或者1）
                            if (columnValue != null) {
                                String[] columnValArr = (columnValue + "").toString().split(SyncConstants.mutilStrSplitChar);
                                if (columnValArr != null && columnValArr.length > 0) {
                                    entityMap.putAll(getCharColumnRecordEntityMap(entityParamsCommon.getUserId(), entityParamsCommon.getCertNum(), columnName, columnValArr));
                                }
                            }
                            continue;
                        } else if (dist.getIsChar() == SyncConstants.ISChar_NO) {
                            if (columnValue == null) {
                                continue;
                            }
                            Indicator indicator = new Indicator();
                            indicator.setUserId(entityParamsCommon.getUserId());
                            indicator.setCertNum(entityParamsCommon.getCertNum());
                            indicator.setCode(dist.getCode());
                            indicator.setName(dist.getName());
                            indicator.setValue("" + columnValue);
                            if (null != busiExamValueScopeCommon.getEntity() && !columnName.equalsIgnoreCase("is_hemoglobin")) {//busi_exam_value_b busi_exam_value_w 里的is_hemoglobin 不存在scope表里面，所以这里会报错
                                try {
                                    Object rand_id = Reflections.convertAndInvokeGetter(busiExamValueScopeCommon.getEntity(), columnName);
                                    if (null != rand_id && !"".equals(rand_id)) {
                                        getIndicator(indicator, rand_id, columnName);
                                    }
                                } catch (Exception e) {
                                    logger.error("男or女 临床检验表从sope表里面转换异常,表名：" + entityParamsCommon.getTableNameEnum().getTableName() + " 同步业务用户证件号码：" + entityParamsCommon.getCertNum(), e);
                                }
                            }
                            entityMap.put(dist.getCode(), indicator);
                        }
                    }
                } catch (Exception e) {
                    logger.error("业务表通用转换指标发送异常,表名：" + entityParamsCommon.getTableNameEnum().getTableName() + " 同步业务用户证件号码：" + entityParamsCommon.getCertNum(), e);
                    e.printStackTrace();
                }
            }
        }
        return entityMap;
    }


    /**
     * 通用实体转换
     *
     * @param entityParamsCommon
     * @return
     * @throws Exception
     */
    public Map<String, BaseRecordEntity> recordEntityConvertCommon(EntityParamsCommon entityParamsCommon) throws Exception {
        String talbleName = entityParamsCommon.getTableNameEnum().getTableName();
        List<DistArchiveIndicator> distList = getDistArchiveIndicator(talbleName);//TODO://加缓存存储字典数据

        Map<String, BaseRecordEntity> entityMap = Maps.newHashMap();
        if (!CollectionUtils.isEmpty(distList)) {
            Set<String> columnSet = Sets.newHashSet();
            for (DistArchiveIndicator dist : distList) {
                String columnName = dist.getColumnName();
                if (dist.getIsChar() == SyncConstants.ISChar_YES && columnSet.contains(columnName)) {
                    continue;
                }
                columnSet.add(columnName);

                try {
                    Boolean flag = true;
                    //补领字段为0或者1的情况
                    if (dist.getIsChar().intValue() == SyncConstants.ISChar_YES
                            && SupplementZeroColumnEnum.isContainsTable(talbleName)) {//包含这些表的话
                        //查询当前表与字典表列是否存在非零的枚举类型
                        List<SupplementZeroColumnEnum> zeroColumnEnumList = SupplementZeroColumnEnum.getTablesColumnEnumList(talbleName, columnName);
                        for (SupplementZeroColumnEnum zeroColumnEnum : zeroColumnEnumList) {
                            try {
                                String zeroColumnName = zeroColumnEnum.getZeroColumnName();
                                Object zeroValue = Reflections.convertAndInvokeGetter(entityParamsCommon.getEntity(), zeroColumnName);
                                logger.info("one before---------ZeroColumn value:" + zeroValue);
                                /**
                                 *孕检系统 判断标准  是1否2  正常0异常1
                                 * 除了is_intelligence 这个字段是正常0 异常1 这种判断以外，孕检系统用于判断 是1否2
                                 * 所以这里判断如下：
                                 * zeroValue.toString().equals("2") || (zeroColumnName.equals("is_intelligence")&&zeroValue.toString().equals("0"))
                                 */
                                if (zeroValue != null && (zeroValue.toString().equals("2") || (
                                        zeroColumnName.equals("is_intelligence") && zeroValue.toString().equals("0")
                                ))) {//2的情况,或者是is_intelligence列，并且，后续都要反选
                                    flag = false;
                                    logger.info("one if after-所有反选指标的值设置为0-----ZeroColumn value:" + zeroValue);
                                    //所有反选指标的值设置为0
                                    entityMap.putAll(getAllUnCheckedRecordEntityMap(zeroColumnEnum.getColumnName(), entityParamsCommon.getUserId(), entityParamsCommon.getCertNum()));
                                }
                            } catch (Exception e) {
                                logger.error("业务表通用转换指标发送异常,表名：" + entityParamsCommon.getTableNameEnum().getTableName() + " 同步业务用户证件号码：" + entityParamsCommon.getCertNum(), e);
                                e.printStackTrace();
                            }
                        }
                    }
                    //当前列已经反选
                    if (flag) {
                        Object columnValue = Reflections.convertAndInvokeGetter(entityParamsCommon.getEntity(), columnName);
                        logger.info("two---------Column value:" + columnValue);
                        if (dist.getIsChar().intValue() == SyncConstants.ISChar_YES) {
                            //其他正常情况（非补零情况---补零字段为0或者1）
                            if (columnValue != null) {
                                String[] columnValArr = (columnValue + "").toString().split(SyncConstants.mutilStrSplitChar);
                                logger.info("two---isChar Yes----ColumnArr value :" + Arrays.toString(columnValArr));
                                if (columnValArr != null && columnValArr.length > 0) {
                                    entityMap.putAll(getCharColumnRecordEntityMap(entityParamsCommon.getUserId(), entityParamsCommon.getCertNum(), columnName, columnValArr));
                                }
                            }
                            continue;
                        } else if (dist.getIsChar() == SyncConstants.ISChar_NO) {
                            if (columnValue == null) {
                                continue;
                            }
                            Indicator indicator = new Indicator();
                            indicator.setUserId(entityParamsCommon.getUserId());
                            indicator.setCertNum(entityParamsCommon.getCertNum());
                            indicator.setCode(dist.getCode());
                            indicator.setName(dist.getName());
                            indicator.setValue("" + columnValue);
                            entityMap.put(dist.getCode(), indicator);
                        }
                    }
                } catch (Exception e) {
                    logger.error("业务表通用转换指标发送异常,表名：" + entityParamsCommon.getTableNameEnum().getTableName() + " 同步业务用户证件号码：" + entityParamsCommon.getCertNum(), e);
                    e.printStackTrace();
                }
            }
        }
        return entityMap;
    }

    /**
     * 获取所有反选的列。组装成指标Map
     *
     * @param columnName
     * @return
     */
    private Map<String, BaseRecordEntity> getAllUnCheckedRecordEntityMap(String columnName, String userId, String certNum) {
        Map<String, BaseRecordEntity> entityMap = Maps.newHashMap();
       /* is_family_disease_wife("is_family_disease","家族病史，妻子一般情况表里family_disease字段","busi_wife_general_situation","family_disease"),
                is_family_disease_husband("is_family_disease","家族病史，丈夫一般情况表里family_disease字段","busi_husband_general_situation","family_disease"),
                is_andropathy("is_andropathy","男性病,男一般情况表andropathy字段","busi_husband_general_situation","andropathy"),
                check_status("check_status","妻子子宫情况 妻子B超值表 b_detail字段","busi_wife_b_value","b_detail"),
                is_gynecopathy("is_gynecopathy","女方患有不孕不育症与女方患有子宫附件炎 妻子一般情况表gynecopathy字段","busi_wife_general_situation","gynecopathy"),
                is_had_disease_wife("is_had_disease","疾病史 男女一般情况表里 suffered_disease","busi_wife_general_situation","suffered_disease"),
                is_had_disease_husband("is_had_disease","疾病史 男女一般情况表里 suffered_disease","busi_husband_general_situation","suffered_disease"),
                is_harmful_environment_wife("is_harmful_environment","有害环境,丈夫妻子一般情况表harmful_environment字段","busi_wife_general_situation","harmful_environment"),
                is_harmful_environment_husband("is_harmful_environment","有害环境,丈夫妻子一般情况表harmful_environment字段","busi_husband_general_situation","harmful_environment"),
                is_pre_disease("is_pre_disease","是否有妊娠期血压糖尿病 妻子一般情况表 pre_disease_value","busi_wife_general_situation","pre_disease_value");*/
        switch (columnName) {
            case "andropathy":
                //将没有被选中的复选框项目 setValue 0
                BusiMulitiKeyValue.Andropathy[] unCheckedList = BusiMulitiKeyValue.Andropathy.values();
                for (BusiMulitiKeyValue.Andropathy vo : unCheckedList) {
                    Indicator indicator = new Indicator();
                    indicator.setUserId(userId);
                    indicator.setCertNum(certNum);
                    indicator.setCode(vo.getCode());
                    indicator.setName(vo.getName());
                    indicator.setValue(unCheckedValue);
                    entityMap.put(vo.getCode(), indicator);
                }
                break;
            case "b_detail":
                ////将没有被选中的复选框项目 setValue 0
                BusiMulitiKeyValue.BDetail[] unCheckedList1 = BusiMulitiKeyValue.BDetail.values();
                for (BusiMulitiKeyValue.BDetail vo : unCheckedList1) {
                    Indicator indicator = new Indicator();
                    indicator.setUserId(userId);
                    indicator.setCertNum(certNum);
                    indicator.setCode(vo.getCode());
                    indicator.setName(vo.getName());
                    indicator.setValue(unCheckedValue);
                    entityMap.put(vo.getCode(), indicator);
                }
                break;
            case "gynecopathy":
                ////将没有被选中的复选框项目 setValue 0
                BusiMulitiKeyValue.Gynecopathy[] unCheckedList2 = BusiMulitiKeyValue.Gynecopathy.values();
                for (BusiMulitiKeyValue.Gynecopathy vo : unCheckedList2) {
                    Indicator indicator = new Indicator();
                    indicator.setUserId(userId);
                    indicator.setCertNum(certNum);
                    indicator.setCode(vo.getCode());
                    indicator.setName(vo.getName());
                    indicator.setValue(unCheckedValue);
                    entityMap.put(vo.getCode(), indicator);
                }
                break;
            case "family_disease":
                ////将没有被选中的复选框项目 setValue 0
                BusiMulitiKeyValue.FamilyDisease[] unCheckedList3 = BusiMulitiKeyValue.FamilyDisease.values();
                for (BusiMulitiKeyValue.FamilyDisease vo : unCheckedList3) {
                    Indicator indicator = new Indicator();
                    indicator.setUserId(userId);
                    indicator.setCertNum(certNum);
                    indicator.setCode(vo.getCode());
                    indicator.setName(vo.getName());
                    indicator.setValue(unCheckedValue);
                    entityMap.put(vo.getCode(), indicator);
                }
                break;
            case "harmful_environment":
                ////将没有被选中的复选框项目 setValue 0
                BusiMulitiKeyValue.HarmfulEnvironment[] unCheckedList4 = BusiMulitiKeyValue.HarmfulEnvironment.values();
                for (BusiMulitiKeyValue.HarmfulEnvironment vo : unCheckedList4) {
                    Indicator indicator = new Indicator();
                    indicator.setUserId(userId);
                    indicator.setCertNum(certNum);
                    indicator.setCode(vo.getCode());
                    indicator.setName(vo.getName());
                    indicator.setValue(unCheckedValue);
                    entityMap.put(vo.getCode(), indicator);
                }
                break;
            case "pre_disease_value":
                ////将没有被选中的复选框项目 setValue 0
                BusiMulitiKeyValue.PreDiseaseValue[] unCheckedList5 = BusiMulitiKeyValue.PreDiseaseValue.values();
                for (BusiMulitiKeyValue.PreDiseaseValue vo : unCheckedList5) {
                    Indicator indicator = new Indicator();
                    indicator.setUserId(userId);
                    indicator.setCertNum(certNum);
                    indicator.setCode(vo.getCode());
                    indicator.setName(vo.getName());
                    indicator.setValue(unCheckedValue);
                    entityMap.put(vo.getCode(), indicator);
                }
                break;
            case "suffered_disease":
                ////将没有被选中的复选框项目 setValue 0
                BusiMulitiKeyValue.SufferedDisease[] unCheckedList6 = BusiMulitiKeyValue.SufferedDisease.values();
                for (BusiMulitiKeyValue.SufferedDisease vo : unCheckedList6) {
                    Indicator indicator = new Indicator();
                    indicator.setUserId(userId);
                    indicator.setCertNum(certNum);
                    indicator.setCode(vo.getCode());
                    indicator.setName(vo.getName());
                    indicator.setValue(unCheckedValue);
                    entityMap.put(vo.getCode(), indicator);
                }
                break;
            case "intelligence":
                ////将没有被选中的复选框项目 setValue 0
                BusiMulitiKeyValue.Intelligence[] unCheckedList7 = BusiMulitiKeyValue.Intelligence.values();
                for (BusiMulitiKeyValue.Intelligence vo : unCheckedList7) {
                    Indicator indicator = new Indicator();
                    indicator.setUserId(userId);
                    indicator.setCertNum(certNum);
                    indicator.setCode(vo.getCode());
                    indicator.setName(vo.getName());
                    indicator.setValue(unCheckedValue);
                    entityMap.put(vo.getCode(), indicator);
                }
                break;
        }
        return entityMap;
    }


    /**
     * 获取复选框，所有选择项与非勾选项的指标值
     * 选择项值为1，非选择项值为0
     */
    private static Map<String, BaseRecordEntity> getCharColumnRecordEntityMap(String userId, String certNum, String columnName, String[] columnValArr) {
        if (columnValArr == null || columnValArr.length == 0) {
            return null;
        }
        Map<String, BaseRecordEntity> entityMap = Maps.newHashMap();

        switch (columnName) {
            case "andropathy":
                //将没有被选中的复选框项目 setValue 0
                List<BusiMulitiKeyValue.Andropathy> unCheckedList = BusiMulitiKeyValue.Andropathy.getUncheckedByIndex(columnValArr);
                if (!CollectionUtils.isEmpty(unCheckedList)) {
                    for (BusiMulitiKeyValue.Andropathy vo : unCheckedList) {
                        Indicator indicator = new Indicator();
                        indicator.setUserId(userId);
                        indicator.setCertNum(certNum);
                        indicator.setCode(vo.getCode());
                        indicator.setName(vo.getName());
                        indicator.setValue(unCheckedValue);
                        entityMap.put(vo.getCode(), indicator);
                    }
                }
                //将被选中的复选框项目 setValue 1
                List<BusiMulitiKeyValue.Andropathy> checkedList = BusiMulitiKeyValue.Andropathy.getCheckedByIndex(columnValArr);
                if (!CollectionUtils.isEmpty(checkedList)) {
                    for (BusiMulitiKeyValue.Andropathy vo : checkedList) {
                        Indicator indicator = new Indicator();
                        indicator.setUserId(userId);
                        indicator.setCertNum(certNum);
                        indicator.setCode(vo.getCode());
                        indicator.setName(vo.getName());
                        indicator.setValue(checkValue);
                        entityMap.put(vo.getCode(), indicator);
                    }
                }
                break;
            case "b_detail":
                ////将没有被选中的复选框项目 setValue 0
                List<BusiMulitiKeyValue.BDetail> unCheckedList1 = BusiMulitiKeyValue.BDetail.getUncheckedByIndex(columnValArr);
                if (!CollectionUtils.isEmpty(unCheckedList1)) {
                    for (BusiMulitiKeyValue.BDetail vo : unCheckedList1) {
                        Indicator indicator = new Indicator();
                        indicator.setUserId(userId);
                        indicator.setCertNum(certNum);
                        indicator.setCode(vo.getCode());
                        indicator.setName(vo.getName());
                        indicator.setValue(unCheckedValue);
                        entityMap.put(vo.getCode(), indicator);
                    }
                }
                //将被选中的复选框项目 setValue 1
                List<BusiMulitiKeyValue.BDetail> checkedList1 = BusiMulitiKeyValue.BDetail.getCheckedByIndex(columnValArr);
                if (!CollectionUtils.isEmpty(checkedList1)) {
                    for (BusiMulitiKeyValue.BDetail vo : checkedList1) {
                        Indicator indicator = new Indicator();
                        indicator.setUserId(userId);
                        indicator.setCertNum(certNum);
                        indicator.setCode(vo.getCode());
                        indicator.setName(vo.getName());
                        indicator.setValue(checkValue);
                        entityMap.put(vo.getCode(), indicator);
                    }
                }
                break;
            case "gynecopathy":
                ////将没有被选中的复选框项目 setValue 0
                List<BusiMulitiKeyValue.Gynecopathy> unCheckedList2 = BusiMulitiKeyValue.Gynecopathy.getUncheckedByIndex(columnValArr);
                if (!CollectionUtils.isEmpty(unCheckedList2)) {
                    for (BusiMulitiKeyValue.Gynecopathy vo : unCheckedList2) {
                        Indicator indicator = new Indicator();
                        indicator.setUserId(userId);
                        indicator.setCertNum(certNum);
                        indicator.setCode(vo.getCode());
                        indicator.setName(vo.getName());
                        indicator.setValue(unCheckedValue);
                        entityMap.put(vo.getCode(), indicator);
                    }
                }
                //将被选中的复选框项目 setValue 1
                List<BusiMulitiKeyValue.Gynecopathy> checkedList2 = BusiMulitiKeyValue.Gynecopathy.getCheckedByIndex(columnValArr);
                if (!CollectionUtils.isEmpty(checkedList2)) {
                    for (BusiMulitiKeyValue.Gynecopathy vo : checkedList2) {
                        Indicator indicator = new Indicator();
                        indicator.setUserId(userId);
                        indicator.setCertNum(certNum);
                        indicator.setCode(vo.getCode());
                        indicator.setName(vo.getName());
                        indicator.setValue(checkValue);
                        entityMap.put(vo.getCode(), indicator);
                    }
                }
                break;
            case "family_disease":
                ////将没有被选中的复选框项目 setValue 0
                List<BusiMulitiKeyValue.FamilyDisease> unCheckedList3 = BusiMulitiKeyValue.FamilyDisease.getUncheckedByIndex(columnValArr);
                if (!CollectionUtils.isEmpty(unCheckedList3)) {
                    for (BusiMulitiKeyValue.FamilyDisease vo : unCheckedList3) {
                        Indicator indicator = new Indicator();
                        indicator.setUserId(userId);
                        indicator.setCertNum(certNum);
                        indicator.setCode(vo.getCode());
                        indicator.setName(vo.getName());
                        indicator.setValue(unCheckedValue);
                        entityMap.put(vo.getCode(), indicator);
                    }
                }
                //将被选中的复选框项目 setValue 1
                List<BusiMulitiKeyValue.FamilyDisease> checkedList3 = BusiMulitiKeyValue.FamilyDisease.getCheckedByIndex(columnValArr);
                if (!CollectionUtils.isEmpty(checkedList3)) {
                    for (BusiMulitiKeyValue.FamilyDisease vo : checkedList3) {
                        Indicator indicator = new Indicator();
                        indicator.setUserId(userId);
                        indicator.setCertNum(certNum);
                        indicator.setCode(vo.getCode());
                        indicator.setName(vo.getName());
                        indicator.setValue(checkValue);
                        entityMap.put(vo.getCode(), indicator);
                    }
                }
                break;
            case "harmful_environment":
                ////将没有被选中的复选框项目 setValue 0
                List<BusiMulitiKeyValue.HarmfulEnvironment> unCheckedList4 = BusiMulitiKeyValue.HarmfulEnvironment.getUncheckedByIndex(columnValArr);
                if (!CollectionUtils.isEmpty(unCheckedList4)) {
                    for (BusiMulitiKeyValue.HarmfulEnvironment vo : unCheckedList4) {
                        Indicator indicator = new Indicator();
                        indicator.setUserId(userId);
                        indicator.setCertNum(certNum);
                        indicator.setCode(vo.getCode());
                        indicator.setName(vo.getName());
                        indicator.setValue(unCheckedValue);
                        entityMap.put(vo.getCode(), indicator);
                    }
                }
                //将被选中的复选框项目 setValue 1
                List<BusiMulitiKeyValue.HarmfulEnvironment> checkedList4 = BusiMulitiKeyValue.HarmfulEnvironment.getCheckedByIndex(columnValArr);
                if (!CollectionUtils.isEmpty(checkedList4)) {
                    for (BusiMulitiKeyValue.HarmfulEnvironment vo : checkedList4) {
                        Indicator indicator = new Indicator();
                        indicator.setUserId(userId);
                        indicator.setCertNum(certNum);
                        indicator.setCode(vo.getCode());
                        indicator.setName(vo.getName());
                        indicator.setValue(checkValue);
                        entityMap.put(vo.getCode(), indicator);
                    }
                }
                break;
            case "pre_disease_value":
                ////将没有被选中的复选框项目 setValue 0
                List<BusiMulitiKeyValue.PreDiseaseValue> unCheckedList5 = BusiMulitiKeyValue.PreDiseaseValue.getUncheckedByIndex(columnValArr);
                if (!CollectionUtils.isEmpty(unCheckedList5)) {
                    for (BusiMulitiKeyValue.PreDiseaseValue vo : unCheckedList5) {
                        Indicator indicator = new Indicator();
                        indicator.setUserId(userId);
                        indicator.setCertNum(certNum);
                        indicator.setCode(vo.getCode());
                        indicator.setName(vo.getName());
                        indicator.setValue(unCheckedValue);
                        entityMap.put(vo.getCode(), indicator);
                    }
                }
                //将被选中的复选框项目 setValue 1
                List<BusiMulitiKeyValue.PreDiseaseValue> checkedList5 = BusiMulitiKeyValue.PreDiseaseValue.getCheckedByIndex(columnValArr);
                if (!CollectionUtils.isEmpty(checkedList5)) {
                    for (BusiMulitiKeyValue.PreDiseaseValue vo : checkedList5) {
                        Indicator indicator = new Indicator();
                        indicator.setUserId(userId);
                        indicator.setCertNum(certNum);
                        indicator.setCode(vo.getCode());
                        indicator.setName(vo.getName());
                        indicator.setValue(checkValue);
                        entityMap.put(vo.getCode(), indicator);
                    }
                }
                break;
            case "suffered_disease":
                ////将没有被选中的复选框项目 setValue 0
                List<BusiMulitiKeyValue.SufferedDisease> unCheckedList6 = BusiMulitiKeyValue.SufferedDisease.getUncheckedByIndex(columnValArr);
                if (!CollectionUtils.isEmpty(unCheckedList6)) {
                    for (BusiMulitiKeyValue.SufferedDisease vo : unCheckedList6) {
                        Indicator indicator = new Indicator();
                        indicator.setUserId(userId);
                        indicator.setCertNum(certNum);
                        indicator.setCode(vo.getCode());
                        indicator.setName(vo.getName());
                        indicator.setValue(unCheckedValue);
                        entityMap.put(vo.getCode(), indicator);
                    }
                }
                //将被选中的复选框项目 setValue 1
                List<BusiMulitiKeyValue.SufferedDisease> checkedList6 = BusiMulitiKeyValue.SufferedDisease.getCheckedByIndex(columnValArr);
                if (!CollectionUtils.isEmpty(checkedList6)) {
                    for (BusiMulitiKeyValue.SufferedDisease vo : checkedList6) {
                        Indicator indicator = new Indicator();
                        indicator.setUserId(userId);
                        indicator.setCertNum(certNum);
                        indicator.setCode(vo.getCode());
                        indicator.setName(vo.getName());
                        indicator.setValue(checkValue);
                        entityMap.put(vo.getCode(), indicator);
                    }
                }
                break;
            case "intelligence":
                ////将没有被选中的复选框项目 setValue 0
                List<BusiMulitiKeyValue.Intelligence> unCheckedList7 = BusiMulitiKeyValue.Intelligence.getUncheckedByIndex(columnValArr);
                if (!CollectionUtils.isEmpty(unCheckedList7)) {
                    for (BusiMulitiKeyValue.Intelligence vo : unCheckedList7) {
                        Indicator indicator = new Indicator();
                        indicator.setUserId(userId);
                        indicator.setCertNum(certNum);
                        indicator.setCode(vo.getCode());
                        indicator.setName(vo.getName());
                        indicator.setValue(unCheckedValue);
                        entityMap.put(vo.getCode(), indicator);
                    }
                }
                //将被选中的复选框项目 setValue 1
                List<BusiMulitiKeyValue.Intelligence> checkedList7 = BusiMulitiKeyValue.Intelligence.getCheckedByIndex(columnValArr);
                if (!CollectionUtils.isEmpty(checkedList7)) {
                    for (BusiMulitiKeyValue.Intelligence vo : checkedList7) {
                        Indicator indicator = new Indicator();
                        indicator.setUserId(userId);
                        indicator.setCertNum(certNum);
                        indicator.setCode(vo.getCode());
                        indicator.setName(vo.getName());
                        indicator.setValue(checkValue);
                        entityMap.put(vo.getCode(), indicator);
                    }
                }
                break;
        }
        return entityMap;
    }

    /**
     * @param
     * @return
     * @throws
     * @Title:
     * @Description: 拼装 指标记录实体 的 最小值和最大值
     * @author chunyangli
     * @date 2016/12/9 19:27
     */
    public void getIndicator(Indicator indicator, Object columnValue_exam_item_range_id, String columnName) {

        //如果字段名字在 b1- b100 里面
        //将值反射出来 然后 将反射出来的值 到 base库里面去查询 dict_exam_item_range 表的最大值和最小值
        if (colNameSetB.contains(columnName) || colNameSetW.contains(columnName)) {
            String deirId = columnValue_exam_item_range_id + "";
            Map<String, Object> params_deir = Maps.newHashMap();
            params_deir.put(idKey, deirId);
            DictExamItemRange dictExamItemRange = dictExamItemRangeService.queryDataByParams(params_deir);
            if (null != dictExamItemRange) {
                logger.info("==rangeValue====lalallalalalallalalalalal========columnName:" + columnName);
                if (StringUtils.isNotBlank(dictExamItemRange.getMinValue())) {
                    indicator.setRangeMinVal(Double.valueOf(dictExamItemRange.getMinValue()));
                }
                if (StringUtils.isNotBlank(dictExamItemRange.getMaxValue())) {
                    indicator.setRangeMaxVal(Double.valueOf(dictExamItemRange.getMaxValue()));
                }

            }
        }
    }


}
