package com.cogent.ecommerce.repository;

import com.cogent.ecommerce.dto.User;

public class UserRepositoryImpl implements UserRepository {
	private static UserRepository userRepository;
	private UserRepositoryImpl() {}
	public static UserRepository getInstance() {
		if(userRepository==null)
			userRepository=new UserRepositoryImpl();
		return userRepository;
	}
	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteUserById(String Id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public User getUserById(String Id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean updateUser(String Id, User user) {
		// TODO Auto-generated method stub
		return false;
	}
}
