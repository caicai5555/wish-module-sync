package com.foundation.dao.modules.sync.source2;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiHusbandBasicInfo;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

@MyBatisRepository
public interface BusiHusbandBasicInfoTwoDaoSync extends MybatisBaseDaoSync<String, BusiHusbandBasicInfo> {

    /**
     * @Title: 
     * @Description: TODO
     * @author chunyangli
     * @date 2016/10/21 10:53
     * @param     
     * @return    
     * @throws 
     */
    public BusiHusbandBasicInfo selectByPrimaryKey(Map<String, Object> params);
}