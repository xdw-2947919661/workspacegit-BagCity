package com.bagcity.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bagcity.dao.UserDao;
import com.bagcity.service.UserService;
import com.bagctiy.vo.User;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
    @Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public User find(User user) {
		user=userDao.find(user);
		return user;
	}

	@Override
	public User findById(String var1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(value = "transactionManager",rollbackFor=Exception.class)
	public void add() {
		List<Object> l1=new ArrayList<Object>();
		for(int i=0;i<10000;i++){
			if(i==500){
				l1.add(1);
				l1.add(3);
				l1.add(4);
				l1.add(5);
			}
			l1.add(new Date());	
		}

		for(int i=0;i<10000;i++){
			
			userDao.add(l1.get(i));		
			/*if(i==500){
				throw new RuntimeException("dfsdfsdf");
			}*/
		}
	}

}
