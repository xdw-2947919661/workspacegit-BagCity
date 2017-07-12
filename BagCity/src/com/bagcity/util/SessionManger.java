package com.bagcity.util;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.bagctiy.vo.Menu;
import com.bagctiy.vo.User;

public class SessionManger {
	public static HttpSession session;
	public static User sessionUser;

	public static void setSession(HttpServletRequest request, User user,List<Menu> menuList) {
		session = request.getSession();
		sessionUser=user;
		session.setAttribute("user", user);
		session.setAttribute("menulist", menuList);
	}
}
