package com.bagcity.dao;

import org.springframework.stereotype.Repository;

import com.bagctiy.vo.User;

@Repository("userDao")
public interface UserDao {
	User find(User user);

	void add(Object object);
}
