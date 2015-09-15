package com.spring.dao.impl;

import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.IUserDao;
import com.spring.entity.UserEntity;
import com.spring.utils.Hibernate;
@Repository
public class UserDaoImpl extends Hibernate implements IUserDao{
	
	private Transaction transaction = null;	
	
	
	
	@Override
	public boolean getUserbyUserName(String name) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	@Transactional
	public boolean addUser(UserEntity user) {
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getEmail());
		try {
			//transaction.begin();
			getCurrentSession().save(user);
			
			
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public void updateUser(UserEntity user) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void deleteUser(UserEntity user) {
		// TODO 自动生成的方法存根

	}

}
