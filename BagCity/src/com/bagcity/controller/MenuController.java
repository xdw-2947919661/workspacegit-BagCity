package com.bagcity.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.extern.log4j.Log4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bagcity.util.BaseController;

@Log4j
@RestController
public class MenuController extends BaseController{

	@RequestMapping(value="/menulist",method=RequestMethod.POST ,consumes=APPLICATION_JSON,produces=APPLICATION_JSON)
	public ResponseEntity<Map<Object, Object>> getMenuList(
			HttpServletResponse response, HttpServletRequest request) {
		log.info("--获取菜单信息--");
		HttpSession session = request.getSession();
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("menulist", session.getAttribute("menulist"));
		return new ResponseEntity<>(map,HttpStatus.OK);
	}

}
