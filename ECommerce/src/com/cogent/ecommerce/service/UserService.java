package com.cogent.ecommerce.service;

import com.cogent.ecommerce.dto.User;

public interface UserService {
	public boolean addUser(User user);
	public boolean deleteUserById(String Id);
	public void deleteAll();
	public User getUserById(String Id);
	public boolean updateUser(String Id, User user);
}
