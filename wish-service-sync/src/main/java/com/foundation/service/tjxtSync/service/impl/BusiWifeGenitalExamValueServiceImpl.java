/**
 * @Title: com.bioeh.sp.hm.bsp.backend
 * @Package com.foundation.service.tjxtSync.service.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author wangsen
 * @date 2016/10/21 14:26 
 */
package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.sync.BusiWifeGenitalExamValue;
//import com.foundation.dao.modules.sync.BusiWifeGenitalExamValueDao;
//import com.foundation.dao.modules.sync.bj.BusiWifeGenitalExamValueDaoBj;
//import com.foundation.dao.modules.sync.heb.BusiWifeGenitalExamValueDaoHeb;
import com.foundation.dao.modules.sync.source1.BusiWifeGenitalExamValueOneDao;
import com.foundation.dao.modules.sync.source2.BusiWifeGenitalExamValueTwoDao;
import com.foundation.service.tjxtSync.service.IBusiWifeGenitalExamValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author wangsen
 * @ClassName: BusiWifeGenitalExamValueServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2016/10/21 14:26
 */
@Service
public class BusiWifeGenitalExamValueServiceImpl implements IBusiWifeGenitalExamValueService {
    @Autowired(required = false)
    BusiWifeGenitalExamValueOneDao busiWifeGenitalExamValueOneDao;
    @Autowired(required = false)
    BusiWifeGenitalExamValueTwoDao busiWifeGenitalExamValueTwoDao;

//    @Autowired(required = false)
//    BusiWifeGenitalExamValueDao busiWifeGenitalExamValueDao;

//    @Override
//    public BusiWifeGenitalExamValue queryById(String id) throws Exception {
//        return busiWifeGenitalExamValueDao.queryById(id);
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
    public BusiWifeGenitalExamValue queryDataBySourceName(Map<String, Object> params) {
        if(null!=params && params.size()>0){
            if((null!=params.get("id") && !"".equals(params.get("id")))&&(null!=params.get("sourceName") && !"".equals(params.get("sourceName")))){
                if(null!=params.get("source") && !"".equals(params.get("source"))){
                    String source = params.get("source").toString();
                    if(source.equals("1")){
                        return busiWifeGenitalExamValueOneDao.queryById(params);
                    }else if(source.equals("2")){
                        return busiWifeGenitalExamValueTwoDao.queryById(params);
                    }
                }
            }
        }
        return null;
    }
}
