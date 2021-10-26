package com.cogent.ecommerceJDBC.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cogent.ecommerceJDBC.dto.Inventory;
import com.cogent.ecommerceJDBC.utils.DBUtils;
@Repository
public class InventoryRepositoryImpl implements InventoryRepository {
	@Autowired
	DBUtils dbutils;// = DBUtils.getInstance();
//	private static InventoryRepository inventoryRepository;
//	private InventoryRepositoryImpl() {}
//	public static InventoryRepository getInstance() {
//		if(inventoryRepository==null) {
//			synchronized (InventoryRepositoryImpl.class) {
//				if(inventoryRepository==null) {
//					inventoryRepository=new InventoryRepositoryImpl();
//					return inventoryRepository;
//				}
//			}
//		}
//		
//		return inventoryRepository;
//	}
	@Override
	public String addInventory(Inventory inventory) {
		Connection con = dbutils.getConnection();
		String query= "INSERT INTO inventory VALUES(?,?,?,?,?)";
		try {
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, inventory.getInvID());
			pt.setString(2, inventory.getUserID());
			pt.setString(3, inventory.getProductID());
			pt.setInt(4, inventory.getProductQty());
			pt.setDouble(5, inventory.getProductPrice());
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
	public String deleteInventoryById(String Id) {
		Connection con = dbutils.getConnection();
		try {
			String query = "DELETE FROM inventory WHERE invId = ?";
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
			String query = "TRUNCATE table inventory";
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
	public Optional<Inventory> getInventoryById(String Id) {
		Connection con = dbutils.getConnection();
		String query = "SELECT * FROM inventory WHERE inventoryId = ?";
		try {
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, Id);
			ResultSet rs = pt.executeQuery();
			if(rs.next()) {
				Inventory inv = new Inventory();
				inv.setInvID(rs.getString("invId"));
				inv.setUserID(rs.getString("userId"));
				inv.setProductID(rs.getString("productId"));
				inv.setProductQty(rs.getInt("productQty"));
				inv.setProductPrice(rs.getDouble("productPrice"));
				return Optional.ofNullable(inv);
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
	public String updateInventory(String Id, Inventory inventory) {
		Connection con = dbutils.getConnection();
		String query = "UPDATE inventory SET invId = ?, userId = ?, productId = ?, productQty = ?, productPrice = ? WHERE productId = ?"; 
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, inventory.getInvID());
			ps.setString(2, inventory.getUserID());
			ps.setString(3, inventory.getProductID());
			ps.setInt(4, inventory.getProductQty());
			ps.setDouble(5, inventory.getProductPrice());
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
