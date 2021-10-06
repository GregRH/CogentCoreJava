package com.cogent.ecommerce.service;

import com.cogent.ecommerce.repository.RoleRepository;
import com.cogent.ecommerce.repository.RoleRepositoryImpl;

public class RoleServiceImpl implements RoleService {
	private RoleRepository repository = RoleRepositoryImpl.getInstance();
	private static RoleService roleService;
	private RoleServiceImpl() {}
	public static RoleService getInstance() {
		if(roleService==null)
			roleService=new RoleServiceImpl();
		return roleService;
	}
}
