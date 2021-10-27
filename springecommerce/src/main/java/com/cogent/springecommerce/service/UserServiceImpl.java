package com.cogent.springecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springecommerce.dto.User;
import com.cogent.springecommerce.repository.UserRepository;



@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository repository;// = UserRepositoryImpl.getInstance();
//	public static UserService userService;
//	private UserServiceImpl() {}
//	public static UserService getInstance() {
//		if(userService==null) {
//			synchronized (UserServiceImpl.class) {
//				if(userService==null) {
//					userService=new UserServiceImpl();
//					return userService;
//				}
//			}
//		}
//		
//		return userService;
//	}
	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		return repository.addUser(user);
	}
	@Override
	public String deleteUserById(String Id) {
		// TODO Auto-generated method stub
		return repository.deleteUserById(Id);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}
	@Override
	public Optional<User> getUserById(String Id) {
		// TODO Auto-generated method stub
		return repository.getUserById(Id);
	}
	@Override
	public String updateUser(String Id, User user) {
		// TODO Auto-generated method stub
		return repository.updateUser(Id, user);
	}
}
