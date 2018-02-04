package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiHusbandGeneralValue;
//import com.foundation.dao.modules.sync.BusiHusbandGeneralValueDaoSync;
import com.foundation.dao.modules.sync.source1.BusiHusbandGeneralValueOneDaoSync;
import com.foundation.dao.modules.sync.source2.BusiHusbandGeneralValueTwoDaoSync;
import com.foundation.service.tjxtSync.service.IBusiHusbandGeneralValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BusiHusbandGeneralValueServiceImpl implements IBusiHusbandGeneralValueService {
    @Autowired(required = false)
    private BusiHusbandGeneralValueOneDaoSync busiHusbandGeneralValueOneDaoSync;
    @Autowired(required = false)
    private BusiHusbandGeneralValueTwoDaoSync busiHusbandGeneralValueTwoDaoSync;
//    @Autowired(required = false)
//    private BusiHusbandGeneralValueDaoSync busiHusbandGeneralValueDaoSync;
//    public BusiHusbandGeneralValue selectByPrimaryKey(String husbandGeneralValueId){
//        return busiHusbandGeneralValueDaoSync.selectByPrimaryKey(husbandGeneralValueId);
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
    public BusiHusbandGeneralValue queryDataBySourceName(Map<String, Object> params) {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiHusbandGeneralValueOneDaoSync.selectByPrimaryKey(params);
                    }else if(source.equals("2")){
                        return busiHusbandGeneralValueTwoDaoSync.selectByPrimaryKey(params);
                    }
                }
            }
        }
        return null;
    }

}