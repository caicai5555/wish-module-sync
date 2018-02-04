package com.foundation.dao.entity.sync;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: BusiWifePhysicalExam.java
 * @Package com.foundation.dao.entity.sync
 * @Description: 妻子体格检查实体 对应表：busi_wife_physical_exam
 * @author chunyangli(chunyangli@bioeh.com)
 * @date 2016/10/21 14:45 
 */
public class BusiWifePhysicalExam extends BusiBaseEntity {
    private String wifePhysicalExamId;//主键id

    private String pregnancyArchiveId;//服务档案编号

    private String checkNo;//检查单号

    private Date inquiryTime;//询问日期

    private String organizationId;//问诊机构

    private String userId;//问诊医生

    private Integer iscomplete;//基本信息完成状态

    private Float weight;//体重（kg）

    private Float bmi;//体重指数（BMI）kg/cm2

    private Short heartRate;//心率（次/分）

    private Short systolicPressure;//收缩压（mmHg）

    private Short diastolicPressure;//舒张压（mmHg）

    private Integer isPsychosis;//精神状态是否正常
    private String psychosisDetail;//精神状态异常描述

    private Integer isIntelligence;//智力是否正常

    private String intelligence;//智力异常类型

    private Integer isFacial;//五官

    private String facialDetail;//五官异常描述

    private Float height;//身高（cm）

    private Integer isSpecialBody;//特殊体态

    private String specialBodyDetail;//特殊体态描述

    private Integer isUnusualFacies;//特殊面容

    private String unusualFaciesDetail;//特殊面容描述

    private Integer isSkinHair;//皮肤毛发

    private String skinHairDetail;//皮肤毛发异常描述

    private Integer isThyroid;//甲状腺

    private String thyroidDetail;//甲状腺异常描述

    private Integer isLungs;//肺部

    private String lungsDetail;//肺部异常描述

    private Integer isRegularRhythm;//心脏节律是否整齐

    private String rhythmDetail;//心脏节律描述

    private Integer isCardiacSouffle;//心脏杂音

    private String cardiacSouffleDetail;//心脏杂音描述

    private Integer isLiverSpleen;//肝脾检查

    private String liverSpleenDetail;//肝脾检查异常描述

    private Integer isLimbSpine;//四肢脊柱

    private String limbSpineDetail;//四肢脊柱异常描述

    private String otherAnomalies;//其他

    private String createUserId;//创建人

    private Date createDatetime;//创建时间

    private String updateUserId;//更新人

    private Date updateDatetime;//更新时间

    private Integer isdelete;//标记是否删除

    private Integer common;//

    private Integer judge;//

    private Integer memory;//

    private Integer gene;//

    public String getWifePhysicalExamId() {
        return wifePhysicalExamId;
    }

    public void setWifePhysicalExamId(String wifePhysicalExamId) {
        this.wifePhysicalExamId = wifePhysicalExamId == null ? null : wifePhysicalExamId.trim();
    }

    public String getPregnancyArchiveId() {
        return pregnancyArchiveId;
    }

    public void setPregnancyArchiveId(String pregnancyArchiveId) {
        this.pregnancyArchiveId = pregnancyArchiveId == null ? null : pregnancyArchiveId.trim();
    }

    public String getCheckNo() {
        return checkNo;
    }

    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo == null ? null : checkNo.trim();
    }

    public Date getInquiryTime() {
        return inquiryTime;
    }

    public void setInquiryTime(Date inquiryTime) {
        this.inquiryTime = inquiryTime;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getIscomplete() {
        return iscomplete;
    }

    public void setIscomplete(Integer iscomplete) {
        this.iscomplete = iscomplete;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getBmi() {
        return bmi;
    }

    public void setBmi(Float bmi) {
        this.bmi = bmi;
    }

    public Short getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Short heartRate) {
        this.heartRate = heartRate;
    }

    public Short getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(Short systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public Short getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(Short diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public Integer getIsPsychosis() {
        return isPsychosis;
    }

    public void setIsPsychosis(Integer isPsychosis) {
        this.isPsychosis = isPsychosis;
    }

    public String getPsychosisDetail() {
        return psychosisDetail;
    }

    public void setPsychosisDetail(String psychosisDetail) {
        this.psychosisDetail = psychosisDetail == null ? null : psychosisDetail.trim();
    }

    public Integer getIsIntelligence() {
        return isIntelligence;
    }

    public void setIsIntelligence(Integer isIntelligence) {
        this.isIntelligence = isIntelligence;
    }

    public String getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(String intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getIsFacial() {
        return isFacial;
    }

    public void setIsFacial(Integer isFacial) {
        this.isFacial = isFacial;
    }

    public String getFacialDetail() {
        return facialDetail;
    }

    public void setFacialDetail(String facialDetail) {
        this.facialDetail = facialDetail == null ? null : facialDetail.trim();
    }

    public Integer getIsSpecialBody() {
        return isSpecialBody;
    }

    public void setIsSpecialBody(Integer isSpecialBody) {
        this.isSpecialBody = isSpecialBody;
    }

    public String getSpecialBodyDetail() {
        return specialBodyDetail;
    }

    public void setSpecialBodyDetail(String specialBodyDetail) {
        this.specialBodyDetail = specialBodyDetail == null ? null : specialBodyDetail.trim();
    }

    public Integer getIsUnusualFacies() {
        return isUnusualFacies;
    }

    public void setIsUnusualFacies(Integer isUnusualFacies) {
        this.isUnusualFacies = isUnusualFacies;
    }

    public String getUnusualFaciesDetail() {
        return unusualFaciesDetail;
    }

    public void setUnusualFaciesDetail(String unusualFaciesDetail) {
        this.unusualFaciesDetail = unusualFaciesDetail == null ? null : unusualFaciesDetail.trim();
    }

    public Integer getIsSkinHair() {
        return isSkinHair;
    }

    public void setIsSkinHair(Integer isSkinHair) {
        this.isSkinHair = isSkinHair;
    }

    public String getSkinHairDetail() {
        return skinHairDetail;
    }

    public void setSkinHairDetail(String skinHairDetail) {
        this.skinHairDetail = skinHairDetail == null ? null : skinHairDetail.trim();
    }

    public Integer getIsThyroid() {
        return isThyroid;
    }

    public void setIsThyroid(Integer isThyroid) {
        this.isThyroid = isThyroid;
    }

    public String getThyroidDetail() {
        return thyroidDetail;
    }

    public void setThyroidDetail(String thyroidDetail) {
        this.thyroidDetail = thyroidDetail == null ? null : thyroidDetail.trim();
    }

    public Integer getIsLungs() {
        return isLungs;
    }

    public void setIsLungs(Integer isLungs) {
        this.isLungs = isLungs;
    }

    public String getLungsDetail() {
        return lungsDetail;
    }

    public void setLungsDetail(String lungsDetail) {
        this.lungsDetail = lungsDetail == null ? null : lungsDetail.trim();
    }

    public Integer getIsRegularRhythm() {
        return isRegularRhythm;
    }

    public void setIsRegularRhythm(Integer isRegularRhythm) {
        this.isRegularRhythm = isRegularRhythm;
    }

    public String getRhythmDetail() {
        return rhythmDetail;
    }

    public void setRhythmDetail(String rhythmDetail) {
        this.rhythmDetail = rhythmDetail == null ? null : rhythmDetail.trim();
    }

    public Integer getIsCardiacSouffle() {
        return isCardiacSouffle;
    }

    public void setIsCardiacSouffle(Integer isCardiacSouffle) {
        this.isCardiacSouffle = isCardiacSouffle;
    }

    public String getCardiacSouffleDetail() {
        return cardiacSouffleDetail;
    }

    public void setCardiacSouffleDetail(String cardiacSouffleDetail) {
        this.cardiacSouffleDetail = cardiacSouffleDetail == null ? null : cardiacSouffleDetail.trim();
    }

    public Integer getIsLiverSpleen() {
        return isLiverSpleen;
    }

    public void setIsLiverSpleen(Integer isLiverSpleen) {
        this.isLiverSpleen = isLiverSpleen;
    }

    public String getLiverSpleenDetail() {
        return liverSpleenDetail;
    }

    public void setLiverSpleenDetail(String liverSpleenDetail) {
        this.liverSpleenDetail = liverSpleenDetail == null ? null : liverSpleenDetail.trim();
    }

    public Integer getIsLimbSpine() {
        return isLimbSpine;
    }

    public void setIsLimbSpine(Integer isLimbSpine) {
        this.isLimbSpine = isLimbSpine;
    }

    public String getLimbSpineDetail() {
        return limbSpineDetail;
    }

    public void setLimbSpineDetail(String limbSpineDetail) {
        this.limbSpineDetail = limbSpineDetail == null ? null : limbSpineDetail.trim();
    }

    public String getOtherAnomalies() {
        return otherAnomalies;
    }

    public void setOtherAnomalies(String otherAnomalies) {
        this.otherAnomalies = otherAnomalies == null ? null : otherAnomalies.trim();
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getCommon() {
        return common;
    }

    public void setCommon(Integer common) {
        this.common = common;
    }

    public Integer getJudge() {
        return judge;
    }

    public void setJudge(Integer judge) {
        this.judge = judge;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getGene() {
        return gene;
    }

    public void setGene(Integer gene) {
        this.gene = gene;
    }
}