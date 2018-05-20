package com.code.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.bean.User;
import com.code.dao.UserDao;
import com.code.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;
	public User findModel(User user) {
		return userDao.selectUserByModel(user);
	}

	public int add(User user) {
		return userDao.insert(user);
	}

}
