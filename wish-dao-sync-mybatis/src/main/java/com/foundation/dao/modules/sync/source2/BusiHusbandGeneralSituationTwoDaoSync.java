package com.foundation.dao.modules.sync.source2;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiHusbandGeneralSituation;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface BusiHusbandGeneralSituationTwoDaoSync extends MybatisBaseDaoSync<String, BusiHusbandGeneralSituation> {

    public BusiHusbandGeneralSituation selectByPrimaryKey(Map<String, Object> params);

}