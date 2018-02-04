package com.foundation.dao.modules.sync.source2;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiWifePhysicalExam;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface BusiWifePhysicalExamTwoDaoSync extends MybatisBaseDaoSync<String, BusiWifePhysicalExam> {

    BusiWifePhysicalExam selectByPrimaryKey(Map<String, Object> params);

}