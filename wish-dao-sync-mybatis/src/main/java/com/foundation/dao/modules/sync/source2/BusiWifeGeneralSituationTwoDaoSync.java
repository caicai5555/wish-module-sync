package com.foundation.dao.modules.sync.source2;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiWifeGeneralSituation;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface BusiWifeGeneralSituationTwoDaoSync extends MybatisBaseDaoSync<String, BusiWifeGeneralSituation> {

    BusiWifeGeneralSituation selectByPrimaryKey(Map<String, Object> params);

}