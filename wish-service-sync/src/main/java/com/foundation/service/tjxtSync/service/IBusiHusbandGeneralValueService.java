package com.foundation.service.tjxtSync.service;

import com.foundation.dao.entity.sync.BusiExamValueB;
import com.foundation.dao.entity.sync.BusiHusbandGeneralValue;

import java.util.Map;

public interface IBusiHusbandGeneralValueService{

//    public BusiHusbandGeneralValue selectByPrimaryKey(String husbandGeneralValueId);
    /**
     * @Title:
     * @Description: 通过库名和id查询实体类
     * @author chunyangli
     * @date 2016/12/5 17:06
     * @param
     * @return
     * @throws
     */
    public BusiHusbandGeneralValue queryDataBySourceName(Map<String,Object> params);

}