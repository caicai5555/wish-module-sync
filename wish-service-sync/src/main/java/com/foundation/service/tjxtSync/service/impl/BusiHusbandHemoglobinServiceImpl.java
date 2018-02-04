/**
 * @Title: com.bioeh.sp.hm.bsp.backend
 * @Package com.foundation.service.tjxtSync.service.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author wangsen
 * @date 2016/10/21 14:22 
 */
package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiHusbandHemoglobin;
//import com.foundation.dao.modules.sync.bj.BusiHusbandHemoglobinDaoBj;
//import com.foundation.dao.modules.sync.heb.BusiHusbandHemoglobinDaoHeb;
//import com.foundation.dao.modules.sync.BusiHusbandHemoglobinDao;
import com.foundation.dao.modules.sync.source1.BusiHusbandHemoglobinOneDao;
import com.foundation.dao.modules.sync.source2.BusiHusbandHemoglobinTwoDao;
import com.foundation.service.tjxtSync.service.IBusiHusbandHemoglobinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author wangsen
 * @ClassName: BusiHusbandHemoglobinServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2016/10/21 14:22
 */
@Service
public class BusiHusbandHemoglobinServiceImpl implements IBusiHusbandHemoglobinService {
    @Autowired(required = false)
    BusiHusbandHemoglobinOneDao busiHusbandHemoglobinOneDao;
    @Autowired(required = false)
    BusiHusbandHemoglobinTwoDao busiHusbandHemoglobinTwoDao;

//    @Autowired(required = false)
//    BusiHusbandHemoglobinDao busiHusbandHemoglobinDao;

//    @Override
//    public BusiHusbandHemoglobin queryById(String id) throws Exception {
//        return busiHusbandHemoglobinDao.queryById(id);
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
    public BusiHusbandHemoglobin queryDataBySourceName(Map<String, Object> params) {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiHusbandHemoglobinOneDao.queryById(params);
                    }else if(source.equals("2")){
                        return busiHusbandHemoglobinTwoDao.queryById(params);
                    }
                }
            }
        }
        return null;
    }
}
