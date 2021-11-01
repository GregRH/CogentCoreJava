package com.cogent.springecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springecommerce.dto.User;
import com.cogent.springecommerce.repository.UserRepository;



@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository repository;// = UserRepositoryImpl.getInstance();

	@Override
	public String addUser(User user) {
		User added = repository.save(user);
		if(added!=null)
			return "success";
		else
			return "fail";
	}

	@Override
	public String deleteUserById(String Id) {
		if(repository.existsById(Id)) {
			repository.deleteById(Id);
			return "Success";
		}
		return "Id not found";
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
		
	}

	@Override
	public Optional<User> getUserById(String Id) {
		User data = repository.getById(Id);
		return Optional.ofNullable(data);
	}

	@Override
	public String updateUser(String Id, User user) {
		if(repository.existsById(Id)) {
			repository.save(user);
			return "Success";
		}
		return "ID not found";
	}

	@Override
	public Optional<List<User>> getAllUser() {
		return Optional.ofNullable(repository.findAll());
	}

}
