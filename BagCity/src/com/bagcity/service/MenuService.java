package com.bagcity.service;

import java.util.List;

import com.bagctiy.vo.Menu;


public interface MenuService {
 List<Menu> findAll(String id);
}
