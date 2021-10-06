package com.cogent.ecommerce.repository;

import com.cogent.ecommerce.dto.User;

public interface UserRepository {
	public boolean addUser(User user);
	public boolean deleteUserById(String Id);
	public void deleteAll();
	public User getUserById(String Id);
	public boolean updateUser(String Id, User user);
	
	
}
