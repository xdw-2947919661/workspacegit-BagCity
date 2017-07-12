package com.bagcity.util;

public enum FieldType {
	
	ID("ID"),NAME("姓名"),TELPHONE("手机号"),SPARE_TEL("备用电话"),ADDRESS("家庭地址"),
	ENTRY_TIME("入职日期"),CREATE_USER_ID("创建人id"),CREATE_TIME("创建日期"),UPDATE_USER_ID("修改人id"),
	UPDATE_TIME("修改时间");
	 private String value;

	 FieldType(String value) {
         this.value = value;
     }

     public String getValue() {
         return value;
     }
}
