package com.bagcity.util;

public class IdUtil {
 public static String createId(){
	 String str="";
	  for(int i=0;i<6;i++){//你想生成几个字符的，就把6改成几，如果改成１,那就生成一个随机字母．
	  str= str+(char) (Math.random ()*26+'A');
	  } 
	  str="bagcity_"+str;

	 return str;
 }
}
