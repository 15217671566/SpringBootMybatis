package com.asshead.SpringBootMybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asshead.SpringBootMybatis.mapper.UserMapper;
import com.asshead.SpringBootMybatis.entity.User;


@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public User selectUser(User user){
		return  userMapper.selectUser(user.getUserName(), user.getPassword());
	}

}
