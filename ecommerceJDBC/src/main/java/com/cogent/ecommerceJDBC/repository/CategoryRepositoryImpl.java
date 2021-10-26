package com.cogent.ecommerceJDBC.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cogent.ecommerceJDBC.dto.Category;
import com.cogent.ecommerceJDBC.utils.DBUtils;
@Repository
public class CategoryRepositoryImpl implements CategoryRepository {
	@Autowired
	DBUtils dbutils;// = DBUtils.getInstance();
//	private static CategoryRepository categoryRepository;
//	private CategoryRepositoryImpl() {}
//	public static CategoryRepository getInstance() {
//		if(categoryRepository==null) {
//			synchronized (CategoryRepositoryImpl.class) {
//				if(categoryRepository==null) {
//					categoryRepository=new CategoryRepositoryImpl();
//					return categoryRepository;
//				}
//			}
//		}
//		
//		return categoryRepository;
//	}
	@Override
	public String addCategory(Category category) {
		Connection con = dbutils.getConnection();
		String query= "INSERT INTO category VALUES(?,?)";
		try {
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, category.getCatID());
			pt.setString(2, category.getCatName());
			
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
	public String deleteCategoryById(String Id) {
		Connection con = dbutils.getConnection();
		try {
			String query = "DELETE FROM category WHERE catId = ?";
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
			String query = "TRUNCATE table category";
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
	public Optional<Category> getCategoryById(String Id) {
		Connection con = dbutils.getConnection();
		String query = "SELECT * FROM catagory WHERE catId = ?";
		try {
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, Id);
			ResultSet rs = pt.executeQuery();
			if(rs.next()) {
				Category cat = new Category();
				cat.setCatID(rs.getString("catId"));
				cat.setCatName(rs.getString("catName"));
				return Optional.ofNullable(cat);
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
	public String updateCategory(String Id, Category category) {
		Connection con = dbutils.getConnection();
		String query = "UPDATE category SET catId = ?, catName = ? WHERE catId = ?"; 
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, category.getCatID());
			ps.setString(2, category.getCatName());
			ps.setString(3,Id);
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
