package com.cogent.ecommerce.service;

import com.cogent.ecommerce.dto.Role;
import com.cogent.ecommerce.repository.RoleRepository;
import com.cogent.ecommerce.repository.RoleRepositoryImpl;

public class RoleServiceImpl implements RoleService {
	private RoleRepository repository = RoleRepositoryImpl.getInstance();
	private static RoleService roleService;
	private RoleServiceImpl() {}
	public static RoleService getInstance() {
		if(roleService==null) {
			synchronized (RoleServiceImpl.class) {
				if(roleService==null) {
					roleService=new RoleServiceImpl();
					return roleService;
				}
			}
		}
		
		return roleService;
	}
	@Override
	public boolean addRole(Role role) {
		// TODO Auto-generated method stub
		return repository.addRole(role);
	}
	@Override
	public boolean deleteRoleById(String id) {
		// TODO Auto-generated method stub
		return repository.deleteRoleById(id);
	}
	@Override
	public boolean updateRole(String id, Role role) {
		// TODO Auto-generated method stub
		return repository.updateRole(id, role);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
		
	}
	@Override
	public Role getRoleById(String id) {
		// TODO Auto-generated method stub
		return repository.getRoleById(id);
	}
}
