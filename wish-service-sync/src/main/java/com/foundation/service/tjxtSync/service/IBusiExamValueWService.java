package com.foundation.service.tjxtSync.service;

import com.foundation.dao.entity.sync.BusiExamValueB;
import com.foundation.dao.entity.sync.BusiExamValueW;
import com.foundation.dao.entity.sync.BusiHusbandBasicInfo;

import java.util.Map;

public interface IBusiExamValueWService {

    /**
     * @Title:
     * @Description: TODO
     * @author chunyangli
     * @date 2016/10/21 10:53
     * @param
     * @return
     * @throws
     */
//    public BusiExamValueW selectByPrimaryKey(String id);

    /**
     * @Title:
     * @Description: 通过库名和id查询实体类
     * @author chunyangli
     * @date 2016/12/5 17:06
     * @param
     * @return
     * @throws
     */
    public BusiExamValueW queryDataBySourceName(Map<String,Object> params);
}