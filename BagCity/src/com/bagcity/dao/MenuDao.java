package com.bagcity.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bagctiy.vo.Menu;

@Repository("menuDao")
public interface MenuDao {

	List<Menu> findAll(String id);

}
