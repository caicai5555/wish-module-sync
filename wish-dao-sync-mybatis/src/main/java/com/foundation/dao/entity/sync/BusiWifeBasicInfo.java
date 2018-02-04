package com.foundation.dao.entity.sync;

import java.io.Serializable;
import java.util.Date;
/**
 * @Title: BusiWifeBasicInfo.java
 * @Package com.foundation.dao.entity.sync
 * @Description: 4、妻子基本信息实体  对应表：busi_wife_basic_info
 * @author chunyangli(chunyangli@bioeh.com)
 * @date 2016/10/21 15:00 
 */
public class BusiWifeBasicInfo extends BusiBaseEntity {
    private String wifeBasicInfoId;//主键id

    private String pregnancyArchiveId;//服务档案ID

    private String name;//姓名

    private Date birthday;//出生日期

    private Integer age;//建档时年龄

    private Integer nation;//民族

    private Integer education;//文化程度

    private Integer certificateType;//证件类型

    private String certificateNumber;//证件号码

    private Integer occupation;//职业

    private String occupationOthers;//其他职业

    private String postCode;//邮编

    private String phoneNum;//联系电话

    private Integer followupType;//做过的随访类型

    private Integer hukouType;//户口性质

    private String addressProvince;//现住址—省

    private String addressCity;//现住址—市

    private String addressCounty;//现住址—县

    private String addressTown;//现住址-乡镇

    private String addressVillage;//现住址--村

    private String hukouProvince;//户口所在地——省

    private String hukouCity;//户口所在地——市

    private String hukouCounty;//户口所在地——县

    private String hukouTown;//户口所在地-乡镇

    private String hukouVillage;//户口所在地——村

    private Date lastModifyTime;//最后修改时间

    private Date marryDate;//结婚日期

    private Integer iscomplete;//基本信息完成状态

    private String createUserId;//创建人

    private Date createDatetime;//创建时间

    private String updateUserId;//修改人

    private Date updateDatetime;//修改时间

    private Integer isdelete;//标记是否删除

    public String getWifeBasicInfoId() {
        return wifeBasicInfoId;
    }

    public void setWifeBasicInfoId(String wifeBasicInfoId) {
        this.wifeBasicInfoId = wifeBasicInfoId == null ? null : wifeBasicInfoId.trim();
    }

    public String getPregnancyArchiveId() {
        return pregnancyArchiveId;
    }

    public void setPregnancyArchiveId(String pregnancyArchiveId) {
        this.pregnancyArchiveId = pregnancyArchiveId == null ? null : pregnancyArchiveId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNation() {
        return nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber == null ? null : certificateNumber.trim();
    }

    public Integer getOccupation() {
        return occupation;
    }

    public void setOccupation(Integer occupation) {
        this.occupation = occupation;
    }

    public String getOccupationOthers() {
        return occupationOthers;
    }

    public void setOccupationOthers(String occupationOthers) {
        this.occupationOthers = occupationOthers == null ? null : occupationOthers.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public Integer getFollowupType() {
        return followupType;
    }

    public void setFollowupType(Integer followupType) {
        this.followupType = followupType;
    }

    public Integer getHukouType() {
        return hukouType;
    }

    public void setHukouType(Integer hukouType) {
        this.hukouType = hukouType;
    }

    public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince == null ? null : addressProvince.trim();
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity == null ? null : addressCity.trim();
    }

    public String getAddressCounty() {
        return addressCounty;
    }

    public void setAddressCounty(String addressCounty) {
        this.addressCounty = addressCounty == null ? null : addressCounty.trim();
    }

    public String getAddressTown() {
        return addressTown;
    }

    public void setAddressTown(String addressTown) {
        this.addressTown = addressTown == null ? null : addressTown.trim();
    }

    public String getAddressVillage() {
        return addressVillage;
    }

    public void setAddressVillage(String addressVillage) {
        this.addressVillage = addressVillage == null ? null : addressVillage.trim();
    }

    public String getHukouProvince() {
        return hukouProvince;
    }

    public void setHukouProvince(String hukouProvince) {
        this.hukouProvince = hukouProvince == null ? null : hukouProvince.trim();
    }

    public String getHukouCity() {
        return hukouCity;
    }

    public void setHukouCity(String hukouCity) {
        this.hukouCity = hukouCity == null ? null : hukouCity.trim();
    }

    public String getHukouCounty() {
        return hukouCounty;
    }

    public void setHukouCounty(String hukouCounty) {
        this.hukouCounty = hukouCounty == null ? null : hukouCounty.trim();
    }

    public String getHukouTown() {
        return hukouTown;
    }

    public void setHukouTown(String hukouTown) {
        this.hukouTown = hukouTown == null ? null : hukouTown.trim();
    }

    public String getHukouVillage() {
        return hukouVillage;
    }

    public void setHukouVillage(String hukouVillage) {
        this.hukouVillage = hukouVillage == null ? null : hukouVillage.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Date getMarryDate() {
        return marryDate;
    }

    public void setMarryDate(Date marryDate) {
        this.marryDate = marryDate;
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