package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiWifeGeneralSituation;
//import com.foundation.dao.modules.sync.BusiWifeGeneralSituationDaoSync;
import com.foundation.dao.modules.sync.source1.BusiWifeGeneralSituationOneDaoSync;
import com.foundation.dao.modules.sync.source2.BusiWifeGeneralSituationTwoDaoSync;
import com.foundation.service.tjxtSync.service.IBusiWifeGeneralSituationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BusiWifeGeneralSituationServiceImpl implements IBusiWifeGeneralSituationService {
    @Autowired(required = false)
    private BusiWifeGeneralSituationOneDaoSync busiWifeGeneralSituationOneDaoSync;
    @Autowired(required = false)
    private BusiWifeGeneralSituationTwoDaoSync busiWifeGeneralSituationTwoDaoSync;

//    @Autowired(required = false)
//    private BusiWifeGeneralSituationDaoSync busiWifeGeneralSituationDaoSync;
//    public BusiWifeGeneralSituation selectByPrimaryKey(String wifeGeneralSituationId){
//        return busiWifeGeneralSituationDaoSync.selectByPrimaryKey(wifeGeneralSituationId);
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
    public BusiWifeGeneralSituation queryDataBySourceName(Map<String, Object> params) {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiWifeGeneralSituationOneDaoSync.selectByPrimaryKey(params);
                    }else if(source.equals("2")){
                        return busiWifeGeneralSituationTwoDaoSync.selectByPrimaryKey(params);
                    }
                }
            }
        }
        return null;
    }

}