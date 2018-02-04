/**
 * @Title: com.bioeh.sp.hm.bsp.backend
 * @Package com.foundation.service.tjxtSync.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author wangsen
 * @date 2016/10/21 11:11 
 */
package com.foundation.service.tjxtSync.service;

import com.foundation.dao.entity.sync.BusiBaseEntity;
import com.foundation.dao.entity.sync.BusiExamValueB;
import com.foundation.dao.entity.sync.BusiPregnancyArchive;

import java.util.Map;

/**
 * @author wangsen
 * @ClassName: IBusiPregnancyArchive
 * @Description: 3、	妊娠服务档案-服务
 * @date 2016/10/21 11:11
 */
public interface IBusiPregnancyArchiveSerive {

    /**
     * @Title:
     * @Description: 通过库名和id查询实体类
     * @author chunyangli
     * @date 2016/12/5 17:06
     * @param
     * @return
     * @throws
     */
    public BusiPregnancyArchive queryDataBySourceName(Map<String,Object> params);


    /**
     * @Description: 根据主键查询实体
     * @param id
     * @return
     * @throws Exception
     */
//    public BusiPregnancyArchive queryById(String id) throws Exception;

    /**
     * @Description: 根据主键查询妻子身份证信息
     * @param params
     * @return
     * @throws Exception
     */
    public BusiBaseEntity queryWifeCardNum(Map<String,Object> params) throws Exception;

    /**
     * @Description: 根据主键查询丈夫身份信息
     * @param params
     * @return
     * @throws Exception
     */
    public BusiBaseEntity queryHusbandCardNum(Map<String,Object> params) throws Exception ;
}
