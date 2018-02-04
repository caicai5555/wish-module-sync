/**
 * @Title: com.bioeh.sp.hm.bsp.backend
 * @Package com.foundation.service.tjxtSync.service.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author wangsen
 * @date 2016/10/21 14:24 
 */
package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiWifeBValue;
//import com.foundation.dao.modules.sync.BusiWifeBValueDao;
import com.foundation.dao.modules.sync.source1.BusiWifeBValueOneDao;
import com.foundation.dao.modules.sync.source2.BusiWifeBValueTwoDao;
import com.foundation.service.tjxtSync.service.IBusiWifeBValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author wangsen
 * @ClassName: BusiWifeBValueServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2016/10/21 14:24
 */
@Service
public class BusiWifeBValueServiceImpl implements IBusiWifeBValueService {
    @Autowired(required = false)
    BusiWifeBValueOneDao busiWifeBValueOneDao;
    @Autowired(required = false)
    BusiWifeBValueTwoDao busiWifeBValueTwoDao;

//    @Autowired(required = false)
//    BusiWifeBValueDao busiWifeBValueDao;

//    @Override
//    public BusiWifeBValue queryById(String id) throws Exception {
//        return busiWifeBValueDao.queryById(id);
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
    public BusiWifeBValue queryDataBySourceName(Map<String, Object> params) {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiWifeBValueOneDao.queryById(params);
                    }else if(source.equals("2")){
                        return busiWifeBValueTwoDao.queryById(params);
                    }
                }
            }
        }
        return null;
    }
}
