package com.bagctiy.vo;

import com.bagcity.util.BaseVo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class User extends BaseVo{
	private static final long serialVersionUID = 1L;
	private String id;
	private String userName;
	private String password;
	private String iconUrl;
}
