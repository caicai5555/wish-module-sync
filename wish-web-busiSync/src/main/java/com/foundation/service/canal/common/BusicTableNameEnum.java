package com.foundation.service.canal.common;

import org.apache.commons.lang.StringUtils;

/**
 * @author fqh
 * @Description: 体检系统同步所有工程列表
 */
public enum BusicTableNameEnum {

    busi_pregnancy_archive("pregnancy_archive_id", "busi_pregnancy_archive", "妊娠服务档案表",BusiPersonSexTypeEnum.busi_wife),
    busi_wife_basic_info("wife_basic_info_id", "busi_wife_basic_info", "妻子基本信息表",BusiPersonSexTypeEnum.busi_wife),
    busi_husband_basic_info("husband_basic_info_id", "busi_husband_basic_info", "丈夫基本信息表",BusiPersonSexTypeEnum.busi_hasband),

    busi_wife_general_situation("wife_general_situation_id","busi_wife_general_situation" , "妻子一般情况表",BusiPersonSexTypeEnum.busi_wife),
    busi_husband_general_situation("husband_general_situation_id", "busi_husband_general_situation", "丈夫一般情况表",BusiPersonSexTypeEnum.busi_hasband),

    busi_wife_general_value("wife_general_value_id","busi_wife_general_value","妻子一般情况检查值",BusiPersonSexTypeEnum.busi_wife),
    busi_husband_general_value("husband_general_value_id","busi_husband_general_value","丈夫一般情况检查值",BusiPersonSexTypeEnum.busi_hasband),

    busi_wife_physical_exam("wife_physical_exam_id","busi_wife_physical_exam" , "妻子体格检查表",BusiPersonSexTypeEnum.busi_wife),
    busi_husband_physical_exam("husband_physical_exam_id", "busi_husband_physical_exam", "丈夫体格检查表",BusiPersonSexTypeEnum.busi_hasband),

    busi_exam_value_b("exam_value_b_id", "busi_exam_value_b", "临床检查结果值（丈夫）",BusiPersonSexTypeEnum.busi_hasband),
    busi_exam_value_w("exam_value_w_id", "busi_exam_value_w", "临床检查结果值（妻子）",BusiPersonSexTypeEnum.busi_wife),

    busi_wife_hemoglobin("wife_hemoglobin_id", "busi_wife_hemoglobin", "妻子血红蛋白分析表",BusiPersonSexTypeEnum.busi_wife),
    busi_husband_hemoglobin("husband_hemoglobin_id", "busi_husband_hemoglobin", "丈夫血红蛋白分析表",BusiPersonSexTypeEnum.busi_hasband),

    busi_wife_genital_exam_value("wife_genital_id", "busi_wife_genital_exam_value", "妻子生殖系统检查值表",BusiPersonSexTypeEnum.busi_wife),
    busi_husband_genital_exam_value("husband_genital_id", "busi_husband_genital_exam_value", "丈夫生殖系统检查值表",BusiPersonSexTypeEnum.busi_hasband),

    busi_wife_gene("wife_gene_id", "busi_wife_gene", "妻子基因检测值表",BusiPersonSexTypeEnum.busi_wife),
    busi_husband_gene("husband_gene_id", "busi_husband_gene", "丈夫基因检测值表",BusiPersonSexTypeEnum.busi_hasband),

    busi_wife_b_value("wife_b_value_id", "busi_wife_b_value", "妻子妇科B超检查结果表",BusiPersonSexTypeEnum.busi_wife)
    /*busi_evaluation_advice("busi_evaluation_advice","评估建议告知书表"),
    busi_pregnancy_visit("busi_pregnancy_visit","妊娠结局随访表")*/
    ;

    private String tableId;
    private String tableName;
    private String tableInfo;
    private BusiPersonSexTypeEnum sexType;

    BusicTableNameEnum(String tableId, String tableName, String tableInfo,BusiPersonSexTypeEnum sexType) {
        this.tableId = tableId;
        this.tableName = tableName;
        this.tableInfo = tableInfo;
        this.sexType = sexType;
    }

    public BusiPersonSexTypeEnum getSexType() {
        return sexType;
    }

    public void setSexType(BusiPersonSexTypeEnum sexType) {
        this.sexType = sexType;
    }

    public String getTableInfo() {
        return tableInfo;
    }

    public void setTableInfo(String tableInfo) {
        this.tableInfo = tableInfo;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * 判断是否存在
     * @param tableName
     * @return
     */
    public static boolean isContains(String tableName){
        if(StringUtils.isNotBlank(tableName)){
            BusicTableNameEnum[] tableNames= tableNames=BusicTableNameEnum.values();
            for(BusicTableNameEnum nameEnum:tableNames){
                if(nameEnum.getTableName().equals(tableName)){
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * 通过表名获取表的id
     * @param tableName
     * @return
     */
    public static String getIdByName(String tableName){
        String id = "";
        if(StringUtils.isNotBlank(tableName)){
            for(BusicTableNameEnum nameEnum:BusicTableNameEnum.values()){
                if(nameEnum.getTableName().equals(tableName)){
                    id =  nameEnum.getTableId();
                    break;
                }
            }
        }
        return id;
    }

    public static BusiPersonSexTypeEnum getSexTypeByName(String tableName){
        BusiPersonSexTypeEnum sexType = null ;
        if(StringUtils.isNotBlank(tableName)){
            for(BusicTableNameEnum nameEnum:BusicTableNameEnum.values()){
                if(nameEnum.getTableName().equals(tableName)){
                    sexType =  nameEnum.getSexType();
                    break;
                }
            }
        }
        return sexType;
    }
}
