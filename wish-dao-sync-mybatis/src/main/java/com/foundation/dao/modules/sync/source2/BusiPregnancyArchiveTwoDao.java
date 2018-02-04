/**
 * @Title: com.bioeh.sp.hm.bsp.backend
 * @Package com.foundation.dao.modules.sync
 * @Description: TODO(用一句话描述该文件做什么)
 * @author wangsen
 * @date 2016/10/21 10:56 
 */
package com.foundation.dao.modules.sync.source2;

import com.foundation.common.persistence.annotation.MyBatisRepository;
import com.foundation.dao.entity.sync.BusiBaseEntity;
import com.foundation.dao.entity.sync.BusiPregnancyArchive;
import com.foundation.dao.modules.MybatisBaseDaoSync;

import java.util.Map;

/**
 * @author wangsen
 * @ClassName: BusiPregnancyArchive
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2016/10/21 10:56
 */
@MyBatisRepository
public interface BusiPregnancyArchiveTwoDao extends MybatisBaseDaoSync<String, BusiPregnancyArchive> {

    /**
     * 查询妻子身份证信息
     * @return
     */
    public BusiBaseEntity queryWifeCardNum(Map<String, Object> params);

    /**
     * 查询丈夫身份证信息
     * @return
     */
    public BusiBaseEntity queryHusbandCardNum(Map<String, Object> params);
}
