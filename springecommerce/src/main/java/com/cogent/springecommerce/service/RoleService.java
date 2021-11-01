package com.cogent.springecommerce.service;

import java.util.List;
import java.util.Optional;

import com.cogent.springecommerce.dto.Role;

public interface RoleService {
	public String addRole(Role role);
	public String deleteRoleById(String id);
	public String updateRole(String id, Role role);
	public void deleteAll();
	public Optional<Role> getRoleById(String id);
	public Optional<List<Role>> getAllRole();
}
