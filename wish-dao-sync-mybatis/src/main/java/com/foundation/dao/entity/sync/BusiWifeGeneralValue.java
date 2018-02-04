package com.foundation.dao.entity.sync;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: BusiWifeGeneralValue.java
 * @Package com.foundation.dao.entity.sync
 * @Description: 妻子一般情况检查值实体 对应表：busi_wife_general_value
 * @author chunyangli(chunyangli@bioeh.com)
 * @date 2016/10/21 14:38 
 */
public class BusiWifeGeneralValue extends BusiBaseEntity {
    private String wifeGeneralValueId;//主键

    private String wifeGeneralSituationId;//妻子一般情况表id

    private String pregnancyArchiveId;//服务档案编号

    private Integer anemia;//贫血

    private Integer highBlood;//高血压

    private Integer heartDisease;//心脏病

    private Integer diabetes;//糖尿病

    private Integer epilepsy;//癫痫

    private Integer thyropathy;//甲状腺病

    private Integer nephritis;//慢性肾炎

    private Integer tumor;//肿瘤

    private Integer tuberculosis;//结核

    private Integer hepatitis;//乙型肝炎

    private Integer gonorrhea;//淋病

    private Integer syphilis;//梅毒

    private Integer chlamydia;//衣原体感染

    private Integer disorders;//精神心理疾患

    private Integer uterusInflammation;//子宫附件炎症

    private Integer infertility;//不孕不育症

    private Integer vaginitis;//外阴及阴道炎

    private Integer cervical;//子宫颈炎

    private Integer endometriosis;//子宫内膜异位症

    private Integer uterineFibroids;//子宫肌瘤

    private Integer ovarianCyst;//卵巢囊肿

    private Integer ovarySyndrome;//多囊卵巢综合征

    private Integer rubella;//风疹疫苗

    private Integer hepatitisB;//乙肝疫苗

    private Integer synthetic;//宫内节育器

    private Integer implants;//皮下埋植剂

    private Integer contraceptives;//口服避孕药

    private Integer condoms;//避孕套

    private Integer externalUse;//外用药

    private Integer contraception;//自然避孕

    private Integer stillbirth;//死胎死产

    private Integer abortion;//自然流产

    private Integer artificialAbortion;//人工流产

    private Integer preDiabetes;//妊娠期糖尿病史

    private Integer preHighBlood;//妊娠期高血压疾病史

    private Integer preBile;//妊娠期肝内胆汁淤积症

    private Integer preThyropathy;//妊娠期甲状腺异常

    private Integer preAnemia;//妊娠期贫血

    private Integer mediterraneanAnemia;//地中海贫血

    private Integer albino;//白化病

    private Integer g6pd;//蚕豆病

    private Integer hemophilia;//血友病

    private Integer congenitalHeartDisease;//先天性心脏病

    private Integer syndrome;//唐氏综合征

    private Integer familyDiabetes;//糖尿病(家属)

    private Integer mentalLow;//先天性智力低下

    private Integer hearLow;//听力障碍

    private Integer visionLow;//视力障碍

    private Integer childDead;//新生儿或婴幼儿死亡

    private Integer radiation;//放射线

    private Integer highTemperature;//高温

    private Integer noise;//噪音

    private Integer organicSolvent;//有机溶剂

    private Integer pet;//密切接触猫狗等家畜、宠物

    private Integer vibration;//振动

    private Integer heavyMetal;//重金属

    private Integer pesticide;//农药

    private Integer mildewFood;//霉变食品

    private Integer isdelete;//是否删除

    private String createUserId;//创建人

    private Date createDatetime;//创建时间

    private String updateUserId;//更新人

    private Date updateDatetime;//更新时间

    public String getWifeGeneralValueId() {
        return wifeGeneralValueId;
    }

    public void setWifeGeneralValueId(String wifeGeneralValueId) {
        this.wifeGeneralValueId = wifeGeneralValueId == null ? null : wifeGeneralValueId.trim();
    }

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

    public Integer getAnemia() {
        return anemia;
    }

    public void setAnemia(Integer anemia) {
        this.anemia = anemia;
    }

    public Integer getHighBlood() {
        return highBlood;
    }

    public void setHighBlood(Integer highBlood) {
        this.highBlood = highBlood;
    }

    public Integer getHeartDisease() {
        return heartDisease;
    }

    public void setHeartDisease(Integer heartDisease) {
        this.heartDisease = heartDisease;
    }

    public Integer getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Integer diabetes) {
        this.diabetes = diabetes;
    }

    public Integer getEpilepsy() {
        return epilepsy;
    }

    public void setEpilepsy(Integer epilepsy) {
        this.epilepsy = epilepsy;
    }

    public Integer getThyropathy() {
        return thyropathy;
    }

    public void setThyropathy(Integer thyropathy) {
        this.thyropathy = thyropathy;
    }

    public Integer getNephritis() {
        return nephritis;
    }

    public void setNephritis(Integer nephritis) {
        this.nephritis = nephritis;
    }

    public Integer getTumor() {
        return tumor;
    }

    public void setTumor(Integer tumor) {
        this.tumor = tumor;
    }

    public Integer getTuberculosis() {
        return tuberculosis;
    }

    public void setTuberculosis(Integer tuberculosis) {
        this.tuberculosis = tuberculosis;
    }

    public Integer getHepatitis() {
        return hepatitis;
    }

    public void setHepatitis(Integer hepatitis) {
        this.hepatitis = hepatitis;
    }

    public Integer getGonorrhea() {
        return gonorrhea;
    }

    public void setGonorrhea(Integer gonorrhea) {
        this.gonorrhea = gonorrhea;
    }

    public Integer getSyphilis() {
        return syphilis;
    }

    public void setSyphilis(Integer syphilis) {
        this.syphilis = syphilis;
    }

    public Integer getChlamydia() {
        return chlamydia;
    }

    public void setChlamydia(Integer chlamydia) {
        this.chlamydia = chlamydia;
    }

    public Integer getDisorders() {
        return disorders;
    }

    public void setDisorders(Integer disorders) {
        this.disorders = disorders;
    }

    public Integer getUterusInflammation() {
        return uterusInflammation;
    }

    public void setUterusInflammation(Integer uterusInflammation) {
        this.uterusInflammation = uterusInflammation;
    }

    public Integer getInfertility() {
        return infertility;
    }

    public void setInfertility(Integer infertility) {
        this.infertility = infertility;
    }

    public Integer getVaginitis() {
        return vaginitis;
    }

    public void setVaginitis(Integer vaginitis) {
        this.vaginitis = vaginitis;
    }

    public Integer getCervical() {
        return cervical;
    }

    public void setCervical(Integer cervical) {
        this.cervical = cervical;
    }

    public Integer getEndometriosis() {
        return endometriosis;
    }

    public void setEndometriosis(Integer endometriosis) {
        this.endometriosis = endometriosis;
    }

    public Integer getUterineFibroids() {
        return uterineFibroids;
    }

    public void setUterineFibroids(Integer uterineFibroids) {
        this.uterineFibroids = uterineFibroids;
    }

    public Integer getOvarianCyst() {
        return ovarianCyst;
    }

    public void setOvarianCyst(Integer ovarianCyst) {
        this.ovarianCyst = ovarianCyst;
    }

    public Integer getOvarySyndrome() {
        return ovarySyndrome;
    }

    public void setOvarySyndrome(Integer ovarySyndrome) {
        this.ovarySyndrome = ovarySyndrome;
    }

    public Integer getRubella() {
        return rubella;
    }

    public void setRubella(Integer rubella) {
        this.rubella = rubella;
    }

    public Integer getHepatitisB() {
        return hepatitisB;
    }

    public void setHepatitisB(Integer hepatitisB) {
        this.hepatitisB = hepatitisB;
    }

    public Integer getSynthetic() {
        return synthetic;
    }

    public void setSynthetic(Integer synthetic) {
        this.synthetic = synthetic;
    }

    public Integer getImplants() {
        return implants;
    }

    public void setImplants(Integer implants) {
        this.implants = implants;
    }

    public Integer getContraceptives() {
        return contraceptives;
    }

    public void setContraceptives(Integer contraceptives) {
        this.contraceptives = contraceptives;
    }

    public Integer getCondoms() {
        return condoms;
    }

    public void setCondoms(Integer condoms) {
        this.condoms = condoms;
    }

    public Integer getExternalUse() {
        return externalUse;
    }

    public void setExternalUse(Integer externalUse) {
        this.externalUse = externalUse;
    }

    public Integer getContraception() {
        return contraception;
    }

    public void setContraception(Integer contraception) {
        this.contraception = contraception;
    }

    public Integer getStillbirth() {
        return stillbirth;
    }

    public void setStillbirth(Integer stillbirth) {
        this.stillbirth = stillbirth;
    }

    public Integer getAbortion() {
        return abortion;
    }

    public void setAbortion(Integer abortion) {
        this.abortion = abortion;
    }

    public Integer getArtificialAbortion() {
        return artificialAbortion;
    }

    public void setArtificialAbortion(Integer artificialAbortion) {
        this.artificialAbortion = artificialAbortion;
    }

    public Integer getPreDiabetes() {
        return preDiabetes;
    }

    public void setPreDiabetes(Integer preDiabetes) {
        this.preDiabetes = preDiabetes;
    }

    public Integer getPreHighBlood() {
        return preHighBlood;
    }

    public void setPreHighBlood(Integer preHighBlood) {
        this.preHighBlood = preHighBlood;
    }

    public Integer getPreBile() {
        return preBile;
    }

    public void setPreBile(Integer preBile) {
        this.preBile = preBile;
    }

    public Integer getPreThyropathy() {
        return preThyropathy;
    }

    public void setPreThyropathy(Integer preThyropathy) {
        this.preThyropathy = preThyropathy;
    }

    public Integer getPreAnemia() {
        return preAnemia;
    }

    public void setPreAnemia(Integer preAnemia) {
        this.preAnemia = preAnemia;
    }

    public Integer getMediterraneanAnemia() {
        return mediterraneanAnemia;
    }

    public void setMediterraneanAnemia(Integer mediterraneanAnemia) {
        this.mediterraneanAnemia = mediterraneanAnemia;
    }

    public Integer getAlbino() {
        return albino;
    }

    public void setAlbino(Integer albino) {
        this.albino = albino;
    }

    public Integer getG6pd() {
        return g6pd;
    }

    public void setG6pd(Integer g6pd) {
        this.g6pd = g6pd;
    }

    public Integer getHemophilia() {
        return hemophilia;
    }

    public void setHemophilia(Integer hemophilia) {
        this.hemophilia = hemophilia;
    }

    public Integer getCongenitalHeartDisease() {
        return congenitalHeartDisease;
    }

    public void setCongenitalHeartDisease(Integer congenitalHeartDisease) {
        this.congenitalHeartDisease = congenitalHeartDisease;
    }

    public Integer getSyndrome() {
        return syndrome;
    }

    public void setSyndrome(Integer syndrome) {
        this.syndrome = syndrome;
    }

    public Integer getFamilyDiabetes() {
        return familyDiabetes;
    }

    public void setFamilyDiabetes(Integer familyDiabetes) {
        this.familyDiabetes = familyDiabetes;
    }

    public Integer getMentalLow() {
        return mentalLow;
    }

    public void setMentalLow(Integer mentalLow) {
        this.mentalLow = mentalLow;
    }

    public Integer getHearLow() {
        return hearLow;
    }

    public void setHearLow(Integer hearLow) {
        this.hearLow = hearLow;
    }

    public Integer getVisionLow() {
        return visionLow;
    }

    public void setVisionLow(Integer visionLow) {
        this.visionLow = visionLow;
    }

    public Integer getChildDead() {
        return childDead;
    }

    public void setChildDead(Integer childDead) {
        this.childDead = childDead;
    }

    public Integer getRadiation() {
        return radiation;
    }

    public void setRadiation(Integer radiation) {
        this.radiation = radiation;
    }

    public Integer getHighTemperature() {
        return highTemperature;
    }

    public void setHighTemperature(Integer highTemperature) {
        this.highTemperature = highTemperature;
    }

    public Integer getNoise() {
        return noise;
    }

    public void setNoise(Integer noise) {
        this.noise = noise;
    }

    public Integer getOrganicSolvent() {
        return organicSolvent;
    }

    public void setOrganicSolvent(Integer organicSolvent) {
        this.organicSolvent = organicSolvent;
    }

    public Integer getPet() {
        return pet;
    }

    public void setPet(Integer pet) {
        this.pet = pet;
    }

    public Integer getVibration() {
        return vibration;
    }

    public void setVibration(Integer vibration) {
        this.vibration = vibration;
    }

    public Integer getHeavyMetal() {
        return heavyMetal;
    }

    public void setHeavyMetal(Integer heavyMetal) {
        this.heavyMetal = heavyMetal;
    }

    public Integer getPesticide() {
        return pesticide;
    }

    public void setPesticide(Integer pesticide) {
        this.pesticide = pesticide;
    }

    public Integer getMildewFood() {
        return mildewFood;
    }

    public void setMildewFood(Integer mildewFood) {
        this.mildewFood = mildewFood;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
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
}