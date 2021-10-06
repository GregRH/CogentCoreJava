package com.cogent.ecommerce.repository;

import com.cogent.ecommerce.dto.Role;

public interface RoleRepository {
	public boolean addRole(Role role);
	public boolean deleteRoleById(String id);
	public boolean updateRole(String id, Role role);
	public void deleteAll();
	public Role getRoleById(String id);
}
