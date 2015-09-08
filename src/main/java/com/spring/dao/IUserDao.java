package com.spring.dao;

import com.spring.entity.UserEntity;

public interface IUserDao {
 public boolean isExist(UserEntity user);
}
