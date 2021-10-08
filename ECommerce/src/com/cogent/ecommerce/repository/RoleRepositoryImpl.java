package com.cogent.ecommerce.repository;

import com.cogent.ecommerce.dto.Role;

public class RoleRepositoryImpl implements RoleRepository {
	private static RoleRepository roleRepository;
	private RoleRepositoryImpl() {}
	public static RoleRepository getInstance() {
		if(roleRepository==null) {
			synchronized (RoleRepositoryImpl.class) {
				if(roleRepository==null) {
					roleRepository=new RoleRepositoryImpl();
					return roleRepository;
				}
			}
		}
		
		return roleRepository;
	}
	@Override
	public boolean addRole(Role role) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteRoleById(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean updateRole(String id, Role role) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Role getRoleById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
