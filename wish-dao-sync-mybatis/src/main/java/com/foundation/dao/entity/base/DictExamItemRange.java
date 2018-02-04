package com.foundation.dao.entity.base;

import java.io.Serializable;
import java.util.Date;

public class DictExamItemRange implements Serializable{
    private String examItemRangeId;

    private String itemCode;

    private String itemName;

    private String description;

    private Integer detectType;

    private Integer detectMethod;

    private String otherDetectMethod;

    private String kitBand;

    private String equipType;

    private String equipFirm;

    private String minValue;

    private String maxValue;

    private String unit;

    private Integer scopeMethod;

    private String ownOrganizationId;

    private String setOrganizationId;

    private Date startDate;

    private Date expiredDate;

    private String reference;

    private String createUserId;

    private Date createDatetime;

    private String updateUserId;

    private Date updateDatetime;

    private Integer isdelete;

    private Integer sexType;

    private Boolean valueType;

    public String getExamItemRangeId() {
        return examItemRangeId;
    }

    public void setExamItemRangeId(String examItemRangeId) {
        this.examItemRangeId = examItemRangeId == null ? null : examItemRangeId.trim();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getDetectType() {
        return detectType;
    }

    public void setDetectType(Integer detectType) {
        this.detectType = detectType;
    }

    public Integer getDetectMethod() {
        return detectMethod;
    }

    public void setDetectMethod(Integer detectMethod) {
        this.detectMethod = detectMethod;
    }

    public String getOtherDetectMethod() {
        return otherDetectMethod;
    }

    public void setOtherDetectMethod(String otherDetectMethod) {
        this.otherDetectMethod = otherDetectMethod == null ? null : otherDetectMethod.trim();
    }

    public String getKitBand() {
        return kitBand;
    }

    public void setKitBand(String kitBand) {
        this.kitBand = kitBand == null ? null : kitBand.trim();
    }

    public String getEquipType() {
        return equipType;
    }

    public void setEquipType(String equipType) {
        this.equipType = equipType == null ? null : equipType.trim();
    }

    public String getEquipFirm() {
        return equipFirm;
    }

    public void setEquipFirm(String equipFirm) {
        this.equipFirm = equipFirm == null ? null : equipFirm.trim();
    }

    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue == null ? null : minValue.trim();
    }

    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue == null ? null : maxValue.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getScopeMethod() {
        return scopeMethod;
    }

    public void setScopeMethod(Integer scopeMethod) {
        this.scopeMethod = scopeMethod;
    }

    public String getOwnOrganizationId() {
        return ownOrganizationId;
    }

    public void setOwnOrganizationId(String ownOrganizationId) {
        this.ownOrganizationId = ownOrganizationId == null ? null : ownOrganizationId.trim();
    }

    public String getSetOrganizationId() {
        return setOrganizationId;
    }

    public void setSetOrganizationId(String setOrganizationId) {
        this.setOrganizationId = setOrganizationId == null ? null : setOrganizationId.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference == null ? null : reference.trim();
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getSexType() {
        return sexType;
    }

    public void setSexType(Integer sexType) {
        this.sexType = sexType;
    }

    public Boolean getValueType() {
        return valueType;
    }

    public void setValueType(Boolean valueType) {
        this.valueType = valueType;
    }
}