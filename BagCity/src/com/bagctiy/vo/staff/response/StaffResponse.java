package com.bagctiy.vo.staff.response;

import java.util.Date;

import lombok.Data;

import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;

import com.bagctiy.vo.Staff;
@Data
public class StaffResponse implements Converter<Staff, StaffResponse>{
	private String id;
	private String name;
	private String password;
	private String telphone;
	private String spareTel;
	private String address;
	private Date entryTime;
	protected String createUserId;
	protected String updateUserId;
	protected Date createTime;
	protected Date updateTime;
	@Override
	public StaffResponse convert(Staff staff) {
		StaffResponse s=new StaffResponse();
		BeanUtils.copyProperties(staff, s);
		return s;
	}
	
	

}
