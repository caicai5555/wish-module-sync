package com.foundation.dao.modules.sync.source2;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiWifeGeneralValue;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface BusiWifeGeneralValueTwoDaoSync extends MybatisBaseDaoSync<String,BusiWifeGeneralValue > {

    BusiWifeGeneralValue selectByPrimaryKey(Map<String, Object> params);

}