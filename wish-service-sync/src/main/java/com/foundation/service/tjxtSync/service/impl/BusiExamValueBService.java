package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiExamValueB;
//import com.foundation.dao.modules.sync.BusiExamValueBDaoSync;
import com.foundation.dao.modules.sync.source1.BusiExamValueBOneDaoSync;
import com.foundation.dao.modules.sync.source2.BusiExamValueBTwoDaoSync;
import com.foundation.service.tjxtSync.service.IBusiExamValueBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BusiExamValueBService  implements IBusiExamValueBService{
    @Autowired(required = false)
    private BusiExamValueBOneDaoSync busiExamValueBOneDaoSync;
    @Autowired(required = false)
    private BusiExamValueBTwoDaoSync busiExamValueBTwoDaoSync;

//    @Autowired(required = false)
//    private BusiExamValueBDaoSync busiExamValueBDaoSync;

//    /**
//     * @Title:
//     * @Description: TODO
//     * @author chunyangli
//     * @date 2016/10/21 10:53
//     * @param
//     * @return
//     * @throws
//     */
//    public BusiExamValueB selectByPrimaryKey(String id){
//        return busiExamValueBDaoSync.selectByPrimaryKey(id);
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
    public BusiExamValueB queryDataBySourceName(Map<String, Object> params) {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiExamValueBOneDaoSync.selectByPrimaryKey(params);
                    }else if(source.equals("2")){
                        return busiExamValueBTwoDaoSync.selectByPrimaryKey(params);
                    }
                }
            }
        }
        return null;
    }


}