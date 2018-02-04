package com.foundation.service.tjxtSync.service;

import com.foundation.dao.entity.sync.BusiWifePhysicalExam;

import java.util.Map;

public interface IBusiWifePhysicalExamService {

//    BusiWifePhysicalExam selectByPrimaryKey(String wifePhysicalExamId);

    /**
     * @Title:
     * @Description: 通过库名和id查询实体类
     * @author chunyangli
     * @date 2016/12/5 17:06
     * @param
     * @return
     * @throws
     */
    public BusiWifePhysicalExam queryDataBySourceName(Map<String,Object> params);

}