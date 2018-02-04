package com.foundation.service.canal.common;

/**
 * @author fqh
 * @Description: 业务表丈夫与妻子类型枚举
 */
public enum BusiPersonSexTypeEnum {

    busi_hasband("丈夫"),
    busi_wife("妻子");

    private String sexType;

    BusiPersonSexTypeEnum(String sexType) {
        this.sexType = sexType;
    }

    public String getSexType() {
        return sexType;
    }
}
