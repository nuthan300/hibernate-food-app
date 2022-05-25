package com.ty.food.controller;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class TestSaveUser {

	public static void main(String[] args) {
		
		UserService service=new UserService();
		
		User user=new User();
		user.setName("prashant");
		user.setEmail("prashant@gmail.com");
		user.setPassword("PP123");
		user.setPhone(7766553399l);
		service.saveUSer(user);
	}
}
