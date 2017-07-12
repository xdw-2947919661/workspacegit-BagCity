package com.bagctiy.vo;


import com.bagcity.util.BaseVo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Menu extends BaseVo {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Integer level;
	private Integer isUsing;
	private String icon;
}
