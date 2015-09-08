package com.spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.IUserDao;
import com.spring.entity.UserEntity;

@Service("UserService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
 
	public boolean isExist(UserEntity user) {
		return userDao.isExist(user);
	}
}
