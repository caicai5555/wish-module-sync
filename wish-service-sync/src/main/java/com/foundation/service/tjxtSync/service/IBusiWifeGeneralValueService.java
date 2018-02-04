package com.foundation.service.tjxtSync.service;

import com.foundation.dao.entity.sync.BusiWifeGeneralValue;

import java.util.Map;

public interface IBusiWifeGeneralValueService {

//    BusiWifeGeneralValue selectByPrimaryKey(String wifeGeneralValueId);

    /**
     * @Title:
     * @Description: 通过库名和id查询实体类
     * @author chunyangli
     * @date 2016/12/5 17:06
     * @param
     * @return
     * @throws
     */
    public BusiWifeGeneralValue queryDataBySourceName(Map<String,Object> params);

}