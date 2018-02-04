package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiHusbandPhysicalExam;
//import com.foundation.dao.modules.sync.BusiHusbandPhysicalExamDaoSync;
import com.foundation.dao.modules.sync.source1.BusiHusbandPhysicalExamOneDaoSync;
import com.foundation.dao.modules.sync.source2.BusiHusbandPhysicalExamTwoDaoSync;
import com.foundation.service.tjxtSync.service.IBusiHusbandPhysicalExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BusiHusbandPhysicalExamServiceImpl implements IBusiHusbandPhysicalExamService {
    @Autowired(required = false)
    private BusiHusbandPhysicalExamOneDaoSync busiHusbandPhysicalExamOneDaoSync;
    @Autowired(required = false)
    private BusiHusbandPhysicalExamTwoDaoSync busiHusbandPhysicalExamTwoDaoSync;

//    @Autowired(required = false)
//    private BusiHusbandPhysicalExamDaoSync busiHusbandPhysicalExamDaoSync;
//    public BusiHusbandPhysicalExam selectByPrimaryKey(String husbandPhysicalExamId){
//        return busiHusbandPhysicalExamDaoSync.selectByPrimaryKey(husbandPhysicalExamId);
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
    public BusiHusbandPhysicalExam queryDataBySourceName(Map<String, Object> params) {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiHusbandPhysicalExamOneDaoSync.selectByPrimaryKey(params);
                    }else if(source.equals("2")){
                        return busiHusbandPhysicalExamTwoDaoSync.selectByPrimaryKey(params);
                    }
                }
            }
        }
        return null;
    }

}