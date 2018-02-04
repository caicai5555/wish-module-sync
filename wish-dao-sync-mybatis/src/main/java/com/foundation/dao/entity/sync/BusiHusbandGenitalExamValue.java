package com.foundation.dao.entity.sync;

import java.util.Date;
/**
 * @Title: BusiHusbandGenitalExamValue
 * @Description: 14、	丈夫生殖系统检查值表
 * @author SamWang(wangsammu@gmail.com)
 * @date 2016/10/21 10:49 
 */
 
public class BusiHusbandGenitalExamValue extends BusiBaseEntity {
    private String husbandGenitalId;

    private String pregnancyArchiveId;

    private String checkNo;

    private Date checkTime;

    private String organizationId;

    private String checkDoctor;

    private Integer iscomplete;

    private Integer isCheck;

    private String uncheckReason;

    private Integer pubes;

    private String pubesDeail;

    private Integer adamSApple;

    private String adamSAppleDeail;

    private Integer penis;

    private String penisDeail;

    private Integer prepuce;

    private Integer testis;

    private Float leftTesticularVolume;

    private Float rightTesticularVolume;

    private Integer epididymis;

    private String epididymisDetail;

    private Integer spermaduct;

    private String spermaductDetail;

    private Integer varicocele;

    private String varicoceleDetail;

    private String varicoceleDegree;

    private String otherExam;

    private String createUserId;

    private Date createDatetime;

    private String updateUserId;

    private Date updateDatetime;

    private Integer isdelete;

    public String getHusbandGenitalId() {
        return husbandGenitalId;
    }

    public void setHusbandGenitalId(String husbandGenitalId) {
        this.husbandGenitalId = husbandGenitalId == null ? null : husbandGenitalId.trim();
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

    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }

    public String getUncheckReason() {
        return uncheckReason;
    }

    public void setUncheckReason(String uncheckReason) {
        this.uncheckReason = uncheckReason == null ? null : uncheckReason.trim();
    }

    public Integer getPubes() {
        return pubes;
    }

    public void setPubes(Integer pubes) {
        this.pubes = pubes;
    }

    public String getPubesDeail() {
        return pubesDeail;
    }

    public void setPubesDeail(String pubesDeail) {
        this.pubesDeail = pubesDeail == null ? null : pubesDeail.trim();
    }

    public Integer getAdamSApple() {
        return adamSApple;
    }

    public void setAdamSApple(Integer adamSApple) {
        this.adamSApple = adamSApple;
    }

    public String getAdamSAppleDeail() {
        return adamSAppleDeail;
    }

    public void setAdamSAppleDeail(String adamSAppleDeail) {
        this.adamSAppleDeail = adamSAppleDeail == null ? null : adamSAppleDeail.trim();
    }

    public Integer getPenis() {
        return penis;
    }

    public void setPenis(Integer penis) {
        this.penis = penis;
    }

    public String getPenisDeail() {
        return penisDeail;
    }

    public void setPenisDeail(String penisDeail) {
        this.penisDeail = penisDeail == null ? null : penisDeail.trim();
    }

    public Integer getPrepuce() {
        return prepuce;
    }

    public void setPrepuce(Integer prepuce) {
        this.prepuce = prepuce;
    }

    public Integer getTestis() {
        return testis;
    }

    public void setTestis(Integer testis) {
        this.testis = testis;
    }

    public Float getLeftTesticularVolume() {
        return leftTesticularVolume;
    }

    public void setLeftTesticularVolume(Float leftTesticularVolume) {
        this.leftTesticularVolume = leftTesticularVolume;
    }

    public Float getRightTesticularVolume() {
        return rightTesticularVolume;
    }

    public void setRightTesticularVolume(Float rightTesticularVolume) {
        this.rightTesticularVolume = rightTesticularVolume;
    }

    public Integer getEpididymis() {
        return epididymis;
    }

    public void setEpididymis(Integer epididymis) {
        this.epididymis = epididymis;
    }

    public String getEpididymisDetail() {
        return epididymisDetail;
    }

    public void setEpididymisDetail(String epididymisDetail) {
        this.epididymisDetail = epididymisDetail == null ? null : epididymisDetail.trim();
    }

    public Integer getSpermaduct() {
        return spermaduct;
    }

    public void setSpermaduct(Integer spermaduct) {
        this.spermaduct = spermaduct;
    }

    public String getSpermaductDetail() {
        return spermaductDetail;
    }

    public void setSpermaductDetail(String spermaductDetail) {
        this.spermaductDetail = spermaductDetail == null ? null : spermaductDetail.trim();
    }

    public Integer getVaricocele() {
        return varicocele;
    }

    public void setVaricocele(Integer varicocele) {
        this.varicocele = varicocele;
    }

    public String getVaricoceleDetail() {
        return varicoceleDetail;
    }

    public void setVaricoceleDetail(String varicoceleDetail) {
        this.varicoceleDetail = varicoceleDetail == null ? null : varicoceleDetail.trim();
    }

    public String getVaricoceleDegree() {
        return varicoceleDegree;
    }

    public void setVaricoceleDegree(String varicoceleDegree) {
        this.varicoceleDegree = varicoceleDegree == null ? null : varicoceleDegree.trim();
    }

    public String getOtherExam() {
        return otherExam;
    }

    public void setOtherExam(String otherExam) {
        this.otherExam = otherExam == null ? null : otherExam.trim();
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