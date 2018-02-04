package com.foundation.dao.modules.sync.source1;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiWifeBasicInfo;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface BusiWifeBasicInfoOneDaoSync extends MybatisBaseDaoSync<String, BusiWifeBasicInfo> {

    public BusiWifeBasicInfo selectByPrimaryKey(Map<String, Object> params);
}