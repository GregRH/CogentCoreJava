package com.cogent.ecommerce.repository;

public class UserRepositoryImpl implements UserRepository {
	private static UserRepository userRepository;
	private UserRepositoryImpl() {}
	public static UserRepository getInstance() {
		if(userRepository==null)
			userRepository=new UserRepositoryImpl();
		return userRepository;
	}
}
