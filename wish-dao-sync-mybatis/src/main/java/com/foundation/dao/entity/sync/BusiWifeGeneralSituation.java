package com.foundation.dao.entity.sync;

import java.io.Serializable;
import java.util.Date;
/**
 * @Title: BusiWifeGeneralSituation.java
 * @Package com.foundation.dao.entity.sync
 * @Description: 妻子一般情况实体 对应表：busi_wife_general_situation
 * @author chunyangli(chunyangli@bioeh.com)
 * @date 2016/10/21 15:01 
 */
public class BusiWifeGeneralSituation extends BusiBaseEntity {
    private String wifeGeneralSituationId;

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

    private Integer isGynecopathy;

    private String gynecopathy;

    private String otherGynecopathy;

    private Integer isTakeMedicine;

    private String medicineName;

    private Integer isVaccinated;

    private String vaccine;

    private String otherVaccine;

    private Integer isContraception;

    private String contraception;

    private String otherContraception;

    private Integer contraceptionContinuousTime;

    private Integer isStopContraception;

    private Date stopContraceptionDate;

    private Integer menarcheAge;

    private Date lastMenstruationDate;

    private Integer isRegularMenstrual;

    private Integer shortestMenstruation;

    private Integer longestMenstruation;

    private Integer shortestPeriod;

    private Integer longestPeriod;

    private Integer menstrualVolume;

    private Integer dysmenorrhea;

    private Integer everPregnant;

    private Integer pregnancyNumber;

    private Integer liveBirthNumber;

    private Integer fullTermBirthNumber;

    private Integer prematureBirthNumber;

    private Integer hadAdversePregnancyOutcome;

    private String adversePregnancyOutcome;

    private Integer stillbirthNumber;

    private Integer naturalAbortionNumber;

    private Integer artificialAbortionNumber;

    private Integer otherAdversePregnancyOutcomeNumber;

    private Integer hadDefectChild;

    private String defectChildDisease;

    private String diseaseDetail;

    private Integer childNumber;

    private Integer childHealth;

    private String childDisease;

    private Integer isCloseRelatives;

    private String coupleRelationship;

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

    private String preDiseaseValue;

    private Integer isPreDisease;

    private Integer isCuttingPalace;

    private Date cuttingPalaceDateTime;

    private String otherPreDiseaseValue;

    private String other;

    private String createUserId;

    private Date createDatetime;

    private String updateUserId;

    private Date updateDatetime;

    private Integer isdelete;

    public String getWifeGeneralSituationId() {
        return wifeGeneralSituationId;
    }

    public void setWifeGeneralSituationId(String wifeGeneralSituationId) {
        this.wifeGeneralSituationId = wifeGeneralSituationId == null ? null : wifeGeneralSituationId.trim();
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

    public Integer getIsGynecopathy() {
        return isGynecopathy;
    }

    public void setIsGynecopathy(Integer isGynecopathy) {
        this.isGynecopathy = isGynecopathy;
    }

    public String getGynecopathy() {
        return gynecopathy;
    }

    public void setGynecopathy(String gynecopathy) {
        this.gynecopathy = gynecopathy == null ? null : gynecopathy.trim();
    }

    public String getOtherGynecopathy() {
        return otherGynecopathy;
    }

    public void setOtherGynecopathy(String otherGynecopathy) {
        this.otherGynecopathy = otherGynecopathy == null ? null : otherGynecopathy.trim();
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

    public Integer getIsContraception() {
        return isContraception;
    }

    public void setIsContraception(Integer isContraception) {
        this.isContraception = isContraception;
    }

    public String getContraception() {
        return contraception;
    }

    public void setContraception(String contraception) {
        this.contraception = contraception == null ? null : contraception.trim();
    }

    public String getOtherContraception() {
        return otherContraception;
    }

    public void setOtherContraception(String otherContraception) {
        this.otherContraception = otherContraception == null ? null : otherContraception.trim();
    }

    public Integer getContraceptionContinuousTime() {
        return contraceptionContinuousTime;
    }

    public void setContraceptionContinuousTime(Integer contraceptionContinuousTime) {
        this.contraceptionContinuousTime = contraceptionContinuousTime;
    }

    public Integer getIsStopContraception() {
        return isStopContraception;
    }

    public void setIsStopContraception(Integer isStopContraception) {
        this.isStopContraception = isStopContraception;
    }

    public Date getStopContraceptionDate() {
        return stopContraceptionDate;
    }

    public void setStopContraceptionDate(Date stopContraceptionDate) {
        this.stopContraceptionDate = stopContraceptionDate;
    }

    public Integer getMenarcheAge() {
        return menarcheAge;
    }

    public void setMenarcheAge(Integer menarcheAge) {
        this.menarcheAge = menarcheAge;
    }

    public Date getLastMenstruationDate() {
        return lastMenstruationDate;
    }

    public void setLastMenstruationDate(Date lastMenstruationDate) {
        this.lastMenstruationDate = lastMenstruationDate;
    }

    public Integer getIsRegularMenstrual() {
        return isRegularMenstrual;
    }

    public void setIsRegularMenstrual(Integer isRegularMenstrual) {
        this.isRegularMenstrual = isRegularMenstrual;
    }

    public Integer getShortestMenstruation() {
        return shortestMenstruation;
    }

    public void setShortestMenstruation(Integer shortestMenstruation) {
        this.shortestMenstruation = shortestMenstruation;
    }

    public Integer getLongestMenstruation() {
        return longestMenstruation;
    }

    public void setLongestMenstruation(Integer longestMenstruation) {
        this.longestMenstruation = longestMenstruation;
    }

    public Integer getShortestPeriod() {
        return shortestPeriod;
    }

    public void setShortestPeriod(Integer shortestPeriod) {
        this.shortestPeriod = shortestPeriod;
    }

    public Integer getLongestPeriod() {
        return longestPeriod;
    }

    public void setLongestPeriod(Integer longestPeriod) {
        this.longestPeriod = longestPeriod;
    }

    public Integer getMenstrualVolume() {
        return menstrualVolume;
    }

    public void setMenstrualVolume(Integer menstrualVolume) {
        this.menstrualVolume = menstrualVolume;
    }

    public Integer getDysmenorrhea() {
        return dysmenorrhea;
    }

    public void setDysmenorrhea(Integer dysmenorrhea) {
        this.dysmenorrhea = dysmenorrhea;
    }

    public Integer getEverPregnant() {
        return everPregnant;
    }

    public void setEverPregnant(Integer everPregnant) {
        this.everPregnant = everPregnant;
    }

    public Integer getPregnancyNumber() {
        return pregnancyNumber;
    }

    public void setPregnancyNumber(Integer pregnancyNumber) {
        this.pregnancyNumber = pregnancyNumber;
    }

    public Integer getLiveBirthNumber() {
        return liveBirthNumber;
    }

    public void setLiveBirthNumber(Integer liveBirthNumber) {
        this.liveBirthNumber = liveBirthNumber;
    }

    public Integer getFullTermBirthNumber() {
        return fullTermBirthNumber;
    }

    public void setFullTermBirthNumber(Integer fullTermBirthNumber) {
        this.fullTermBirthNumber = fullTermBirthNumber;
    }

    public Integer getPrematureBirthNumber() {
        return prematureBirthNumber;
    }

    public void setPrematureBirthNumber(Integer prematureBirthNumber) {
        this.prematureBirthNumber = prematureBirthNumber;
    }

    public Integer getHadAdversePregnancyOutcome() {
        return hadAdversePregnancyOutcome;
    }

    public void setHadAdversePregnancyOutcome(Integer hadAdversePregnancyOutcome) {
        this.hadAdversePregnancyOutcome = hadAdversePregnancyOutcome;
    }

    public String getAdversePregnancyOutcome() {
        return adversePregnancyOutcome;
    }

    public void setAdversePregnancyOutcome(String adversePregnancyOutcome) {
        this.adversePregnancyOutcome = adversePregnancyOutcome == null ? null : adversePregnancyOutcome.trim();
    }

    public Integer getStillbirthNumber() {
        return stillbirthNumber;
    }

    public void setStillbirthNumber(Integer stillbirthNumber) {
        this.stillbirthNumber = stillbirthNumber;
    }

    public Integer getNaturalAbortionNumber() {
        return naturalAbortionNumber;
    }

    public void setNaturalAbortionNumber(Integer naturalAbortionNumber) {
        this.naturalAbortionNumber = naturalAbortionNumber;
    }

    public Integer getArtificialAbortionNumber() {
        return artificialAbortionNumber;
    }

    public void setArtificialAbortionNumber(Integer artificialAbortionNumber) {
        this.artificialAbortionNumber = artificialAbortionNumber;
    }

    public Integer getOtherAdversePregnancyOutcomeNumber() {
        return otherAdversePregnancyOutcomeNumber;
    }

    public void setOtherAdversePregnancyOutcomeNumber(Integer otherAdversePregnancyOutcomeNumber) {
        this.otherAdversePregnancyOutcomeNumber = otherAdversePregnancyOutcomeNumber;
    }

    public Integer getHadDefectChild() {
        return hadDefectChild;
    }

    public void setHadDefectChild(Integer hadDefectChild) {
        this.hadDefectChild = hadDefectChild;
    }

    public String getDefectChildDisease() {
        return defectChildDisease;
    }

    public void setDefectChildDisease(String defectChildDisease) {
        this.defectChildDisease = defectChildDisease == null ? null : defectChildDisease.trim();
    }

    public String getDiseaseDetail() {
        return diseaseDetail;
    }

    public void setDiseaseDetail(String diseaseDetail) {
        this.diseaseDetail = diseaseDetail == null ? null : diseaseDetail.trim();
    }

    public Integer getChildNumber() {
        return childNumber;
    }

    public void setChildNumber(Integer childNumber) {
        this.childNumber = childNumber;
    }

    public Integer getChildHealth() {
        return childHealth;
    }

    public void setChildHealth(Integer childHealth) {
        this.childHealth = childHealth;
    }

    public String getChildDisease() {
        return childDisease;
    }

    public void setChildDisease(String childDisease) {
        this.childDisease = childDisease == null ? null : childDisease.trim();
    }

    public Integer getIsCloseRelatives() {
        return isCloseRelatives;
    }

    public void setIsCloseRelatives(Integer isCloseRelatives) {
        this.isCloseRelatives = isCloseRelatives;
    }

    public String getCoupleRelationship() {
        return coupleRelationship;
    }

    public void setCoupleRelationship(String coupleRelationship) {
        this.coupleRelationship = coupleRelationship == null ? null : coupleRelationship.trim();
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

    public String getPreDiseaseValue() {
        return preDiseaseValue;
    }

    public void setPreDiseaseValue(String preDiseaseValue) {
        this.preDiseaseValue = preDiseaseValue == null ? null : preDiseaseValue.trim();
    }

    public Integer getIsPreDisease() {
        return isPreDisease;
    }

    public void setIsPreDisease(Integer isPreDisease) {
        this.isPreDisease = isPreDisease;
    }

    public Integer getIsCuttingPalace() {
        return isCuttingPalace;
    }

    public void setIsCuttingPalace(Integer isCuttingPalace) {
        this.isCuttingPalace = isCuttingPalace;
    }

    public Date getCuttingPalaceDateTime() {
        return cuttingPalaceDateTime;
    }

    public void setCuttingPalaceDateTime(Date cuttingPalaceDateTime) {
        this.cuttingPalaceDateTime = cuttingPalaceDateTime;
    }

    public String getOtherPreDiseaseValue() {
        return otherPreDiseaseValue;
    }

    public void setOtherPreDiseaseValue(String otherPreDiseaseValue) {
        this.otherPreDiseaseValue = otherPreDiseaseValue == null ? null : otherPreDiseaseValue.trim();
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