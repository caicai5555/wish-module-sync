package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiHusbandBasicInfo;
//import com.foundation.dao.modules.sync.BusiHusbandBasicInfoDaoSync;
import com.foundation.dao.modules.sync.source1.BusiHusbandBasicInfoOneDaoSync;
import com.foundation.dao.modules.sync.source2.BusiHusbandBasicInfoTwoDaoSync;
import com.foundation.service.tjxtSync.service.IBusiHusbandBasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BusiHusbandBasicInfoServiceImpl implements IBusiHusbandBasicInfoService {
    @Autowired(required = false)
    private BusiHusbandBasicInfoOneDaoSync busiHusbandBasicInfoOneDaoSync;

    @Autowired(required = false)
    private BusiHusbandBasicInfoTwoDaoSync busiHusbandBasicInfoTwoDaoSync;

//    @Autowired(required = false)
//    private BusiHusbandBasicInfoDaoSync busiHusbandBasicInfoDaoSync;

    /**
     * @Title: 
     * @Description: TODO
     * @author chunyangli
     * @date 2016/10/21 10:53
     * @param     
     * @return    
     * @throws 
     */
//    public BusiHusbandBasicInfo selectByPrimaryKey(String husbandBasicInfoId){
//        return busiHusbandBasicInfoDaoSync.selectByPrimaryKey(husbandBasicInfoId);
//    }

    /**
     * @param params
     * @return
     * @throws
     * @Title:
     * @Description: 通过库名和id查询实体类
     * @author chunyangli
     * @date 2016/12/5 17:06
     */
    @Override
    public BusiHusbandBasicInfo queryDataBySourceName(Map<String, Object> params) {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiHusbandBasicInfoOneDaoSync.selectByPrimaryKey(params);
                    }else if(source.equals("2")){
                        return busiHusbandBasicInfoTwoDaoSync.selectByPrimaryKey(params);
                    }
                }
            }
        }
        return null;
    }
}