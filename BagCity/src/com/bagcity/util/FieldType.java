package com.bagcity.util;

public enum FieldType {
	
	ID("ID"),NAME("����"),TELPHONE("�ֻ���"),SPARE_TEL("���õ绰"),ADDRESS("��ͥ��ַ"),
	ENTRY_TIME("��ְ����"),CREATE_USER_ID("������id"),CREATE_TIME("��������"),UPDATE_USER_ID("�޸���id"),
	UPDATE_TIME("�޸�ʱ��");
	 private String value;

	 FieldType(String value) {
         this.value = value;
     }

     public String getValue() {
         return value;
     }
}
