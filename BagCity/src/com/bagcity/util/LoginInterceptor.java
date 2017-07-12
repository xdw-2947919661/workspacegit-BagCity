package com.bagcity.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.bagctiy.vo.User;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse reponse, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse reponse, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse reponse, Object arg2) throws Exception {
		HttpSession session = request.getSession();
		String path = request.getContextPath();
		User user = (User) session.getAttribute("user");
		if (user == null) {
			// ×ªÏòµÇÂ½Ò³Ãæ
			reponse.sendRedirect(path + "/login.jsp");
			return false;
		}

		return true;
	}

}
