package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiWifeBasicInfo;
//import com.foundation.dao.modules.sync.BusiWifeBasicInfoDaoSync;
import com.foundation.dao.modules.sync.source1.BusiWifeBasicInfoOneDaoSync;
import com.foundation.dao.modules.sync.source2.BusiWifeBasicInfoTwoDaoSync;
import com.foundation.service.tjxtSync.service.IBusiWifeBasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BusiWifeBasicInfoServiceImpl implements IBusiWifeBasicInfoService {
    @Autowired(required = false)
    private BusiWifeBasicInfoOneDaoSync busiWifeBasicInfoOneDaoSync;
    @Autowired(required = false)
    private BusiWifeBasicInfoTwoDaoSync busiWifeBasicInfoTwoDaoSync;

//    @Autowired(required = false)
//    private BusiWifeBasicInfoDaoSync busiWifeBasicInfoDaoSync;
//    public BusiWifeBasicInfo selectByPrimaryKey(String wifeBasicInfoId){
//        return busiWifeBasicInfoDaoSync.selectByPrimaryKey(wifeBasicInfoId);
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
    public BusiWifeBasicInfo queryDataBySourceName(Map<String, Object> params) {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiWifeBasicInfoOneDaoSync.selectByPrimaryKey(params);
                    }else if(source.equals("2")){
                        return busiWifeBasicInfoTwoDaoSync.selectByPrimaryKey(params);
                    }
                }
            }
        }
        return null;
    }
}