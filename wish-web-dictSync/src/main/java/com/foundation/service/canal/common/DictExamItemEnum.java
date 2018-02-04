package com.foundation.service.canal.common;

/**
 * @author fqh
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date ${date} ${time}
 */
public enum DictExamItemEnum {

    risk_factor_mapping_id("risk_factor_mapping_id"),
    risk_factor_name("risk_factor_name"),
    risk_factor_code("risk_factor_code"),
    table_name("table_name"),
    column_name("column_name"),
    sex_type("sex_type"),
    is_char("is_char"),
    isDelete("isDelete");

    /*risk_factor_mapping_id` varchar(32) NOT NULL,
  `risk_factor_name` varchar(50) DEFAULT NULL,
  `risk_factor_code` varchar(50) DEFAULT NULL,
  `table_name` varchar(50) DEFAULT NULL,
  `column_name` varchar(50) DEFAULT NULL,
  `sex_type` tinyint(1) DEFAULT NULL,
  `isDelete` tinyint(1) DEFAULT NULL,
  `is_char` tinyint(1) DEFAULT NULL,*/


    private String column;
    DictExamItemEnum(String column){
        this.column=column;
    }
    public String getColumn() {
        return column;
    }
}
