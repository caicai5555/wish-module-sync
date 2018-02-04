package com.foundation.dao.modules.sync.source2;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiWifeBasicInfo;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface BusiWifeBasicInfoTwoDaoSync extends MybatisBaseDaoSync<String, BusiWifeBasicInfo> {

    public BusiWifeBasicInfo selectByPrimaryKey(Map<String, Object> params);
}