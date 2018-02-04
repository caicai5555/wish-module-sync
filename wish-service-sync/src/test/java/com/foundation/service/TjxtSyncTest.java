/**
 * @Title: com.bioeh.sp.hm.bsp.backend
 * @Package com.foundation.service.archive
 * @Description: TODO(用一句话描述该文件做什么)
 * @author wangsen
 * @date 2016/10/20 15:13 
 */
package com.foundation.service;

import com.foundation.dao.entity.sync.BusiHusbandGene;
import com.foundation.dao.entity.sync.BusiHusbandGenitalExamValue;
import com.foundation.dao.entity.sync.BusiPregnancyArchive;
import com.foundation.dao.entity.sync.BusiWifeGene;
import com.foundation.service.tjxtSync.service.IBusiHusbandGeneService;
import com.foundation.service.tjxtSync.service.IBusiHusbandGenitalExamValueService;
import com.foundation.service.tjxtSync.service.IBusiPregnancyArchiveSerive;
import com.foundation.service.tjxtSync.service.IBusiWifeGeneService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author wangsen
 * @ClassName: FamilyArchiveTest
 * @Description: 同步-服务测试
 * @date 2016/10/20 15:13
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring-context.xml",
        "classpath:spring-db.xml"
})
public class TjxtSyncTest {
    @Autowired
    IBusiPregnancyArchiveSerive busiPregnancyArchiveSerive; //3、	妊娠服务档案表
    @Autowired
    IBusiWifeGeneService busiWifeGeneService;//17、	妻子基因检测值表
    @Autowired
    IBusiHusbandGeneService busiHusbandGeneService;//18、	丈夫基因检测值表
    @Autowired
    IBusiHusbandGenitalExamValueService busiHusbandGenitalExamValueService;//14、	丈夫生殖系统检查值表

//    @Test
//    public void testQueryPregnancyArchive(){
//        try {
//            BusiPregnancyArchive bean= busiPregnancyArchiveSerive.queryById("000000005146b19f0151b3ceeb1a3b64");
//            Assert.assertNotNull(bean);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void testQueryWifeGene(){
//        try {
//            BusiWifeGene bean= busiWifeGeneService.queryById("000000005146b19f0151b3ceeb1a3b64");
//            Assert.assertNotNull(bean);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void testQueryHusbandGene(){
//        try {
//            BusiHusbandGene bean= busiHusbandGeneService.queryById("000000005146b19f0151b3ceeb1a3b64");
//            Assert.assertNotNull(bean);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void testQueryBusiHusbandGenitalExam(){
//        try {
//            BusiHusbandGenitalExamValue bean= busiHusbandGenitalExamValueService.queryById("000000005146b19f0151b3ceeb1a3b64");
//            Assert.assertNotNull(bean);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

}
