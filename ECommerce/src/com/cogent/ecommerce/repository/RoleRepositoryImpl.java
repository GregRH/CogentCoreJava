package com.cogent.ecommerce.repository;

public class RoleRepositoryImpl implements RoleRepository {
	private static RoleRepository roleRepository;
	private RoleRepositoryImpl() {}
	public static RoleRepository getInstance() {
		if(roleRepository==null)
			roleRepository=new RoleRepositoryImpl();
		return roleRepository;
	}
	
}
