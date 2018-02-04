package com.foundation.service.canal.common;

import com.foundation.common.utils.StringUtils;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author fqh
 * @Description: 补0处理
 */
public enum SupplementZeroColumnEnum {

    is_family_disease_wife("is_family_disease","家族病史，妻子一般情况表里family_disease字段","busi_wife_general_situation","family_disease"),
    is_family_disease_husband("is_family_disease","家族病史，丈夫一般情况表里family_disease字段","busi_husband_general_situation","family_disease"),
    is_andropathy("is_andropathy","男性病,男一般情况表andropathy字段","busi_husband_general_situation","andropathy"),
    check_status("check_status","妻子子宫情况 妻子B超值表 b_detail字段","busi_wife_b_value","b_detail"),
    is_gynecopathy("is_gynecopathy","女方患有不孕不育症与女方患有子宫附件炎 妻子一般情况表gynecopathy字段","busi_wife_general_situation","gynecopathy"),
    is_had_disease_wife("is_had_disease","疾病史 男女一般情况表里 suffered_disease","busi_wife_general_situation","suffered_disease"),
    is_had_disease_husband("is_had_disease","疾病史 男女一般情况表里 suffered_disease","busi_husband_general_situation","suffered_disease"),
    is_harmful_environment_wife("is_harmful_environment","有害环境,丈夫妻子一般情况表harmful_environment字段","busi_wife_general_situation","harmful_environment"),
    is_harmful_environment_husband("is_harmful_environment","有害环境,丈夫妻子一般情况表harmful_environment字段","busi_husband_general_situation","harmful_environment"),
    is_pre_disease("is_pre_disease","是否有妊娠期血压糖尿病 妻子一般情况表 pre_disease_value","busi_wife_general_situation","pre_disease_value"),
    is_intelligence_wife("is_intelligence","智力是否有问题,妻子体格检查表intelligence字段","busi_wife_physical_exam","intelligence"),
    is_intelligence_husband("is_intelligence","智力是否有问题,丈夫体格检查表intelligence字段","busi_husband_physical_exam","intelligence");


/*  is_family_disease//busi_husband_general_situation 跟 busi_wife_general_situation
    is_gynecopathyis_(gynecopathy)// busi_wife_general_situation
    is_andropathy//busi_husband_general_situation
    is_had_disease //(suffered_disease)   busi_husband_general_situation  与 busi_wife_general_situation
    is_harmful_environment //busi_wife_general_situation 与 busi_husband_general_situation
    Is_pre_disease //busi_wife_general_situation
    check_status  b_detail//usi_wife_b_value;*/

    private String zeroColumnName;
    private String columnName;
    private String explain;
    private String tableName;

    SupplementZeroColumnEnum(String zeroColumnName,String explain,String tableName,String columnName){
        this.zeroColumnName=zeroColumnName;
        this.explain=explain;
        this.tableName=tableName;
        this.columnName=columnName;
    }

    public String getZeroColumnName() {
        return zeroColumnName;
    }

    public String getExplain() {
        return explain;
    }

    public String getTableName() {
        return tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    /**
     * 是否包含表名
     * @param tableName
     * @return
     */
    public static boolean isContainsTable(String tableName){
        if(StringUtils.isBlank(tableName)){
            return false;
        }
        for(SupplementZeroColumnEnum zero:SupplementZeroColumnEnum.values()){
            if(zero.getTableName().equals(tableName)){
                return true;
            }
        }
        return false;
    }

    /**
     * 获取符合表名的列列表
     * @param tableName
     * @return
     */
    public static List<SupplementZeroColumnEnum> getTablesColumnEnumList(String tableName,String columnName){
        List<SupplementZeroColumnEnum> list= Lists.newArrayList();
        for(SupplementZeroColumnEnum zero:SupplementZeroColumnEnum.values()){
            if(zero.getTableName().equals(tableName)
                    &&zero.getColumnName().equals(columnName)){
                list.add(zero);
            }
        }
        return list;
    }
}
