package com.foundation.dao.entity.sync;

import java.io.Serializable;

/**
 * @Title: BusiBaseEntity.java
 * @Package com.foundation.dao.entity.sync
 * @Description: TODO
 * @author chunyangli(chunyangli@bioeh.com)
 * @date 2016/10/21 17:03 
 */
public class BusiBaseEntity  implements Serializable{
    private static final long serialVersionUID = 1L;
    private String certNum;//身份证号
    private String certName;//姓名
    private String zoneProvinceCode;//区域省的code

    public String getZoneProvinceCode() {
        return zoneProvinceCode;
    }

    public void setZoneProvinceCode(String zoneProvinceCode) {
        this.zoneProvinceCode = zoneProvinceCode;
    }

    public String getCertNum() {
        return certNum;
    }

    public void setCertNum(String certNum) {
        this.certNum = certNum;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }
}
