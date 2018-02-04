package com.foundation.dao.modules.sync.source2;


import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiExamValueBScope;
import com.foundation.dao.entity.sync.BusiHusbandBasicInfo;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface BusiExamValueBScopeTwoDaoSync extends MybatisBaseDaoSync<String, BusiExamValueBScope> {

    BusiExamValueBScope selectByPrimaryKey(Map<String,Object> params);

    BusiExamValueBScope selectByPregnancyArchiveIdKey(Map<String,Object> params);

}