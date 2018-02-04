package com.foundation.dao.entity.sync;

import java.util.Date;
/**
 *
 * @ClassName: BusiPregnancyArchive
 * @Description: 3、	妊娠服务档案表
 * @author wangsen
 * @date 2016年10月19日 上午10:20:31
 *
 */
public class BusiPregnancyArchive extends BusiBaseEntity  {

    private String pregnancyArchiveId;

    private String archiveCode;

    private String informedConsentSigned;

    private String wifeCertNum;

    private String wifeName;

    private String husbandCertNum;

    private String husbandName;

    private String serviceZoneCode;

    private String serviceOrganizationId;

    private String serviceOrganizationName;

    private String assitZoneCode;

    private String assitOrganizationId;

    private String assitOrganizationName;

    private String followupOrganizationId;

    private String followupOrganizationName;

    private String followupZoneCode;


    private String zoneCityCode;

    private String zoneCountyCode;

    private String zoneTownCode;

    private String provinceCode;

    private String cityCode;

    private String countyCode;

    private String townCode;

    private Integer isUpdate;

    private String tableLists;

    private String userId;

    private String userName;

    private Integer floatPopulation;

    private Date evaluateStartTime;

    private Date evaluateEndTime;

    private Date earlyPreEndTime;

    private Integer evaluateStatus;

    private Date inputDate;

    private String telPhoneNum;

    private Integer iscomplete;

    private String createUserId;

    private Date createDatetime;

    private String updateUserId;

    private Date updateDatetime;

    private Integer isdelete;

    public String getPregnancyArchiveId() {
        return pregnancyArchiveId;
    }

    public void setPregnancyArchiveId(String pregnancyArchiveId) {
        this.pregnancyArchiveId = pregnancyArchiveId == null ? null : pregnancyArchiveId.trim();
    }

    public String getArchiveCode() {
        return archiveCode;
    }

    public void setArchiveCode(String archiveCode) {
        this.archiveCode = archiveCode == null ? null : archiveCode.trim();
    }

    public String getInformedConsentSigned() {
        return informedConsentSigned;
    }

    public void setInformedConsentSigned(String informedConsentSigned) {
        this.informedConsentSigned = informedConsentSigned == null ? null : informedConsentSigned.trim();
    }

    public String getWifeCertNum() {
        return wifeCertNum;
    }

    public void setWifeCertNum(String wifeCertNum) {
        this.wifeCertNum = wifeCertNum == null ? null : wifeCertNum.trim();
    }

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName == null ? null : wifeName.trim();
    }

    public String getHusbandCertNum() {
        return husbandCertNum;
    }

    public void setHusbandCertNum(String husbandCertNum) {
        this.husbandCertNum = husbandCertNum == null ? null : husbandCertNum.trim();
    }

    public String getHusbandName() {
        return husbandName;
    }

    public void setHusbandName(String husbandName) {
        this.husbandName = husbandName == null ? null : husbandName.trim();
    }

    public String getServiceZoneCode() {
        return serviceZoneCode;
    }

    public void setServiceZoneCode(String serviceZoneCode) {
        this.serviceZoneCode = serviceZoneCode == null ? null : serviceZoneCode.trim();
    }

    public String getServiceOrganizationId() {
        return serviceOrganizationId;
    }

    public void setServiceOrganizationId(String serviceOrganizationId) {
        this.serviceOrganizationId = serviceOrganizationId == null ? null : serviceOrganizationId.trim();
    }

    public String getServiceOrganizationName() {
        return serviceOrganizationName;
    }

    public void setServiceOrganizationName(String serviceOrganizationName) {
        this.serviceOrganizationName = serviceOrganizationName == null ? null : serviceOrganizationName.trim();
    }

    public String getAssitZoneCode() {
        return assitZoneCode;
    }

    public void setAssitZoneCode(String assitZoneCode) {
        this.assitZoneCode = assitZoneCode == null ? null : assitZoneCode.trim();
    }

    public String getAssitOrganizationId() {
        return assitOrganizationId;
    }

    public void setAssitOrganizationId(String assitOrganizationId) {
        this.assitOrganizationId = assitOrganizationId == null ? null : assitOrganizationId.trim();
    }

    public String getAssitOrganizationName() {
        return assitOrganizationName;
    }

    public void setAssitOrganizationName(String assitOrganizationName) {
        this.assitOrganizationName = assitOrganizationName == null ? null : assitOrganizationName.trim();
    }

    public String getFollowupOrganizationId() {
        return followupOrganizationId;
    }

    public void setFollowupOrganizationId(String followupOrganizationId) {
        this.followupOrganizationId = followupOrganizationId == null ? null : followupOrganizationId.trim();
    }

    public String getFollowupOrganizationName() {
        return followupOrganizationName;
    }

    public void setFollowupOrganizationName(String followupOrganizationName) {
        this.followupOrganizationName = followupOrganizationName == null ? null : followupOrganizationName.trim();
    }

    public String getFollowupZoneCode() {
        return followupZoneCode;
    }

    public void setFollowupZoneCode(String followupZoneCode) {
        this.followupZoneCode = followupZoneCode == null ? null : followupZoneCode.trim();
    }


    public String getZoneCityCode() {
        return zoneCityCode;
    }

    public void setZoneCityCode(String zoneCityCode) {
        this.zoneCityCode = zoneCityCode == null ? null : zoneCityCode.trim();
    }

    public String getZoneCountyCode() {
        return zoneCountyCode;
    }

    public void setZoneCountyCode(String zoneCountyCode) {
        this.zoneCountyCode = zoneCountyCode == null ? null : zoneCountyCode.trim();
    }

    public String getZoneTownCode() {
        return zoneTownCode;
    }

    public void setZoneTownCode(String zoneTownCode) {
        this.zoneTownCode = zoneTownCode == null ? null : zoneTownCode.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode == null ? null : countyCode.trim();
    }

    public String getTownCode() {
        return townCode;
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode == null ? null : townCode.trim();
    }

    public Integer getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(Integer isUpdate) {
        this.isUpdate = isUpdate;
    }

    public String getTableLists() {
        return tableLists;
    }

    public void setTableLists(String tableLists) {
        this.tableLists = tableLists == null ? null : tableLists.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getFloatPopulation() {
        return floatPopulation;
    }

    public void setFloatPopulation(Integer floatPopulation) {
        this.floatPopulation = floatPopulation;
    }

    public Date getEvaluateStartTime() {
        return evaluateStartTime;
    }

    public void setEvaluateStartTime(Date evaluateStartTime) {
        this.evaluateStartTime = evaluateStartTime;
    }

    public Date getEvaluateEndTime() {
        return evaluateEndTime;
    }

    public void setEvaluateEndTime(Date evaluateEndTime) {
        this.evaluateEndTime = evaluateEndTime;
    }

    public Date getEarlyPreEndTime() {
        return earlyPreEndTime;
    }

    public void setEarlyPreEndTime(Date earlyPreEndTime) {
        this.earlyPreEndTime = earlyPreEndTime;
    }

    public Integer getEvaluateStatus() {
        return evaluateStatus;
    }

    public void setEvaluateStatus(Integer evaluateStatus) {
        this.evaluateStatus = evaluateStatus;
    }

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public String getTelPhoneNum() {
        return telPhoneNum;
    }

    public void setTelPhoneNum(String telPhoneNum) {
        this.telPhoneNum = telPhoneNum == null ? null : telPhoneNum.trim();
    }

    public Integer getIscomplete() {
        return iscomplete;
    }

    public void setIscomplete(Integer iscomplete) {
        this.iscomplete = iscomplete;
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