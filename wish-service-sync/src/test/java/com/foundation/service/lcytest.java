package com.foundation.service;

import com.foundation.dao.entity.sync.BusiWifeGeneralValue;
import com.foundation.service.tjxtSync.service.IBusiWifeGeneralValueService;
import com.google.common.collect.Maps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Map;

/**
 * Created by lcy on 2016/10/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring-context.xml",
        "classpath:spring-db.xml"
})
public class lcytest {
    @Autowired(required = false)
    private IBusiWifeGeneralValueService busiWifeGeneralValueService;
    @Test
    public void test1(){
        Map<String,Object> params = Maps.newHashMap();
        params.put("id","000000005146b19f01514709203c2602");
        params.put("sourceName","`"+"tjxt-busi-tj"+"`");
        params.put("source","2");
        BusiWifeGeneralValue bb = busiWifeGeneralValueService.queryDataBySourceName(params);
        System.out.println("============");
    }
}
