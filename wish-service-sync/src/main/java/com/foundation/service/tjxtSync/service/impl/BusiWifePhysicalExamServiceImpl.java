package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiWifePhysicalExam;
//import com.foundation.dao.modules.sync.bj.BusiWifePhysicalExamDaoSyncBj;
//import com.foundation.dao.modules.sync.heb.BusiWifePhysicalExamDaoSyncHeb;
//import com.foundation.dao.modules.sync.BusiWifePhysicalExamDaoSync;
import com.foundation.dao.modules.sync.source1.BusiWifePhysicalExamOneDaoSync;
import com.foundation.dao.modules.sync.source2.BusiWifePhysicalExamTwoDaoSync;
import com.foundation.service.tjxtSync.service.IBusiWifePhysicalExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BusiWifePhysicalExamServiceImpl implements IBusiWifePhysicalExamService{
    @Autowired(required = false)
    private BusiWifePhysicalExamOneDaoSync  busiWifePhysicalExamOneDaoSync;
    @Autowired(required = false)
    private BusiWifePhysicalExamTwoDaoSync busiWifePhysicalExamTwoDaoSync;

//    @Autowired(required = false)
//    private BusiWifePhysicalExamDaoSync busiWifePhysicalExamDaoSync;
//    public BusiWifePhysicalExam selectByPrimaryKey(String wifePhysicalExamId){
//        return busiWifePhysicalExamDaoSync.selectByPrimaryKey(wifePhysicalExamId);
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
    public BusiWifePhysicalExam queryDataBySourceName(Map<String, Object> params) {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiWifePhysicalExamOneDaoSync.selectByPrimaryKey(params);
                    }else if(source.equals("2")){
                        return busiWifePhysicalExamTwoDaoSync.selectByPrimaryKey(params);
                    }
                }
            }
        }
        return null;
    }

}