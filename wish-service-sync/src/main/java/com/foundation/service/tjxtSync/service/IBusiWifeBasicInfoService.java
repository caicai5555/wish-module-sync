package com.foundation.service.tjxtSync.service;

import com.foundation.dao.entity.sync.BusiPregnancyArchive;
import com.foundation.dao.entity.sync.BusiWifeBasicInfo;

import java.util.Map;

public interface IBusiWifeBasicInfoService  {

//    public BusiWifeBasicInfo selectByPrimaryKey(String wifeBasicInfoId);
    /**
     * @Title:
     * @Description: 通过库名和id查询实体类
     * @author chunyangli
     * @date 2016/12/5 17:06
     * @param
     * @return
     * @throws
     */
    public BusiWifeBasicInfo queryDataBySourceName(Map<String,Object> params);
}