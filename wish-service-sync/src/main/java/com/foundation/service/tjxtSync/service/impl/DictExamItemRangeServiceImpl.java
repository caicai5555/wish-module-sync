package com.foundation.service.tjxtSync.service.impl;

import com.foundation.dao.entity.base.DictExamItemRange;
import com.foundation.dao.modules.base.DictExamItemRangeDao;
import com.foundation.service.tjxtSync.service.IDictExamItemRangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by lcy on 2016/12/9.
 */
@Service
public class DictExamItemRangeServiceImpl implements IDictExamItemRangeService {
    @Autowired
    private DictExamItemRangeDao dictExamItemRangeDao;


    /**
     * @param params
     * @return
     * @throws
     * @Title:
     * @Description: 通过id查询查询实体
     * @author chunyangli
     * @date 2016/12/9 13:43
     */
    @Override
    public DictExamItemRange queryDataByParams(Map<String, Object> params) {
        return dictExamItemRangeDao.selectByPrimaryKey(params);
    }
}
