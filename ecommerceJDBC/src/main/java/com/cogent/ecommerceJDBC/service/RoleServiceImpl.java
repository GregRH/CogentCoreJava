package com.cogent.ecommerceJDBC.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerceJDBC.dto.Role;
import com.cogent.ecommerceJDBC.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleRepository repository;// = RoleRepositoryImpl.getInstance();
//	private static RoleService roleService;
//	private RoleServiceImpl() {}
//	public static RoleService getInstance() {
//		if(roleService==null) {
//			synchronized (RoleServiceImpl.class) {
//				if(roleService==null) {
//					roleService=new RoleServiceImpl();
//					return roleService;
//				}
//			}
//		}
//		
//		return roleService;
//	}
	@Override
	public String addRole(Role role) {
		// TODO Auto-generated method stub
		return repository.addRole(role);
	}
	@Override
	public String deleteRoleById(String id) {
		// TODO Auto-generated method stub
		return repository.deleteRoleById(id);
	}
	@Override
	public String updateRole(String id, Role role) {
		// TODO Auto-generated method stub
		return repository.updateRole(id, role);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
		
	}
	@Override
	public Optional<Role> getRoleById(String id) {
		// TODO Auto-generated method stub
		return repository.getRoleById(id);
	}
}
