package com.foundation.dao.modules.sync.source2;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiHusbandPhysicalExam;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface BusiHusbandPhysicalExamTwoDaoSync extends MybatisBaseDaoSync<String, BusiHusbandPhysicalExam> {

    public BusiHusbandPhysicalExam selectByPrimaryKey(Map<String, Object> params);

}