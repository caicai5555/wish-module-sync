/**
 * @Title: com.bioeh.sp.hm.bsp.backend
 * @Package com.foundation.service.tjxtSync.service.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author wangsen
 * @date 2016/10/21 14:28 
 */
package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiWifeHemoglobin;
//import com.foundation.dao.modules.sync.BusiWifeHemoglobinDao;
import com.foundation.dao.modules.sync.source1.BusiWifeHemoglobinOneDao;
import com.foundation.dao.modules.sync.source2.BusiWifeHemoglobinTwoDao;
import com.foundation.service.tjxtSync.service.IBusiWifeHemoglobinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author wangsen
 * @ClassName: BusiWifeHemoglobinServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2016/10/21 14:28
 */
@Service
public class BusiWifeHemoglobinServiceImpl implements IBusiWifeHemoglobinService {
    @Autowired(required = false)
    BusiWifeHemoglobinOneDao busiWifeHemoglobinOneDao;
    @Autowired(required = false)
    BusiWifeHemoglobinTwoDao busiWifeHemoglobinTwoDao;
//    @Autowired(required = false)
//    BusiWifeHemoglobinDao busiWifeHemoglobinDao;

//    @Override
//    public BusiWifeHemoglobin queryById(String id) throws Exception {
//        return busiWifeHemoglobinDao.queryById(id);
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
    public BusiWifeHemoglobin queryDataBySourceName(Map<String, Object> params) {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiWifeHemoglobinOneDao.queryById(params);
                    }else if(source.equals("2")){
                        return busiWifeHemoglobinTwoDao.queryById(params);
                    }
                }
            }
        }
        return null;
    }
}
