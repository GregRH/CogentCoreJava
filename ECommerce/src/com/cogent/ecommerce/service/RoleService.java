package com.cogent.ecommerce.service;

import com.cogent.ecommerce.dto.Role;

public interface RoleService {
	public boolean addRole(Role role);
	public boolean deleteRoleById(String id);
	public boolean updateRole(String id, Role role);
	public void deleteAll();
	public Role getRoleById(String id);
}
