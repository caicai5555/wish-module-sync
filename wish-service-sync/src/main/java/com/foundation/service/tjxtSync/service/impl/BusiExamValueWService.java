package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiExamValueW;
//import com.foundation.dao.modules.sync.BusiExamValueWDaoSync;
import com.foundation.dao.modules.sync.source1.BusiExamValueWOneDaoSync;
import com.foundation.dao.modules.sync.source2.BusiExamValueWTwoDaoSync;
import com.foundation.service.tjxtSync.service.IBusiExamValueWService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BusiExamValueWService implements IBusiExamValueWService {
    Logger logger = LoggerFactory.getLogger(BusiExamValueWService.class);
    @Autowired(required = false)
    private BusiExamValueWTwoDaoSync busiExamValueWTwoDaoSync;
    @Autowired(required = false)
    private BusiExamValueWOneDaoSync busiExamValueWOneDaoSync;
//
//    @Autowired(required = false)
//    private BusiExamValueWDaoSync busiExamValueWDaoSync;

    /**
     * @Title: 
     * @Description: TODO
     * @author chunyangli
     * @date 2016/10/21 10:53
     * @param     
     * @return    
     * @throws 
     */
//    public BusiExamValueW selectByPrimaryKey(String id){
//        BusiExamValueW busiExamValueW =null;
//        try{
//             busiExamValueW = busiExamValueWDaoSync.selectByPrimaryKey(id);
//        }catch (Exception e){
//            logger.error("=>BusiExamValueWService=>selectByPrimaryKey is error",e.toString());
//        }
//        return busiExamValueW;
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
    public BusiExamValueW queryDataBySourceName(Map<String, Object> params) {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiExamValueWOneDaoSync.selectByPrimaryKey(params);
                    }else if(source.equals("2")){
                        return busiExamValueWTwoDaoSync.selectByPrimaryKey(params);
                    }
                }
            }
        }
        return null;
    }
}