package com.cogent.ecommerce.service;

import com.cogent.ecommerce.dto.User;
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
	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return repository.addUser(user);
	}
	@Override
	public boolean deleteUserById(String Id) {
		// TODO Auto-generated method stub
		return repository.deleteUserById(Id);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}
	@Override
	public User getUserById(String Id) {
		// TODO Auto-generated method stub
		return repository.getUserById(Id);
	}
	@Override
	public boolean updateUser(String Id, User user) {
		// TODO Auto-generated method stub
		return updateUser(Id, user);
	}
}
