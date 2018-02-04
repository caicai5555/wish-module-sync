package com.foundation.dao.entity.sync;

import java.util.Date;

/**
 * @Title: BusiWifeGene.java
 * @Description: 17、	妻子基因检测值表
 * @author SamWang(wangsammu@gmail.com)
 * @date 2016/10/21 10:39
 */
public class BusiWifeGene  extends BusiBaseEntity {
    private String wifeGeneId;

    private String pregnancyArchiveId;

    private String checkNo;

    private Date checkTime;

    private String organizationId;

    private String checkDoctor;

    private Integer iscomplete;

    private Integer isGeneCheck;

    private Integer aGeneIsNormal;

    private Integer aSea;

    private Integer a37;

    private Integer a42;

    private Integer aCs;

    private Integer aQs;

    private Integer aWs;

    private String aOther;

    private Integer bGeneIsNormal;

    private Integer bCd1415g;

    private Integer bCd17at;

    private Integer bCd2728a;

    private Integer bCd2728c;

    private Integer b28ag;

    private Integer b28ac;

    private Integer b30ag;

    private Integer b30tc;

    private Integer bCd31c;

    private Integer b32ca;

    private Integer bCd4142cttt;

    private Integer bCd4142tctt;

    private Integer bCd43gt;

    private Integer bCd43;

    private Integer bCd7172a;

    private Integer bCapac;

    private Integer bCap4043aaac;

    private Integer bInimAtgAgg;

    private Integer bIvsI1gt;

    private Integer bIvsI1ga;

    private Integer bIvsITgc;

    private Integer bIvsIi654ct;

    private Integer bBe;

    private Integer bBeGagAag;

    private Integer b50ga;

    private Integer bCd26;

    private Integer b29;

    private String bOther;

    private String createUserId;

    private Date createDatetime;

    private String updateUserId;

    private Date updateDatetime;

    private Integer isdelete;

    public String getWifeGeneId() {
        return wifeGeneId;
    }

    public void setWifeGeneId(String wifeGeneId) {
        this.wifeGeneId = wifeGeneId == null ? null : wifeGeneId.trim();
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

    public Integer getIsGeneCheck() {
        return isGeneCheck;
    }

    public void setIsGeneCheck(Integer isGeneCheck) {
        this.isGeneCheck = isGeneCheck;
    }

    public Integer getAGeneIsNormal() {
        return aGeneIsNormal;
    }

    public void setaGeneIsNormal(Integer aGeneIsNormal) {
        this.aGeneIsNormal = aGeneIsNormal;
    }

    public Integer getaSea() {
        return aSea;
    }

    public void setaSea(Integer aSea) {
        this.aSea = aSea;
    }

    public Integer getA37() {
        return a37;
    }

    public void setA37(Integer a37) {
        this.a37 = a37;
    }

    public Integer getA42() {
        return a42;
    }

    public void setA42(Integer a42) {
        this.a42 = a42;
    }

    public Integer getaCs() {
        return aCs;
    }

    public void setaCs(Integer aCs) {
        this.aCs = aCs;
    }

    public Integer getaQs() {
        return aQs;
    }

    public void setaQs(Integer aQs) {
        this.aQs = aQs;
    }

    public Integer getaWs() {
        return aWs;
    }

    public void setaWs(Integer aWs) {
        this.aWs = aWs;
    }

    public String getaOther() {
        return aOther;
    }

    public void setaOther(String aOther) {
        this.aOther = aOther == null ? null : aOther.trim();
    }

    public Integer getBGeneIsNormal() {
        return bGeneIsNormal;
    }

    public void setbGeneIsNormal(Integer bGeneIsNormal) {
        this.bGeneIsNormal = bGeneIsNormal;
    }

    public Integer getbCd1415g() {
        return bCd1415g;
    }

    public void setbCd1415g(Integer bCd1415g) {
        this.bCd1415g = bCd1415g;
    }

    public Integer getbCd17at() {
        return bCd17at;
    }

    public void setbCd17at(Integer bCd17at) {
        this.bCd17at = bCd17at;
    }

    public Integer getbCd2728a() {
        return bCd2728a;
    }

    public void setbCd2728a(Integer bCd2728a) {
        this.bCd2728a = bCd2728a;
    }

    public Integer getbCd2728c() {
        return bCd2728c;
    }

    public void setbCd2728c(Integer bCd2728c) {
        this.bCd2728c = bCd2728c;
    }

    public Integer getB28ag() {
        return b28ag;
    }

    public void setB28ag(Integer b28ag) {
        this.b28ag = b28ag;
    }

    public Integer getB28ac() {
        return b28ac;
    }

    public void setB28ac(Integer b28ac) {
        this.b28ac = b28ac;
    }

    public Integer getB30ag() {
        return b30ag;
    }

    public void setB30ag(Integer b30ag) {
        this.b30ag = b30ag;
    }

    public Integer getB30tc() {
        return b30tc;
    }

    public void setB30tc(Integer b30tc) {
        this.b30tc = b30tc;
    }

    public Integer getbCd31c() {
        return bCd31c;
    }

    public void setbCd31c(Integer bCd31c) {
        this.bCd31c = bCd31c;
    }

    public Integer getB32ca() {
        return b32ca;
    }

    public void setB32ca(Integer b32ca) {
        this.b32ca = b32ca;
    }

    public Integer getbCd4142cttt() {
        return bCd4142cttt;
    }

    public void setbCd4142cttt(Integer bCd4142cttt) {
        this.bCd4142cttt = bCd4142cttt;
    }

    public Integer getbCd4142tctt() {
        return bCd4142tctt;
    }

    public void setbCd4142tctt(Integer bCd4142tctt) {
        this.bCd4142tctt = bCd4142tctt;
    }

    public Integer getbCd43gt() {
        return bCd43gt;
    }

    public void setbCd43gt(Integer bCd43gt) {
        this.bCd43gt = bCd43gt;
    }

    public Integer getbCd43() {
        return bCd43;
    }

    public void setbCd43(Integer bCd43) {
        this.bCd43 = bCd43;
    }

    public Integer getbCd7172a() {
        return bCd7172a;
    }

    public void setbCd7172a(Integer bCd7172a) {
        this.bCd7172a = bCd7172a;
    }

    public Integer getbCapac() {
        return bCapac;
    }

    public void setbCapac(Integer bCapac) {
        this.bCapac = bCapac;
    }

    public Integer getbCap4043aaac() {
        return bCap4043aaac;
    }

    public void setbCap4043aaac(Integer bCap4043aaac) {
        this.bCap4043aaac = bCap4043aaac;
    }

    public Integer getbInimAtgAgg() {
        return bInimAtgAgg;
    }

    public void setbInimAtgAgg(Integer bInimAtgAgg) {
        this.bInimAtgAgg = bInimAtgAgg;
    }

    public Integer getbIvsI1gt() {
        return bIvsI1gt;
    }

    public void setbIvsI1gt(Integer bIvsI1gt) {
        this.bIvsI1gt = bIvsI1gt;
    }

    public Integer getbIvsI1ga() {
        return bIvsI1ga;
    }

    public void setbIvsI1ga(Integer bIvsI1ga) {
        this.bIvsI1ga = bIvsI1ga;
    }

    public Integer getbIvsITgc() {
        return bIvsITgc;
    }

    public void setbIvsITgc(Integer bIvsITgc) {
        this.bIvsITgc = bIvsITgc;
    }

    public Integer getbIvsIi654ct() {
        return bIvsIi654ct;
    }

    public void setbIvsIi654ct(Integer bIvsIi654ct) {
        this.bIvsIi654ct = bIvsIi654ct;
    }

    public Integer getbBe() {
        return bBe;
    }

    public void setbBe(Integer bBe) {
        this.bBe = bBe;
    }

    public Integer getbBeGagAag() {
        return bBeGagAag;
    }

    public void setbBeGagAag(Integer bBeGagAag) {
        this.bBeGagAag = bBeGagAag;
    }

    public Integer getB50ga() {
        return b50ga;
    }

    public void setB50ga(Integer b50ga) {
        this.b50ga = b50ga;
    }

    public Integer getbCd26() {
        return bCd26;
    }

    public void setbCd26(Integer bCd26) {
        this.bCd26 = bCd26;
    }

    public Integer getB29() {
        return b29;
    }

    public void setB29(Integer b29) {
        this.b29 = b29;
    }

    public String getbOther() {
        return bOther;
    }

    public void setbOther(String bOther) {
        this.bOther = bOther == null ? null : bOther.trim();
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