package com.spring.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.IUserDao;
import com.spring.entity.UserEntity;
import com.spring.service.IUserService;

@Service("UserService")
@Transactional
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
 

	@Override
	public boolean registUser(UserEntity user) {
		if(userDao.addUser(user)){
			System.out.println("����û��ɹ�");
			return true;
		}else{
			System.out.println("����û�ʧ��");
			return false;
		}
	}
}
