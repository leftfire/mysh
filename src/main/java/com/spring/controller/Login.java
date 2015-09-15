package com.spring.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.dao.IUserDao;
import com.spring.entity.UserEntity;

@Controller(value="login")
@RequestMapping("/user")
public class Login {
	@Resource
	private IUserDao iUserDao;
	
	@RequestMapping(value="/login")
	public String Gologin(){
		return "login";
	}
	@RequestMapping(value="/regist")
	public String regist(@ModelAttribute() UserEntity user){
		if (iUserDao.addUser(user)){
			return "ok";
		}else{
			return"error";
		}
	}
	
}

