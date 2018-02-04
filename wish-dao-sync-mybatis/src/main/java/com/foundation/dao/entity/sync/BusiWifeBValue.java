package com.foundation.dao.entity.sync;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Title: BusiWifeBValue
 * @Description: 12、	妻子妇科B超检查结果表
 * @author SamWang(wangsammu@gmail.com)
 * @date 2016/10/21 10:51 
 */
 
public class BusiWifeBValue  extends BusiBaseEntity {
    private String wifeBValueId;

    private String pregnancyArchiveId;

    private String checkNo;

    private Date checkTime;

    private String organizationId;

    private String checkDoctor;

    private Integer iscomplete;

    private Integer checkStatus;

    private Integer location;

    private BigDecimal sizeLong;

    private BigDecimal sizeWide;

    private BigDecimal sizeBeforeAfter;

    private Integer thick;

    private Integer isSynthetic;

    private Integer syntheticIsNormal;

    private String bDetail;

    private String bOtherDetail;

    private String refuseReason;

    private String detail;

    private Integer echo;

    private String size;

    private Integer form;

    private Integer outline;

    private Integer filingStatus;

    private Integer bilateralAnnex;

    private String createUserId;

    private Date createDatetime;

    private String updateUserId;

    private Date updateDatetime;

    private Integer isdelete;

    public String getWifeBValueId() {
        return wifeBValueId;
    }

    public void setWifeBValueId(String wifeBValueId) {
        this.wifeBValueId = wifeBValueId == null ? null : wifeBValueId.trim();
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

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public BigDecimal getSizeLong() {
        return sizeLong;
    }

    public void setSizeLong(BigDecimal sizeLong) {
        this.sizeLong = sizeLong;
    }

    public BigDecimal getSizeWide() {
        return sizeWide;
    }

    public void setSizeWide(BigDecimal sizeWide) {
        this.sizeWide = sizeWide;
    }

    public BigDecimal getSizeBeforeAfter() {
        return sizeBeforeAfter;
    }

    public void setSizeBeforeAfter(BigDecimal sizeBeforeAfter) {
        this.sizeBeforeAfter = sizeBeforeAfter;
    }

    public Integer getThick() {
        return thick;
    }

    public void setThick(Integer thick) {
        this.thick = thick;
    }

    public Integer getIsSynthetic() {
        return isSynthetic;
    }

    public void setIsSynthetic(Integer isSynthetic) {
        this.isSynthetic = isSynthetic;
    }

    public Integer getSyntheticIsNormal() {
        return syntheticIsNormal;
    }

    public void setSyntheticIsNormal(Integer syntheticIsNormal) {
        this.syntheticIsNormal = syntheticIsNormal;
    }

    public String getBDetail() {
        return bDetail;
    }

    public void setbDetail(String bDetail) {
        this.bDetail = bDetail == null ? null : bDetail.trim();
    }

    public String getbOtherDetail() {
        return bOtherDetail;
    }

    public void setbOtherDetail(String bOtherDetail) {
        this.bOtherDetail = bOtherDetail == null ? null : bOtherDetail.trim();
    }

    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason == null ? null : refuseReason.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Integer getEcho() {
        return echo;
    }

    public void setEcho(Integer echo) {
        this.echo = echo;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public Integer getForm() {
        return form;
    }

    public void setForm(Integer form) {
        this.form = form;
    }

    public Integer getOutline() {
        return outline;
    }

    public void setOutline(Integer outline) {
        this.outline = outline;
    }

    public Integer getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(Integer filingStatus) {
        this.filingStatus = filingStatus;
    }

    public Integer getBilateralAnnex() {
        return bilateralAnnex;
    }

    public void setBilateralAnnex(Integer bilateralAnnex) {
        this.bilateralAnnex = bilateralAnnex;
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