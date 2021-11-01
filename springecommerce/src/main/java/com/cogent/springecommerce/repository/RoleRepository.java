package com.cogent.springecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.springecommerce.dto.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
//	public String addRole(Role role);
//	public String deleteRoleById(String id);
//	public String updateRole(String id, Role role);
//	public void deleteAll();
//	public Optional<Role> getRoleById(String id);
}
