/**
 * @Title: com.bioeh.sp.hm.bsp.backend
 * @Package com.foundation.service.tjxtSync.service.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author wangsen
 * @date 2016/10/21 11:19 
 */
package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiHusbandGene;
//import com.foundation.dao.modules.sync.BusiHusbandGeneDao;
import com.foundation.dao.modules.sync.source1.BusiHusbandGeneOneDao;
import com.foundation.dao.modules.sync.source2.BusiHusbandGeneTwoDao;
import com.foundation.service.tjxtSync.service.IBusiHusbandGeneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author wangsen
 * @ClassName: BusiHusbandGeneServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2016/10/21 11:19
 */
@Service
public class BusiHusbandGeneServiceImpl implements IBusiHusbandGeneService {
    @Autowired(required = false)
    BusiHusbandGeneOneDao busiHusbandGeneOneDao;
    @Autowired(required = false)
    BusiHusbandGeneTwoDao busiHusbandGeneTwoDao;
//    @Autowired(required = false)
//    BusiHusbandGeneDao busiHusbandGeneDao;


//    @Override
//    public BusiHusbandGene queryById(String id) throws Exception {
//        return busiHusbandGeneDao.queryById(id);
//}

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
    public BusiHusbandGene queryDataBySourceName(Map<String, Object> params) {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiHusbandGeneOneDao.queryById(params);
                    }else if(source.equals("2")){
                        return busiHusbandGeneTwoDao.queryById(params);
                    }
                }
            }
        }
        return null;
    }
}
