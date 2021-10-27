package com.cogent.springecommerce.service;

import java.util.Optional;

import com.cogent.springecommerce.dto.User;

public interface UserService {
	public String addUser(User user);
	public String deleteUserById(String Id);
	public void deleteAll();
	public Optional<User> getUserById(String Id);
	public String updateUser(String Id, User user);
}
