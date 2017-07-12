package com.bagcity.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.log4j.Log4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bagcity.service.MenuService;
import com.bagcity.service.UserService;
import com.bagcity.util.BaseController;
import com.bagcity.util.Md5Util;
import com.bagcity.util.SessionManger;
import com.bagctiy.vo.Menu;
import com.bagctiy.vo.User;

@Log4j
@RestController
public class LoginController extends BaseController {

	@Autowired
	private UserService userService;
	@Autowired
	private MenuService menuService;

	@RequestMapping(value = "/login", consumes = APPLICATION_JSON, produces = APPLICATION_JSON, method = RequestMethod.POST)
	public ResponseEntity<Map<Object,Object>> userLogin(@RequestBody User user,HttpServletRequest request) {
		Map<Object,Object> map=new HashMap<Object, Object>();
		if (user.getUserName() != "" && user.getPassword() != "") {
			// ���������MD5����
			user.setPassword(Md5Util.md5Pwd(user.getPassword()));
			// �ȼ��� һ�ҹ�˾
			user.setCompanyId("1");
			// �������ݿ�У��
			User userk = userService.find(user);
			if (userk != null) {
				log.error("--��¼�ɹ�--");
				List<Menu> menuList=menuService.findAll(user.getCompanyId());
				SessionManger.setSession(request, userk, menuList);
				map.put("returnCode",SUCCESS_TEXT);
				/*map.put("menulist",menuList);*/
			} else {
				log.error("--��¼ʧ��--");
				map.put("returnCode",FAILURE_TEXT);
			}
		}
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	@RequestMapping(value = "/logins/{id}", consumes = "application/json", produces = "application/json", method = RequestMethod.GET)
	public ResponseEntity<Void> userLogins(
			@PathVariable(value = "id") String id, HttpServletRequest request) {
		userService.add();

		return new ResponseEntity<>(HttpStatus.OK);
	}
}
