package com.foundation.dao.entity.sync;

import java.util.Date;
/**
 * @Title: BusiWifeGenitalExamValue
 * @Description: 13、	妻子生殖系统检查值表
 * @author SamWang(wangsammu@gmail.com)
 * @date 2016/10/21 10:51 
 */
 
public class BusiWifeGenitalExamValue extends BusiBaseEntity {
    private String wifeGenitalId;

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

    private Integer bubby;

    private String bubbyDeail;

    private Integer vulva;

    private String vulvaDeail;

    private Integer vagina;

    private String vaginaDeail;

    private Integer secretion;

    private String secretionDeail;

    private Integer cervix;

    private String cervixDeail;

    private Integer uterineSize;

    private Integer uterineActivity;

    private Integer uterineMass;

    private String uterineMassDeail;

    private Integer bilateralAnnex;

    private String bilateralAnnexDetail;

    private String otherExam;

    private String createUserId;

    private Date createDatetime;

    private String updateUserId;

    private Date updateDatetime;

    private Integer isdelete;

    public String getWifeGenitalId() {
        return wifeGenitalId;
    }

    public void setWifeGenitalId(String wifeGenitalId) {
        this.wifeGenitalId = wifeGenitalId == null ? null : wifeGenitalId.trim();
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

    public Integer getBubby() {
        return bubby;
    }

    public void setBubby(Integer bubby) {
        this.bubby = bubby;
    }

    public String getBubbyDeail() {
        return bubbyDeail;
    }

    public void setBubbyDeail(String bubbyDeail) {
        this.bubbyDeail = bubbyDeail == null ? null : bubbyDeail.trim();
    }

    public Integer getVulva() {
        return vulva;
    }

    public void setVulva(Integer vulva) {
        this.vulva = vulva;
    }

    public String getVulvaDeail() {
        return vulvaDeail;
    }

    public void setVulvaDeail(String vulvaDeail) {
        this.vulvaDeail = vulvaDeail == null ? null : vulvaDeail.trim();
    }

    public Integer getVagina() {
        return vagina;
    }

    public void setVagina(Integer vagina) {
        this.vagina = vagina;
    }

    public String getVaginaDeail() {
        return vaginaDeail;
    }

    public void setVaginaDeail(String vaginaDeail) {
        this.vaginaDeail = vaginaDeail == null ? null : vaginaDeail.trim();
    }

    public Integer getSecretion() {
        return secretion;
    }

    public void setSecretion(Integer secretion) {
        this.secretion = secretion;
    }

    public String getSecretionDeail() {
        return secretionDeail;
    }

    public void setSecretionDeail(String secretionDeail) {
        this.secretionDeail = secretionDeail == null ? null : secretionDeail.trim();
    }

    public Integer getCervix() {
        return cervix;
    }

    public void setCervix(Integer cervix) {
        this.cervix = cervix;
    }

    public String getCervixDeail() {
        return cervixDeail;
    }

    public void setCervixDeail(String cervixDeail) {
        this.cervixDeail = cervixDeail == null ? null : cervixDeail.trim();
    }

    public Integer getUterineSize() {
        return uterineSize;
    }

    public void setUterineSize(Integer uterineSize) {
        this.uterineSize = uterineSize;
    }

    public Integer getUterineActivity() {
        return uterineActivity;
    }

    public void setUterineActivity(Integer uterineActivity) {
        this.uterineActivity = uterineActivity;
    }

    public Integer getUterineMass() {
        return uterineMass;
    }

    public void setUterineMass(Integer uterineMass) {
        this.uterineMass = uterineMass;
    }

    public String getUterineMassDeail() {
        return uterineMassDeail;
    }

    public void setUterineMassDeail(String uterineMassDeail) {
        this.uterineMassDeail = uterineMassDeail == null ? null : uterineMassDeail.trim();
    }

    public Integer getBilateralAnnex() {
        return bilateralAnnex;
    }

    public void setBilateralAnnex(Integer bilateralAnnex) {
        this.bilateralAnnex = bilateralAnnex;
    }

    public String getBilateralAnnexDetail() {
        return bilateralAnnexDetail;
    }

    public void setBilateralAnnexDetail(String bilateralAnnexDetail) {
        this.bilateralAnnexDetail = bilateralAnnexDetail == null ? null : bilateralAnnexDetail.trim();
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