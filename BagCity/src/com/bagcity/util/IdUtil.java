package com.bagcity.util;

public class IdUtil {
 public static String createId(){
	 String str="";
	  for(int i=0;i<6;i++){//�������ɼ����ַ��ģ��Ͱ�6�ĳɼ�������ĳɣ�,�Ǿ�����һ�������ĸ��
	  str= str+(char) (Math.random ()*26+'A');
	  } 
	  str="bagcity_"+str;

	 return str;
 }
}
