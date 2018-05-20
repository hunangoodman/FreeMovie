package com.code.service;

import com.code.bean.User;

public interface UserService {
	public User findModel(User user);
	
	public int add(User user);
}
