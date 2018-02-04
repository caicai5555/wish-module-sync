package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiHusbandGeneralSituation;
//import com.foundation.dao.modules.sync.BusiHusbandGeneralSituationDaoSync;
import com.foundation.dao.modules.sync.source1.BusiHusbandGeneralSituationOneDaoSync;
import com.foundation.dao.modules.sync.source2.BusiHusbandGeneralSituationTwoDaoSync;
import com.foundation.service.tjxtSync.service.IBusiHusbandGeneralSituationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BusiHusbandGeneralSituationServiceImpl implements IBusiHusbandGeneralSituationService {
    @Autowired(required = false)
    private BusiHusbandGeneralSituationOneDaoSync busiHusbandGeneralSituationOneDaoSync;
    @Autowired(required = false)
    private BusiHusbandGeneralSituationTwoDaoSync busiHusbandGeneralSituationTwoDaoSync;

//    @Autowired(required = false)
//    private BusiHusbandGeneralSituationDaoSync busiHusbandGeneralSituationDaoSync;

//    public BusiHusbandGeneralSituation selectByPrimaryKey(String husbandGeneralSituationId){
//        return busiHusbandGeneralSituationDaoSync.selectByPrimaryKey(husbandGeneralSituationId);
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
    public BusiHusbandGeneralSituation queryDataBySourceName(Map<String, Object> params) {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiHusbandGeneralSituationOneDaoSync.selectByPrimaryKey(params);
                    }else if(source.equals("2")){
                        return busiHusbandGeneralSituationTwoDaoSync.selectByPrimaryKey(params);
                    }
                }
            }
        }
        return null;
    }

}