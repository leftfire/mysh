package com.spring.dao;

import com.spring.entity.UserEntity;

public interface IUserDao {
 public boolean getUserbyUserName(String name);
 public boolean addUser(UserEntity user);
 public void updateUser(UserEntity user);
 public void deleteUser(UserEntity user);
 
}
