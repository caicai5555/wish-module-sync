package com.foundation.service.common;

/**
 * @Title: BusiSourceName.java
 * @Package com.foundation.service.common
 * @Description: TODO
 * @author chunyangli(chunyangli)
 * @date 2016/12/5 17:24 
 */
public enum BusiSourceNameEnum {
    tjxt_busi_xjbt("新疆生产建设兵团","660000",	"xjbt","tjxt-busi-xjbt"),
    tjxt_busi_bj("北京市","110000",	"bj"	,"tjxt-busi-bj"),
    tjxt_busi_tj("天津市",	"120000","tj",	"tjxt-busi-tj"),
    tjxt_busi_heb("河北省","130000","heb","tjxt-busi-heb"),
    tjxt_busi_sx("山西省","140000","sx","tjxt-busi-sx"),
    tjxt_busi_nm("内蒙古自治区","150000","nm","tjxt-busi-nm"),
    tjxt_busi_ln("辽宁省","	210000","ln","tjxt-busi-ln"),
    tjxt_busi_jl("吉林省","	220000","jl","tjxt-busi-jl"),
    tjxt_busi_hlj("黑龙江省","230000","hlj","tjxt-busi-hlj"),
    tjxt_busi_sh("上海市","	310000","sh","tjxt-busi-sh"),
    tjxt_busi_js("江苏省","	320000","js","tjxt-busi-js"),
    tjxt_busi_zj("浙江省","	330000","zj","tjxt-busi-zj"),
    tjxt_busi_ah("安徽省","	340000","ah","tjxt-busi-ah"),
    tjxt_busi_fj("福建省","	350000","fj","tjxt-busi-fj"),
    tjxt_busi_jx("江西省","360000","jx","tjxt-busi-jx"),
    tjxt_busi_sd("山东省","370000","sd","tjxt-busi-sd"),
    tjxt_busi_hen("河南省","410000","hen","tjxt-busi-hen"),
    tjxt_busi_hub("湖北省","420000","hub","tjxt-busi-hub"),
    tjxt_busi_hun("湖南省","430000","hun","tjxt-busi-hun"),
    tjxt_busi_gd("广东省","440000","gd","tjxt-busi-gd"),
    tjxt_busi_gx("广西壮族自治区","450000","gx","tjxt-busi-gx"),
    tjxt_busi_han("海南省","460000","han","tjxt-busi-han"),
    tjxt_busi_cq("重庆市","500000","cq","tjxt-busi-cq"),
    tjxt_busi_sc("四川省","510000","sc","tjxt-busi-sc"),
    tjxt_busi_gz("贵州省","520000","gz","tjxt-busi-gz"),
    tjxt_busi_yn("云南省","530000","yn","tjxt-busi-yn"),
    tjxt_busi_xz("西藏自治区","540000","xz","tjxt-busi-xz"),
    tjxt_busi_shx("陕西省","610000","shx","tjxt-busi-shx"),
    tjxt_busi_gs("甘肃省","620000","gs","tjxt-busi-gs"),
    tjxt_busi_qh("青海省","630000","qh","tjxt-busi-qh"),
    tjxt_busi_nx("宁夏回族自治区","640000","nx","tjxt-busi-nx"),
    tjxt_busi_xj("新疆维吾尔自治区","650000","xj","tjxt-busi-xj"),
    tjxt_busi_px("培训省级","990000","px","tjxt-busi-px");

    private String cName;
    private String code;
    private String pName;
    private String sourceName;
    BusiSourceNameEnum(String cName, String code, String pName, String sourceName) {
        this.cName = cName;
        this.code = code;
        this.pName = pName;
        this.sourceName = sourceName;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }



}
