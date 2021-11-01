package com.cogent.springecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springecommerce.dto.Role;
import com.cogent.springecommerce.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleRepository repository;// = RoleRepositoryImpl.getInstance();

	@Override
	public String addRole(Role role) {
		Role added = repository.save(role);
		if(added!=null)
			return "success";
		else
			return "fail";
	}

	@Override
	public String deleteRoleById(String id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
			return "Success";
		}
		return "Id not found";
	}

	@Override
	public String updateRole(String id, Role role) {
		if(repository.existsById(id)) {
			repository.save(role);
			return "Success";
		}
		return "ID not found";
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
		
	}

	@Override
	public Optional<Role> getRoleById(String id) {
		Role data = repository.getById(id);
		return Optional.ofNullable(data);
	}

	@Override
	public Optional<List<Role>> getAllRole() {
		return Optional.ofNullable(repository.findAll());
	}

}
