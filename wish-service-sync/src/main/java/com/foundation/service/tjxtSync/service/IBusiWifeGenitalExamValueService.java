/**
 * @Title: com.bioeh.sp.hm.bsp.backend
 * @Package com.foundation.service.tjxtSync.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author wangsen
 * @date 2016/10/21 14:14 
 */
package com.foundation.service.tjxtSync.service;

import com.foundation.dao.entity.sync.BusiWifeGenitalExamValue;

import java.util.Map;

/**
 * @author wangsen
 * @ClassName: IBusiWifeGenitalExamValueService
 * @Description: 13、	妻子生殖系统检查值表-服务
 * @date 2016/10/21 14:14
 */
public interface IBusiWifeGenitalExamValueService {
    /**
     * @Description: 根据主键查询实体
     * @param id
     * @return
     * @throws Exception
     */
//    public BusiWifeGenitalExamValue queryById(String id) throws Exception;

    /**
     * @Title:
     * @Description: 通过库名和id查询实体类
     * @author chunyangli
     * @date 2016/12/5 17:06
     * @param
     * @return
     * @throws
     */
    public BusiWifeGenitalExamValue queryDataBySourceName(Map<String,Object> params);
}
