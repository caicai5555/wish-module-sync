package com.foundation.service.canal.common;

import java.io.Serializable;

/**
 * Created by lcy on 2016/12/9.
 */
public class BusiExamValueScopeCommon <T> implements Serializable {
    private T entity;//实体类
    private  BusiPersonSexTypeEnum busiPersonSexTypeEnum;//性别枚举

    public BusiPersonSexTypeEnum getBusiPersonSexTypeEnum() {
        return busiPersonSexTypeEnum;
    }

    public void setBusiPersonSexTypeEnum(BusiPersonSexTypeEnum busiPersonSexTypeEnum) {
        this.busiPersonSexTypeEnum = busiPersonSexTypeEnum;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
}
