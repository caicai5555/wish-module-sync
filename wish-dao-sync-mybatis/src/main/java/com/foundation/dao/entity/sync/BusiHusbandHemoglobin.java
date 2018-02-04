package com.foundation.dao.entity.sync;

import java.util.Date;

/**
 * @Title: BusiHusbandHemoglobin
 * @Description: 16、	丈夫血红蛋白分析表
 * @author SamWang(wangsammu@gmail.com)
 * @date 2016/10/21 10:50 
 */
 
public class BusiHusbandHemoglobin extends BusiBaseEntity {
    private String husbandHemoglobinId;

    private String pregnancyArchiveId;

    private String checkNo;

    private Date checkTime;

    private String organizationId;

    private String checkDoctor;

    private Integer iscomplete;

    private Integer isHemoglobinCheck;

    private Float hba2;

    private Float hba;

    private Float hbf;

    private String anomalousZone;

    private Integer isGeneExam;

    private String createUserId;

    private Date createDatetime;

    private String updateUserId;

    private Date updateDatetime;

    private Integer isdelete;

    public String getHusbandHemoglobinId() {
        return husbandHemoglobinId;
    }

    public void setHusbandHemoglobinId(String husbandHemoglobinId) {
        this.husbandHemoglobinId = husbandHemoglobinId == null ? null : husbandHemoglobinId.trim();
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

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getCheckDoctor() {
        return checkDoctor;
    }

    public void setCheckDoctor(String checkDoctor) {
        this.checkDoctor = checkDoctor == null ? null : checkDoctor.trim();
    }

    public Integer getIscomplete() {
        return iscomplete;
    }

    public void setIscomplete(Integer iscomplete) {
        this.iscomplete = iscomplete;
    }

    public Integer getIsHemoglobinCheck() {
        return isHemoglobinCheck;
    }

    public void setIsHemoglobinCheck(Integer isHemoglobinCheck) {
        this.isHemoglobinCheck = isHemoglobinCheck;
    }

    public Float getHba2() {
        return hba2;
    }

    public void setHba2(Float hba2) {
        this.hba2 = hba2;
    }

    public Float getHba() {
        return hba;
    }

    public void setHba(Float hba) {
        this.hba = hba;
    }

    public Float getHbf() {
        return hbf;
    }

    public void setHbf(Float hbf) {
        this.hbf = hbf;
    }

    public String getAnomalousZone() {
        return anomalousZone;
    }

    public void setAnomalousZone(String anomalousZone) {
        this.anomalousZone = anomalousZone == null ? null : anomalousZone.trim();
    }

    public Integer getIsGeneExam() {
        return isGeneExam;
    }

    public void setIsGeneExam(Integer isGeneExam) {
        this.isGeneExam = isGeneExam;
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