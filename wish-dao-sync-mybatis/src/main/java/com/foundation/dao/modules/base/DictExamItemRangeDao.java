package com.foundation.dao.modules.base;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.base.DictExamItemRange;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface DictExamItemRangeDao extends MybatisBaseDaoSync<String, DictExamItemRange> {

    DictExamItemRange selectByPrimaryKey(Map<String,Object> params);

}