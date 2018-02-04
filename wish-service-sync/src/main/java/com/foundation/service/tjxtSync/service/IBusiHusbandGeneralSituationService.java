package com.foundation.service.tjxtSync.service;

import com.foundation.dao.entity.sync.BusiExamValueB;
import com.foundation.dao.entity.sync.BusiHusbandGeneralSituation;

import java.util.Map;

public interface IBusiHusbandGeneralSituationService {

//    public BusiHusbandGeneralSituation selectByPrimaryKey(String husbandGeneralSituationId);
    /**
     * @Title:
     * @Description: 通过库名和id查询实体类
     * @author chunyangli
     * @date 2016/12/5 17:06
     * @param
     * @return
     * @throws
     */
    public BusiHusbandGeneralSituation queryDataBySourceName(Map<String,Object> params);

}