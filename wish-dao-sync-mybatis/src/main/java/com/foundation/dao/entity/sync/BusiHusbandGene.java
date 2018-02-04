package com.foundation.dao.entity.sync;

import java.util.Date;

/**
 * @Title: BusiHusbandGene
 * @Description: 18、	丈夫基因检测值表
 * @author SamWang(wangsammu@gmail.com)
 * @date 2016/10/21 10:50 
 */
 
public class BusiHusbandGene extends BusiBaseEntity {
    /** 主键*/
    private String husbandGeneId;
    /** 服务档案编号*/
    private String pregnancyArchiveId;
    /** 检查单号*/
    private String checkNo;
    /** 检查日期*/
    private Date checkTime;
    /** 检验机构*/
    private String organizationId;
    /** 医师签名*/
    private String checkDoctor;
    /** 完成状态
     未填写
     未完成
     暂保存
     已完成
     * */
    private Byte iscomplete;
    /** */
    private Byte isGeneCheck;
    /** α基因检测结果
     0=正常
     1=异常
     */
    private Byte aGeneIsNormal;
    /** α--SEA
     0=无缺失
     1=杂合型缺失
     2=纯合型缺失
     */
    private Byte aSea;
    /** -α3.7
     0=无缺失
     1=杂合型缺失
     2=纯合型缺失
     */
    private Byte a37;
    /** -α4.2
     0=无缺失
     1=杂合型缺失
     2=纯合型缺失
     */
    private Byte a42;
    /** α-CS
     0=无缺失
     1=杂合型缺失
     2=纯合型缺失
     */
    private Byte aCs;
    /**
     α-QS
     0=无缺失
     1=杂合型缺失
     2=纯合型缺失
     */
    private Byte aQs;
    /** α-WS
     0=无缺失
     1=杂合型缺失
     2=纯合型缺失
     */
    private Byte aWs;
    /**α其他异常 */
    private String aOther;
    /** β基因检测结果
     0=正常
     1=异常
     */
    private Byte bGeneIsNormal;
    /** β基因CD1415G
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bCd1415g;
    /** β基因CD17AT
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bCd17at;
    /**β基因CD2728A
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bCd2728a;
    /** β基因CD2728C
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bCd2728c;
    /** β基因28(A→G)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte b28ag;
    /** β基因28(A→C)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte b28ac;
    /** β基因29(A→G)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte b30ag;
    /** β基因30(T→C)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte b30tc;
    /** β基因CD31(-C)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bCd31c;
    /** β基因32(C→A)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte b32ca;
    /** β基因CD41-42(-CTTT)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bCd4142cttt;
    /** β基因CD41-42(-TCTT)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bCd4142tctt;
    /**
     β基因CD43(G→T)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bCd43gt;
    /**
     β基因CD43
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bCd43;
    /** β基因CD71-72(+A)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bCd7172a;
    /** β基因CAP+1(A→C)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bCapac;
    /** β基因CAP+40--+43(-AAAC)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bCap4043aaac;
    /** β基因IntM（ATG→AGG）
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bInimAtgAgg;
    /** β基因IVS-I-1 (G→T)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bIvsI1gt;
    /** β基因IVS-I-1 (G→A)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bIvsI1ga;
    /** β基因IVS-I-5(G→C)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bIvsITgc;
    /** β基因IVS-II-654(C→T)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bIvsIi654ct;
    /** β基因β E
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bBe;
    /** β基因β E（GAG→AAG）
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte bBeGagAag;
    /** β基因50(G→A)
     0=无缺失
     1=杂合型突变
     2=纯合型突变
     */
    private Byte b50ga;
    /** β突变其他型 */
    private String bOther;
    /** */
    private Byte bCd26;
    /** */
    private Byte b29;
    /**创建人 */
    private String createUserId;
    /** 创建时间*/
    private Date createDatetime;
    /** 修改人*/
    private String updateUserId;
    /** */
    private Date updateDatetime;
    /** 修改时间*/
    private Byte isdelete;

    public String getHusbandGeneId() {
        return husbandGeneId;
    }

    public void setHusbandGeneId(String husbandGeneId) {
        this.husbandGeneId = husbandGeneId == null ? null : husbandGeneId.trim();
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

    public Byte getIscomplete() {
        return iscomplete;
    }

    public void setIscomplete(Byte iscomplete) {
        this.iscomplete = iscomplete;
    }

    public Byte getIsGeneCheck() {
        return isGeneCheck;
    }

    public void setIsGeneCheck(Byte isGeneCheck) {
        this.isGeneCheck = isGeneCheck;
    }

    public Byte getAGeneIsNormal() {
        return aGeneIsNormal;
    }

    public void setaGeneIsNormal(Byte aGeneIsNormal) {
        this.aGeneIsNormal = aGeneIsNormal;
    }

    public Byte getaSea() {
        return aSea;
    }

    public void setaSea(Byte aSea) {
        this.aSea = aSea;
    }

    public Byte getA37() {
        return a37;
    }

    public void setA37(Byte a37) {
        this.a37 = a37;
    }

    public Byte getA42() {
        return a42;
    }

    public void setA42(Byte a42) {
        this.a42 = a42;
    }

    public Byte getaCs() {
        return aCs;
    }

    public void setaCs(Byte aCs) {
        this.aCs = aCs;
    }

    public Byte getaQs() {
        return aQs;
    }

    public void setaQs(Byte aQs) {
        this.aQs = aQs;
    }

    public Byte getaWs() {
        return aWs;
    }

    public void setaWs(Byte aWs) {
        this.aWs = aWs;
    }

    public String getaOther() {
        return aOther;
    }

    public void setaOther(String aOther) {
        this.aOther = aOther == null ? null : aOther.trim();
    }

    public Byte getBGeneIsNormal() {
        return bGeneIsNormal;
    }

    public void setbGeneIsNormal(Byte bGeneIsNormal) {
        this.bGeneIsNormal = bGeneIsNormal;
    }

    public Byte getbCd1415g() {
        return bCd1415g;
    }

    public void setbCd1415g(Byte bCd1415g) {
        this.bCd1415g = bCd1415g;
    }

    public Byte getbCd17at() {
        return bCd17at;
    }

    public void setbCd17at(Byte bCd17at) {
        this.bCd17at = bCd17at;
    }

    public Byte getbCd2728a() {
        return bCd2728a;
    }

    public void setbCd2728a(Byte bCd2728a) {
        this.bCd2728a = bCd2728a;
    }

    public Byte getbCd2728c() {
        return bCd2728c;
    }

    public void setbCd2728c(Byte bCd2728c) {
        this.bCd2728c = bCd2728c;
    }

    public Byte getB28ag() {
        return b28ag;
    }

    public void setB28ag(Byte b28ag) {
        this.b28ag = b28ag;
    }

    public Byte getB28ac() {
        return b28ac;
    }

    public void setB28ac(Byte b28ac) {
        this.b28ac = b28ac;
    }

    public Byte getB30ag() {
        return b30ag;
    }

    public void setB30ag(Byte b30ag) {
        this.b30ag = b30ag;
    }

    public Byte getB30tc() {
        return b30tc;
    }

    public void setB30tc(Byte b30tc) {
        this.b30tc = b30tc;
    }

    public Byte getbCd31c() {
        return bCd31c;
    }

    public void setbCd31c(Byte bCd31c) {
        this.bCd31c = bCd31c;
    }

    public Byte getB32ca() {
        return b32ca;
    }

    public void setB32ca(Byte b32ca) {
        this.b32ca = b32ca;
    }

    public Byte getbCd4142cttt() {
        return bCd4142cttt;
    }

    public void setbCd4142cttt(Byte bCd4142cttt) {
        this.bCd4142cttt = bCd4142cttt;
    }

    public Byte getbCd4142tctt() {
        return bCd4142tctt;
    }

    public void setbCd4142tctt(Byte bCd4142tctt) {
        this.bCd4142tctt = bCd4142tctt;
    }

    public Byte getbCd43gt() {
        return bCd43gt;
    }

    public void setbCd43gt(Byte bCd43gt) {
        this.bCd43gt = bCd43gt;
    }

    public Byte getbCd43() {
        return bCd43;
    }

    public void setbCd43(Byte bCd43) {
        this.bCd43 = bCd43;
    }

    public Byte getbCd7172a() {
        return bCd7172a;
    }

    public void setbCd7172a(Byte bCd7172a) {
        this.bCd7172a = bCd7172a;
    }

    public Byte getbCapac() {
        return bCapac;
    }

    public void setbCapac(Byte bCapac) {
        this.bCapac = bCapac;
    }

    public Byte getbCap4043aaac() {
        return bCap4043aaac;
    }

    public void setbCap4043aaac(Byte bCap4043aaac) {
        this.bCap4043aaac = bCap4043aaac;
    }

    public Byte getbInimAtgAgg() {
        return bInimAtgAgg;
    }

    public void setbInimAtgAgg(Byte bInimAtgAgg) {
        this.bInimAtgAgg = bInimAtgAgg;
    }

    public Byte getbIvsI1gt() {
        return bIvsI1gt;
    }

    public void setbIvsI1gt(Byte bIvsI1gt) {
        this.bIvsI1gt = bIvsI1gt;
    }

    public Byte getbIvsI1ga() {
        return bIvsI1ga;
    }

    public void setbIvsI1ga(Byte bIvsI1ga) {
        this.bIvsI1ga = bIvsI1ga;
    }

    public Byte getbIvsITgc() {
        return bIvsITgc;
    }

    public void setbIvsITgc(Byte bIvsITgc) {
        this.bIvsITgc = bIvsITgc;
    }

    public Byte getbIvsIi654ct() {
        return bIvsIi654ct;
    }

    public void setbIvsIi654ct(Byte bIvsIi654ct) {
        this.bIvsIi654ct = bIvsIi654ct;
    }

    public Byte getbBe() {
        return bBe;
    }

    public void setbBe(Byte bBe) {
        this.bBe = bBe;
    }

    public Byte getbBeGagAag() {
        return bBeGagAag;
    }

    public void setbBeGagAag(Byte bBeGagAag) {
        this.bBeGagAag = bBeGagAag;
    }

    public Byte getB50ga() {
        return b50ga;
    }

    public void setB50ga(Byte b50ga) {
        this.b50ga = b50ga;
    }

    public String getbOther() {
        return bOther;
    }

    public void setbOther(String bOther) {
        this.bOther = bOther == null ? null : bOther.trim();
    }

    public Byte getbCd26() {
        return bCd26;
    }

    public void setbCd26(Byte bCd26) {
        this.bCd26 = bCd26;
    }

    public Byte getB29() {
        return b29;
    }

    public void setB29(Byte b29) {
        this.b29 = b29;
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

    public Byte getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Byte isdelete) {
        this.isdelete = isdelete;
    }
}