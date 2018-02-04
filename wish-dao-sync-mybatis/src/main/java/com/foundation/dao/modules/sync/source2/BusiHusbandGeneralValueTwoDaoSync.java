package com.foundation.dao.modules.sync.source2;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiHusbandGeneralValue;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface BusiHusbandGeneralValueTwoDaoSync extends MybatisBaseDaoSync<String, BusiHusbandGeneralValue> {

    public BusiHusbandGeneralValue selectByPrimaryKey(Map<String, Object> params);

}