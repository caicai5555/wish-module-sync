package com.foundation.service.tjxtSync.service;

import com.foundation.dao.entity.sync.BusiExamValueB;
import com.foundation.dao.entity.sync.BusiHusbandPhysicalExam;

import java.util.Map;

public interface IBusiHusbandPhysicalExamService  {

//    public BusiHusbandPhysicalExam selectByPrimaryKey(String husbandPhysicalExamId);
    /**
     * @Title:
     * @Description: 通过库名和id查询实体类
     * @author chunyangli
     * @date 2016/12/5 17:06
     * @param
     * @return
     * @throws
     */
    public BusiHusbandPhysicalExam queryDataBySourceName(Map<String,Object> params);

}