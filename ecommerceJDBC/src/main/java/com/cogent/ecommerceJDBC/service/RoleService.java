package com.cogent.ecommerceJDBC.service;

import java.util.Optional;

import com.cogent.ecommerceJDBC.dto.Role;

public interface RoleService {
	public String addRole(Role role);
	public String deleteRoleById(String id);
	public String updateRole(String id, Role role);
	public void deleteAll();
	public Optional<Role> getRoleById(String id);
}
