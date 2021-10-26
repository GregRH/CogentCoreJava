package com.cogent.ecommerceJDBC.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cogent.ecommerceJDBC.dto.Catalog;
import com.cogent.ecommerceJDBC.utils.DBUtils;
@Repository
public class CatalogRepositoryImpl implements CatalogRepository {
	@Autowired
	DBUtils dbutils;// = DBUtils.getInstance();
//	private static CatalogRepository catalogRepository;
//	private CatalogRepositoryImpl() {}
//	public static CatalogRepository getInstance() {
//		if(catalogRepository==null) {
//			synchronized (CatalogRepositoryImpl.class) {
//				if(catalogRepository==null) {
//					catalogRepository=new CatalogRepositoryImpl();
//					return catalogRepository;
//				}
//			}
//		}
//		return catalogRepository;
//	}
	@Override
	public String addCatalog(Catalog catalog) {
		Connection con = dbutils.getConnection();
		String query= "INSERT INTO catalog VALUES(?,?,?,?,?)";
		try {
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, catalog.getProductID());
			pt.setString(2, catalog.getProductName());
			pt.setString(3, catalog.getCatID());
			pt.setString(4, catalog.getProductDescription());
			pt.setString(5, catalog.getProductImage());
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
	public String deleteCatalogById(String Id) {
		Connection con = dbutils.getConnection();
		try {
			String query = "DELETE FROM catalog WHERE productId = ?";
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
			String query = "TRUNCATE table catalog";
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
	public Optional<Catalog> getCatalogById(String Id) {
		Connection con = dbutils.getConnection();
		String query = "SELECT * FROM catalog WHERE productId = ?";
		try {
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, Id);
			ResultSet rs = pt.executeQuery();
			if(rs.next()) {
				Catalog cat = new Catalog();
				cat.setProductID(rs.getString("productId"));
				cat.setProductName(rs.getString("productName"));
				cat.setCatID(rs.getString("catId"));
				cat.setProductDescription(rs.getString("productDescription"));
				cat.setProductImage(rs.getString("productImage"));
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
	public String updateCatalog(String Id, Catalog catalog) {
		Connection con = dbutils.getConnection();
		String query = "UPDATE catalog SET productId = ?, productName = ?, catId = ?, procductDescription = ?, productImage = ? WHERE productId = ?"; 
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, catalog.getProductID());
			ps.setString(2, catalog.getProductName());
			ps.setString(3, catalog.getCatID());
			ps.setString(4, catalog.getProductDescription());
			ps.setString(5, catalog.getProductImage());
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
