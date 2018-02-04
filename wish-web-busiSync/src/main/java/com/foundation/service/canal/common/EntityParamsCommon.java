package com.foundation.service.canal.common;

import java.io.Serializable;

/**
 * Created by lcy on 2016/10/24.
 */
public class EntityParamsCommon<T> implements Serializable {
    private T entity;//实体类
    private String userId ;//用户id
    private BusicTableNameEnum tableNameEnum;//表名枚举
    private String certNum;//身份证号

    public String getCertNum() {
        return certNum;
    }

    public void setCertNum(String certNum) {
        this.certNum = certNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BusicTableNameEnum getTableNameEnum() {
        return tableNameEnum;
    }

    public void setTableNameEnum(BusicTableNameEnum tableNameEnum) {
        this.tableNameEnum = tableNameEnum;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
}
