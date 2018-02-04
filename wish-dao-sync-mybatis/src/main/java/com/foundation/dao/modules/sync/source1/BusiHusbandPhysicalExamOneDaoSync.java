package com.foundation.dao.modules.sync.source1;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiHusbandPhysicalExam;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface BusiHusbandPhysicalExamOneDaoSync extends MybatisBaseDaoSync<String, BusiHusbandPhysicalExam> {

    public BusiHusbandPhysicalExam selectByPrimaryKey(Map<String, Object> params);

}