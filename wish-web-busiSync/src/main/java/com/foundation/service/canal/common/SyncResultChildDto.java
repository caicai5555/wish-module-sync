package com.foundation.service.canal.common;

import java.io.Serializable;

/**
 * @Title: SyncResultChildDto.java
 * @Package com.foundation.service.canal.common
 * @author chunyangli
 * @date 2016/11/30 11:16 
 */
public class SyncResultChildDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String archiveId;//测试档案ID
    private String shardDBName;//数据库分库编码且必填  busi_pregnancy_archive 里面的zone_province_code 字段

    public String getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    public String getShardDBName() {
        return shardDBName;
    }

    public void setShardDBName(String shardDBName) {
        this.shardDBName = shardDBName;
    }
}
