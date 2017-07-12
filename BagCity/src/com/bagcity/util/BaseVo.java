package com.bagcity.util;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BaseVo implements Serializable{
	private static final long serialVersionUID = 1L;
	protected String companyId;
	protected String createUserId;
	protected String updateUserId;
	protected Date createTime;
	protected Date updateTime;
	
}
