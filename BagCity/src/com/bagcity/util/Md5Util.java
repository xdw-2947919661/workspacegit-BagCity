package com.bagcity.util;

import java.security.MessageDigest;

public class Md5Util {
	public static String md5Pwd(String pwd){
		 /* String token=System.currentTimeMillis()+new Random().nextInt()+pwd;
		  MessageDigest md=MessageDigest.getInstance("MD5");
		  byte [] md5=md.digest(token.getBytes());*/
		  //����2
		/*  MessageDigest md51=MessageDigest.getInstance("MD5");
		  BASE64Encoder base64en = new BASE64Encoder();
	        //���ܺ���ַ���
	      String newstr=base64en.encode(md51.digest(pwd.getBytes("utf-8")));*/
		  
		  
		StringBuffer buf = new StringBuffer("");
		  try {
		        //����ʵ��ָ��ժҪ�㷨�� MessageDigest ����
		        MessageDigest md = MessageDigest.getInstance("MD5");  
		        //ʹ��ָ�����ֽ��������ժҪ��
		        md.update(pwd.getBytes());
		        //ͨ��ִ���������֮������ղ�����ɹ�ϣ���㡣
		        byte b[] = md.digest();
		        //���ɾ����md5���뵽buf����
		        int i;
		        for (int offset = 0; offset < b.length; offset++) {
		          i = b[offset];
		          if (i < 0)
		            i += 256;
		          if (i < 16)
		            buf.append("0");
		          buf.append(Integer.toHexString(i));
		        }
		        System.out.println("32λ: " + buf.toString());// 32λ�ļ���
		        System.out.println("16λ: " + buf.toString().substring(8, 24));// 16λ�ļ��ܣ���ʵ����32λ���ܺ�Ľ�ȡ
		     } 
		     catch (Exception e) {
		       e.printStackTrace();
		     }
		return buf.toString();
	}
}
