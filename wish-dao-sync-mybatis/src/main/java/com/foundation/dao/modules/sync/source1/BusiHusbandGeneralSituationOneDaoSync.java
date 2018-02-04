package com.foundation.dao.modules.sync.source1;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiHusbandGeneralSituation;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface BusiHusbandGeneralSituationOneDaoSync extends MybatisBaseDaoSync<String, BusiHusbandGeneralSituation> {

    public BusiHusbandGeneralSituation selectByPrimaryKey(Map<String, Object> params);

}