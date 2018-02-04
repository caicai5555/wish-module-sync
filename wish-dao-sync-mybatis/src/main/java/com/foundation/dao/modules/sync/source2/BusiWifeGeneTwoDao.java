package com.foundation.dao.modules.sync.source2;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiWifeGene;
import com.foundation.dao.modules.MybatisBaseDaoSync;

@MyBatisRepository
public interface BusiWifeGeneTwoDao extends MybatisBaseDaoSync<String, BusiWifeGene> {
}