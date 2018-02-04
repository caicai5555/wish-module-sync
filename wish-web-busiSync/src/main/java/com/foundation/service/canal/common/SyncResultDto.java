package com.foundation.service.canal.common;

import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Title: SyncResultDto.java
 * @Package com.foundation.service.canal.common
 * @Description: TODO
 * @author chunyangli
 * @date 2016/11/30 11:18
 */

public class SyncResultDto implements Serializable {
    private int abc = 0;
    private static final long serialVersionUID = 1L;
    private String requestid;//请求ID（随机长度大于25小于50的字符串且必填）
    private String requestsource;//请求用户（可以定义为risk且必填）
    private String requestuser;////请求用户（可以定义为risk且必填）
    private String sessionid;//暂时可以为空不传
    private String method;//回调方法（可以定义为该值且必填）
    private String version;//接口版本（可以定义为1.0且必填）
    private String signature;//数据签名（可以为空）
    private List<SyncResultChildDto> requestlist;

    public String getRequestuser() {
        return requestuser;
    }

    public void setRequestuser(String requestuser) {
        this.requestuser = requestuser;
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    public String getRequestsource() {
        return requestsource;
    }

    public void setRequestsource(String requestsource) {
        this.requestsource = requestsource;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public List<SyncResultChildDto> getRequestlist() {
        return requestlist;
    }

    public void setRequestlist(List<SyncResultChildDto> requestlist) {
        this.requestlist = requestlist;
    }

    public static void main(String[] args) {
        String abc = "abc";
        abc.intern();
        Map<String,Object> map = Maps.newHashMap();
    }
}
