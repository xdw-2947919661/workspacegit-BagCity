package com.bagctiy.vo.staff.response;

import java.util.Date;

import lombok.Data;

import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;

import com.bagctiy.vo.Staff;
import com.fasterxml.jackson.annotation.JsonFormat;
@Data
public class StaffResponse implements Converter<Staff, StaffResponse>{
	private String id;
	private String name;
	private String telphone;
	private String spareTel;
	private String address;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date entryTime;
	protected String createUserId;
	protected String updateUserId;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	protected Date createTime;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
	protected Date updateTime;
	@Override
	public StaffResponse convert(Staff staff) {
		StaffResponse s=new StaffResponse();
		BeanUtils.copyProperties(staff, s);
		return s;
	}
	
	

}
