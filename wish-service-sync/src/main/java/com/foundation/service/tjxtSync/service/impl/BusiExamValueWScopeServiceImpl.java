package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiExamValueWScope;
import com.foundation.dao.modules.sync.source1.BusiExamValueWScopeOneDaoSync;
import com.foundation.dao.modules.sync.source2.BusiExamValueWScopeTwoDaoSync;
import com.foundation.service.tjxtSync.service.IBusiExamValueWScopeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

//import com.foundation.dao.modules.sync.BusiExamValueWDaoSync;

@Service
public class BusiExamValueWScopeServiceImpl implements IBusiExamValueWScopeService {
    Logger logger = LoggerFactory.getLogger(BusiExamValueWScopeServiceImpl.class);
    @Autowired(required = false)
    private BusiExamValueWScopeTwoDaoSync busiExamValueWScopeTwoDaoSync;
    @Autowired(required = false)
    private BusiExamValueWScopeOneDaoSync busiExamValueWScopeOneDaoSync;

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
    public BusiExamValueWScope queryDataBySourceName(Map<String, Object> params) {
        BusiExamValueWScope result=null;
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        result=busiExamValueWScopeOneDaoSync.selectByPregnancyArchiveIdKey(params);
                    }else if(source.equals("2")){
                        result=busiExamValueWScopeTwoDaoSync.selectByPregnancyArchiveIdKey(params);
                    }
                }
            }
        }
        logger.info("BusiExamValueWScope[queryDataBySourceName]"+result);
        return result;
    }
}