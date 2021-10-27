package com.cogent.springecommerce.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cogent.springecommerce.dto.User;
import com.cogent.springecommerce.utils.DBUtils;
@Repository
public class UserRepositoryImpl implements UserRepository {
	@Autowired
	DBUtils dbutils; //= DBUtils.getInstance();
	//private static UserRepository userRepository;
//	private UserRepositoryImpl() {}
//	public static UserRepository getInstance() {
//		if(userRepository==null) {
//			synchronized (UserRepositoryImpl.class) {
//				if(userRepository==null) {
//					userRepository=new UserRepositoryImpl();
//					return userRepository;
//				}
//			}
//		}
//		return userRepository;
//	}
	@Override
	public String addUser(User user) {
		Connection con = dbutils.getConnection();
		String query= "INSERT INTO user VALUES(?,?,?,?,?)";
		try {
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, user.getUserId());
			pt.setString(2, user.getUserName());
			pt.setString(3, user.getPassword());
			pt.setString(4,  user.getEmailId());
			pt.setString(5, user.getRoleId());
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
	public String deleteUserById(String Id) {
		Connection con = dbutils.getConnection();
		try {
			String query = "DELETE FROM user WHERE userId = ?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, Id);
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
	public void deleteAll() {
		Connection con = dbutils.getConnection();

		try {
			Statement st = con.createStatement();
			String query = "TRUNCATE table user";
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
	public Optional<User> getUserById(String Id) {
		Connection con = dbutils.getConnection();
		String query = "SELECT * FROM user WHERE userId = ?";
		try {
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, Id);
			ResultSet rs = pt.executeQuery();
			if(rs.next()) {
				User user = new User();
				user.setUserId(rs.getString("userId"));
				user.setUserName(rs.getString("userName"));
				user.setPassword(rs.getString("pass"));
				user.setEmailId(rs.getString("emailId"));
				user.setRoleId(rs.getString("roleId"));
				
				return Optional.ofNullable(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbutils.closeConnection(con);
		}
		return Optional.empty();
	}
	@Override
	public String updateUser(String Id, User user) {
		Connection con = dbutils.getConnection();
		String query = "UPDATE user SET userId = ?, userName = ?, pass = ?, emailId = ?, roleId = ? WHERE userId = ?"; 
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, user.getUserId());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getEmailId());
			ps.setString(5, user.getRoleId());
			ps.setString(6,Id);
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
}
