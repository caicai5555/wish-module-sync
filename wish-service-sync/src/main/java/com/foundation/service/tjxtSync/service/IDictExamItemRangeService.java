package com.foundation.service.tjxtSync.service;

import com.foundation.dao.entity.base.DictExamItemRange;
import com.foundation.dao.entity.sync.BusiWifePhysicalExam;

import java.util.Map;

/**
 * Created by lcy on 2016/12/9.
 */
public interface IDictExamItemRangeService {
    /**
     * @Title:
     * @Description: 通过id查询查询实体
     * @author chunyangli
     * @date 2016/12/9 13:43
     * @param
     * @return
     * @throws
     */
    public DictExamItemRange queryDataByParams(Map<String,Object> params);

}
