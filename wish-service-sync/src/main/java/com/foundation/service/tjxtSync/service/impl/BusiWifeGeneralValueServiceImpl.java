package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiWifeGeneralValue;
//import com.foundation.dao.modules.sync.BusiWifeGeneralValueDaoSync;
import com.foundation.dao.modules.sync.source1.BusiWifeGeneralValueOneDaoSync;
import com.foundation.dao.modules.sync.source2.BusiWifeGeneralValueTwoDaoSync;
import com.foundation.service.tjxtSync.service.IBusiWifeGeneralValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BusiWifeGeneralValueServiceImpl implements IBusiWifeGeneralValueService {
    @Autowired(required = false)
    private BusiWifeGeneralValueOneDaoSync busiWifeGeneralValueOneDaoSync;
    @Autowired(required = false)
    private BusiWifeGeneralValueTwoDaoSync busiWifeGeneralValueTwoDaoSync;

//    @Autowired(required = false)
//    private BusiWifeGeneralValueDaoSync busiWifeGeneralValueDaoSync;
//    public  BusiWifeGeneralValue selectByPrimaryKey(String wifeGeneralValueId){
//        return busiWifeGeneralValueDaoSync.selectByPrimaryKey(wifeGeneralValueId);
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
    public BusiWifeGeneralValue queryDataBySourceName(Map<String, Object> params) {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiWifeGeneralValueOneDaoSync.selectByPrimaryKey(params);
                    }else if(source.equals("2")){
                        return busiWifeGeneralValueTwoDaoSync.selectByPrimaryKey(params);
                    }
                }
            }
        }
        return null;
    }

}