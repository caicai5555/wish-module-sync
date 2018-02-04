package com.foundation.dao.modules.sync.source1;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiHusbandGeneralValue;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface BusiHusbandGeneralValueOneDaoSync extends MybatisBaseDaoSync<String, BusiHusbandGeneralValue> {

    public BusiHusbandGeneralValue selectByPrimaryKey(Map<String, Object> params);

}