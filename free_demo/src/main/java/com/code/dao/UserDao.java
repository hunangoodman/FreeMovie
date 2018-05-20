package com.code.dao;

import org.apache.ibatis.annotations.Mapper;

import com.code.bean.User;
@Mapper
public interface UserDao {
	public User selectUserByModel(User user);
	
	public int insert(User user);
}
