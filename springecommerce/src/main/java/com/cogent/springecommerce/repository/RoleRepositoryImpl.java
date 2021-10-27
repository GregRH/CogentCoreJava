package com.cogent.springecommerce.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cogent.springecommerce.dto.Role;
import com.cogent.springecommerce.utils.DBUtils;
@Repository
public class RoleRepositoryImpl implements RoleRepository {
	@Autowired
	DBUtils dbutils;// = DBUtils.getInstance();
//	private static RoleRepository roleRepository;
//	private RoleRepositoryImpl() {}
//	public static RoleRepository getInstance() {
//		if(roleRepository==null) {
//			synchronized (RoleRepositoryImpl.class) {
//				if(roleRepository==null) {
//					roleRepository=new RoleRepositoryImpl();
//					return roleRepository;
//				}
//			}
//		}
//	
//		return roleRepository;
//	}
	@Override
	public String addRole(Role role) {
		Connection con = dbutils.getConnection();
		String query= "INSERT INTO role VALUES(?,?)";
		try {
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, role.getRoleID());
			pt.setString(2, role.getRoleName());
			int count = pt.executeUpdate();
			if(count > 1) {
				return"success";
			}else
				return "failed to add";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			dbutils.closeConnection(con);
		}
		return null;
	}
	@Override
	public String deleteRoleById(String id) {
		Connection con = dbutils.getConnection();
		try {
			String query = "DELETE FROM role WHERE roleId = ?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, id);
			st.executeUpdate();
			st.close();
			return("Success");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbutils.closeConnection(con);
		}
		return "Faillure";
	}
	@Override
	public String updateRole(String id, Role role) {
		Connection con = dbutils.getConnection();
		String query = "UPDATE role SET roleId = ?, roleName = ? WHERE roleId = ?"; 
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, role.getRoleID());
			ps.setString(2, role.getRoleName());
			ps.setString(3, id);
			
			int count = ps.executeUpdate();
			if(count > 0)
				return"success";
			else
				return "failed to update";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			dbutils.closeConnection(con);
		}
		return "failed to update";
	}
	@Override
	public void deleteAll() {
		Connection con = dbutils.getConnection();

		try {
			Statement st = con.createStatement();
			String query = "TRUNCATE table role";
			st.executeUpdate(query);
			st.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbutils.closeConnection(con);
		}
		
	}
	@Override
	public Optional<Role> getRoleById(String id) {
		Connection con = dbutils.getConnection();
		String query = "SELECT * FROM catalog WHERE productId = ?";
		try {
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, id);
			ResultSet rs = pt.executeQuery();
			if(rs.next()) {
				Role role = new Role();
				role.setRoleID(rs.getString("roleId"));
				role.setRoleName(rs.getString("RoleName"));
				
				return Optional.ofNullable(role);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbutils.closeConnection(con);
		}
		return Optional.empty();
	}
	
}
