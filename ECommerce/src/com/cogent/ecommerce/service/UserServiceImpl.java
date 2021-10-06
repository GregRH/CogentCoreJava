package com.cogent.ecommerce.service;

import com.cogent.ecommerce.repository.UserRepository;
import com.cogent.ecommerce.repository.UserRepositoryImpl;

public class UserServiceImpl implements UserService {
	private UserRepository repository = UserRepositoryImpl.getInstance();
	public static UserService userService;
	private UserServiceImpl() {}
	public static UserService getInstance() {
		if(userService==null)
			userService=new UserServiceImpl();
		return userService;
	}
}
