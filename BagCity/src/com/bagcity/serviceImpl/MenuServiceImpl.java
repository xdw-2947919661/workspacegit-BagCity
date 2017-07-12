package com.bagcity.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bagcity.dao.MenuDao;
import com.bagcity.service.MenuService;
import com.bagctiy.vo.Menu;

@Service("menuService")
public class MenuServiceImpl implements MenuService{
 
	@Resource(name="menuDao")
	private MenuDao menuDao;

	@Override
	public List<Menu> findAll(String id) {
		List<Menu> menuList= menuDao.findAll(id);
		return menuList;
	}
	


}
