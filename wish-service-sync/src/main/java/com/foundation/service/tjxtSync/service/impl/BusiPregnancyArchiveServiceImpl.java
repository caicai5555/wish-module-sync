/**
 * @Title: com.bioeh.sp.hm.bsp.backend
 * @Package com.foundation.service.tjxtSync.service.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author wangsen
 * @date 2016/10/21 11:12 
 */
package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiBaseEntity;
import com.foundation.dao.entity.sync.BusiPregnancyArchive;
//import com.foundation.dao.modules.sync.BusiPregnancyArchiveDao;
import com.foundation.dao.modules.sync.source1.BusiPregnancyArchiveOneDao;
import com.foundation.dao.modules.sync.source2.BusiPregnancyArchiveTwoDao;
import com.foundation.service.tjxtSync.service.IBusiPregnancyArchiveSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author wangsen
 * @ClassName: BusiPregnancyArchiveImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2016/10/21 11:12
 */
@Service
public class BusiPregnancyArchiveServiceImpl implements IBusiPregnancyArchiveSerive {

    @Autowired(required = false)
    BusiPregnancyArchiveOneDao busiPregnancyArchiveOneDao;
    @Autowired(required = false)
    BusiPregnancyArchiveTwoDao busiPregnancyArchiveTwoDao;

//    @Autowired(required = false)
//    BusiPregnancyArchiveDao busiPregnancyArchiveDao;

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
    public BusiPregnancyArchive queryDataBySourceName(Map<String, Object> params) {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiPregnancyArchiveOneDao.queryById(params);
                    }else if(source.equals("2")){
                        return busiPregnancyArchiveTwoDao.queryById(params);
                    }
                }
            }
        }
        return null;
    }


    /**
     * {@inheritDoc}
    */
//    @Override
//    public BusiPregnancyArchive queryById(String id) throws Exception {
//        return busiPregnancyArchiveDaoHeb.queryById(id);
//    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusiBaseEntity queryWifeCardNum(Map<String,Object> params) throws Exception {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiPregnancyArchiveOneDao.queryById(params);
                    }else if(source.equals("2")){
                        return busiPregnancyArchiveTwoDao.queryById(params);
                    }
                }
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusiBaseEntity queryHusbandCardNum(Map<String,Object> params) throws Exception {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiPregnancyArchiveOneDao.queryById(params);
                    }else if(source.equals("2")){
                        return busiPregnancyArchiveTwoDao.queryById(params);
                    }
                }
            }
        }
        return null;
    }
}
