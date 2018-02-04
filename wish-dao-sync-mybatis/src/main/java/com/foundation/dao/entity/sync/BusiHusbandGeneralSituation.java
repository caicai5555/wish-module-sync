package com.foundation.dao.entity.sync;

import java.io.Serializable;
import java.util.Date;
/**
 * @Title: BusiHusbandGeneralSituation.java
 * @Package com.foundation.dao.entity.sync
 * @Description: 丈夫一般情况实体 对应表 busi_husband_general_situation
 * @author chunyangli(chunyangli@bioeh.com)
 * @date 2016/10/21 14:57 
 */
public class BusiHusbandGeneralSituation extends BusiBaseEntity {
    private String husbandGeneralSituationId;

    private String pregnancyArchiveId;

    private String checkNo;

    private Date inquiryTime;

    private String organizationId;

    private String userId;

    private Integer iscomplete;

    private Integer isHadDisease;

    private String sufferedDisease;

    private String otherDisease;

    private Integer isBirthDefect;

    private String birthDefect;

    private Integer isAndropathy;

    private String andropathy;

    private String otherAndropathy;

    private Integer isTakeMedicine;

    private String medicineName;

    private Integer isVaccinated;

    private String vaccine;

    private String otherVaccine;

    private Integer isFamilyCloseRelative;

    private String familyRelationship;

    private Integer isFamilyDisease;

    private String familyDisease;

    private String otherFamilyDisease;

    private String relationship;

    private Integer isEatMeatEgg;

    private Integer isAnorexiaVegetables;

    private Integer isEatRawMeat;

    private Integer isSomke;

    private Integer dailySomkeNumber;

    private Integer isPassiveSmoking;

    private Integer dailyPassiveSmokingMinutes;

    private Integer isDrink;

    private Integer dailyDrinkVolumn;

    private Integer isTakeDrug;

    private String drugName;

    private Integer isHalitosis;

    private Integer isBleedingGums;

    private Integer isHarmfulEnvironment;

    private String harmfulEnvironment;

    private String otherHarmfulEnvironment;

    private Integer isPressure;

    private Integer isRelationshipTense;

    private Integer isEconomicPressure;

    private Integer isPreparePregnancy;

    private String other;

    private String createUserId;

    private Date createDatetime;

    private String updateUserId;

    private Date updateDatetime;

    private Integer isdelete;

    public String getHusbandGeneralSituationId() {
        return husbandGeneralSituationId;
    }

    public void setHusbandGeneralSituationId(String husbandGeneralSituationId) {
        this.husbandGeneralSituationId = husbandGeneralSituationId == null ? null : husbandGeneralSituationId.trim();
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

    public Integer getIsHadDisease() {
        return isHadDisease;
    }

    public void setIsHadDisease(Integer isHadDisease) {
        this.isHadDisease = isHadDisease;
    }

    public String getSufferedDisease() {
        return sufferedDisease;
    }

    public void setSufferedDisease(String sufferedDisease) {
        this.sufferedDisease = sufferedDisease == null ? null : sufferedDisease.trim();
    }

    public String getOtherDisease() {
        return otherDisease;
    }

    public void setOtherDisease(String otherDisease) {
        this.otherDisease = otherDisease == null ? null : otherDisease.trim();
    }

    public Integer getIsBirthDefect() {
        return isBirthDefect;
    }

    public void setIsBirthDefect(Integer isBirthDefect) {
        this.isBirthDefect = isBirthDefect;
    }

    public String getBirthDefect() {
        return birthDefect;
    }

    public void setBirthDefect(String birthDefect) {
        this.birthDefect = birthDefect == null ? null : birthDefect.trim();
    }

    public Integer getIsAndropathy() {
        return isAndropathy;
    }

    public void setIsAndropathy(Integer isAndropathy) {
        this.isAndropathy = isAndropathy;
    }

    public String getAndropathy() {
        return andropathy;
    }

    public void setAndropathy(String andropathy) {
        this.andropathy = andropathy == null ? null : andropathy.trim();
    }

    public String getOtherAndropathy() {
        return otherAndropathy;
    }

    public void setOtherAndropathy(String otherAndropathy) {
        this.otherAndropathy = otherAndropathy == null ? null : otherAndropathy.trim();
    }

    public Integer getIsTakeMedicine() {
        return isTakeMedicine;
    }

    public void setIsTakeMedicine(Integer isTakeMedicine) {
        this.isTakeMedicine = isTakeMedicine;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName == null ? null : medicineName.trim();
    }

    public Integer getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Integer isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine == null ? null : vaccine.trim();
    }

    public String getOtherVaccine() {
        return otherVaccine;
    }

    public void setOtherVaccine(String otherVaccine) {
        this.otherVaccine = otherVaccine == null ? null : otherVaccine.trim();
    }

    public Integer getIsFamilyCloseRelative() {
        return isFamilyCloseRelative;
    }

    public void setIsFamilyCloseRelative(Integer isFamilyCloseRelative) {
        this.isFamilyCloseRelative = isFamilyCloseRelative;
    }

    public String getFamilyRelationship() {
        return familyRelationship;
    }

    public void setFamilyRelationship(String familyRelationship) {
        this.familyRelationship = familyRelationship == null ? null : familyRelationship.trim();
    }

    public Integer getIsFamilyDisease() {
        return isFamilyDisease;
    }

    public void setIsFamilyDisease(Integer isFamilyDisease) {
        this.isFamilyDisease = isFamilyDisease;
    }

    public String getFamilyDisease() {
        return familyDisease;
    }

    public void setFamilyDisease(String familyDisease) {
        this.familyDisease = familyDisease == null ? null : familyDisease.trim();
    }

    public String getOtherFamilyDisease() {
        return otherFamilyDisease;
    }

    public void setOtherFamilyDisease(String otherFamilyDisease) {
        this.otherFamilyDisease = otherFamilyDisease == null ? null : otherFamilyDisease.trim();
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship == null ? null : relationship.trim();
    }

    public Integer getIsEatMeatEgg() {
        return isEatMeatEgg;
    }

    public void setIsEatMeatEgg(Integer isEatMeatEgg) {
        this.isEatMeatEgg = isEatMeatEgg;
    }

    public Integer getIsAnorexiaVegetables() {
        return isAnorexiaVegetables;
    }

    public void setIsAnorexiaVegetables(Integer isAnorexiaVegetables) {
        this.isAnorexiaVegetables = isAnorexiaVegetables;
    }

    public Integer getIsEatRawMeat() {
        return isEatRawMeat;
    }

    public void setIsEatRawMeat(Integer isEatRawMeat) {
        this.isEatRawMeat = isEatRawMeat;
    }

    public Integer getIsSomke() {
        return isSomke;
    }

    public void setIsSomke(Integer isSomke) {
        this.isSomke = isSomke;
    }

    public Integer getDailySomkeNumber() {
        return dailySomkeNumber;
    }

    public void setDailySomkeNumber(Integer dailySomkeNumber) {
        this.dailySomkeNumber = dailySomkeNumber;
    }

    public Integer getIsPassiveSmoking() {
        return isPassiveSmoking;
    }

    public void setIsPassiveSmoking(Integer isPassiveSmoking) {
        this.isPassiveSmoking = isPassiveSmoking;
    }

    public Integer getDailyPassiveSmokingMinutes() {
        return dailyPassiveSmokingMinutes;
    }

    public void setDailyPassiveSmokingMinutes(Integer dailyPassiveSmokingMinutes) {
        this.dailyPassiveSmokingMinutes = dailyPassiveSmokingMinutes;
    }

    public Integer getIsDrink() {
        return isDrink;
    }

    public void setIsDrink(Integer isDrink) {
        this.isDrink = isDrink;
    }

    public Integer getDailyDrinkVolumn() {
        return dailyDrinkVolumn;
    }

    public void setDailyDrinkVolumn(Integer dailyDrinkVolumn) {
        this.dailyDrinkVolumn = dailyDrinkVolumn;
    }

    public Integer getIsTakeDrug() {
        return isTakeDrug;
    }

    public void setIsTakeDrug(Integer isTakeDrug) {
        this.isTakeDrug = isTakeDrug;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    public Integer getIsHalitosis() {
        return isHalitosis;
    }

    public void setIsHalitosis(Integer isHalitosis) {
        this.isHalitosis = isHalitosis;
    }

    public Integer getIsBleedingGums() {
        return isBleedingGums;
    }

    public void setIsBleedingGums(Integer isBleedingGums) {
        this.isBleedingGums = isBleedingGums;
    }

    public Integer getIsHarmfulEnvironment() {
        return isHarmfulEnvironment;
    }

    public void setIsHarmfulEnvironment(Integer isHarmfulEnvironment) {
        this.isHarmfulEnvironment = isHarmfulEnvironment;
    }

    public String getHarmfulEnvironment() {
        return harmfulEnvironment;
    }

    public void setHarmfulEnvironment(String harmfulEnvironment) {
        this.harmfulEnvironment = harmfulEnvironment == null ? null : harmfulEnvironment.trim();
    }

    public String getOtherHarmfulEnvironment() {
        return otherHarmfulEnvironment;
    }

    public void setOtherHarmfulEnvironment(String otherHarmfulEnvironment) {
        this.otherHarmfulEnvironment = otherHarmfulEnvironment == null ? null : otherHarmfulEnvironment.trim();
    }

    public Integer getIsPressure() {
        return isPressure;
    }

    public void setIsPressure(Integer isPressure) {
        this.isPressure = isPressure;
    }

    public Integer getIsRelationshipTense() {
        return isRelationshipTense;
    }

    public void setIsRelationshipTense(Integer isRelationshipTense) {
        this.isRelationshipTense = isRelationshipTense;
    }

    public Integer getIsEconomicPressure() {
        return isEconomicPressure;
    }

    public void setIsEconomicPressure(Integer isEconomicPressure) {
        this.isEconomicPressure = isEconomicPressure;
    }

    public Integer getIsPreparePregnancy() {
        return isPreparePregnancy;
    }

    public void setIsPreparePregnancy(Integer isPreparePregnancy) {
        this.isPreparePregnancy = isPreparePregnancy;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
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
}