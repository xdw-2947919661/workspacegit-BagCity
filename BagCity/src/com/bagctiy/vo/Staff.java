package com.bagctiy.vo;

import java.util.Date;

import com.bagcity.util.BaseVo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Staff extends BaseVo{
	private static final long serialVersionUID = 5474619429050230453L;
private String id;
private String name;
private String password;
private String telphone;
private String spareTel;
private String address;
private Date entryTime;

}
