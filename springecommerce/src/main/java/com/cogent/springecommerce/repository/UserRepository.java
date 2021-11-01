package com.cogent.springecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.springecommerce.dto.User;
@Repository
public interface UserRepository extends JpaRepository<User, String> {
//	public String addUser(User user);
//	public String deleteUserById(String Id);
//	public void deleteAll();
//	public Optional<User> getUserById(String Id);
//	public String updateUser(String Id, User user);
	
	
}
