package com.foundation.service.canal.common;

/**
 * 同步状态常量表
 */
public interface SyncConstants {

    /**
     * 业务表已完成列名
     */
    static final String ISCOMPLATE= "iscomplete";
    static final String certNum="certificateNumber";
    static final String mutilStrSplitChar=";";//孕检系统是根据；号来区分复选值的
    /**
     * 业务表已完成状态 数字4代表已完成
     */
    public static final String ISCOMPLATENUM = "4";

    /**
     * 是否需要拆分
     */
    public static final int ISChar_NO = 0;
    public static final int ISChar_YES = 1;


    /**
     * 通知结果常亮
     */
    public static final String REQUESTSOURCE = "risk";//请求资源（可以定义为risk且必填）
    public static final String REQUESTUSER = "risk";//请求用户（可以定义为risk且必填）
    public static final String SESSIONID = "";//暂时可以为空不传
    public static final String METHOD = "riskevalFacade.riskCheckArchiveIsCompleted";//回调方法（可以定义为该值且必填）
    public static final String VERSION = "1.0";//接口版本（可以定义为1.0且必填）
    public static final String SIGNATURE = "";//数据签名（可以为空）
}