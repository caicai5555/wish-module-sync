/**
 * @Title: com.bioeh.sp.hm.bsp.backend
 * @Package com.foundation.service.tjxtSync.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author wangsen
 * @date 2016/10/21 14:15 
 */
package com.foundation.service.tjxtSync.service;

import com.foundation.dao.entity.sync.BusiWifeHemoglobin;

import java.util.Map;

/**
 * @author wangsen
 * @ClassName: IBusiWifeHemoglobinService
 * @Description: 15、	妻子血红蛋白分析表-服务
 * @date 2016/10/21 14:15
 */
public interface IBusiWifeHemoglobinService {
    /**
     * @Description: 根据主键查询实体
     * @param id
     * @return
     * @throws Exception
     */
//    public BusiWifeHemoglobin queryById(String id) throws Exception;

    /**
     * @Title:
     * @Description: 通过库名和id查询实体类
     * @author chunyangli
     * @date 2016/12/5 17:06
     * @param
     * @return
     * @throws
     */
    public BusiWifeHemoglobin queryDataBySourceName(Map<String,Object> params);
}
