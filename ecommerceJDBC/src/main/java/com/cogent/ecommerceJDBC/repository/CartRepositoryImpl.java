package com.cogent.ecommerceJDBC.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cogent.ecommerceJDBC.dto.Cart;
import com.cogent.ecommerceJDBC.utils.DBUtils;
@Repository
public class CartRepositoryImpl implements CartRepository {
	@Autowired
	DBUtils dbutils;// = DBUtils.getInstance();
//	private static CartRepository cartRepository;
//	private CartRepositoryImpl() {}
//	public static CartRepository getInstance() {
//		if(cartRepository==null) {
//			synchronized (CartRepositoryImpl.class) {
//				if(cartRepository==null) {
//					cartRepository=new CartRepositoryImpl();
//					return cartRepository;
//				}
//			}
//		}
//		return cartRepository;
//	}
	@Override
	public String addCart(Cart cart) {
		Connection con = dbutils.getConnection();
		String query= "INSERT INTO cart VALUES(?,?,?,?,?,?,?)";
		try {
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, cart.getCartID());
			pt.setString(2, cart.getUserID());
			pt.setString(3, cart.getInvID());
			pt.setString(4, cart.getProductID());
			pt.setInt(5, cart.getProductQty());
			pt.setDouble(6, cart.getProductPrice());
			pt.setDouble(7, cart.getTotalPrice());
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
	public String deleteCartById(String Id) {
		Connection con = dbutils.getConnection();
		try {
			String query = "DELETE FROM cart WHERE cartId = ?";
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
			String query = "TRUNCATE table cart";
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
	public Optional<Cart> getCartById(String Id) {
		// TODO Auto-generated method stub
		Connection con = dbutils.getConnection();
		String query = "SELECT * FROM cart WHERE cartId = ?";
		try {
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, Id);
			ResultSet rs = pt.executeQuery();
			if(rs.next()) {
				Cart cart = new Cart();
				cart.setCartID(rs.getString("cartId"));
				cart.setUserID(rs.getString("userId"));
				cart.setInvID(rs.getString("invId"));
				cart.setProductID(rs.getString("productId"));
				cart.setProductQty(rs.getInt("productQty"));
				cart.setProductPrice(rs.getDouble("productPrice"));
				cart.setTotalPrice(rs.getDouble("totalPrice"));
				return Optional.ofNullable(cart);
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
	public String updateCart(String Id, Cart cart) {
		// TODO Auto-generated method stub
		Connection con = dbutils.getConnection();
		String query = "UPDATE cart SET productId = ?, productName = ?, catId = ?, productDescription = ?, productQty = ?, productPrice = ?, totalPrice WHERE cartId = ?"; 
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,cart.getCartID());
			ps.setString(2, cart.getUserID());
			ps.setString(3, cart.getInvID());
			ps.setString(4, cart.getProductID());
			ps.setInt(5, cart.getProductQty());
			ps.setDouble(6, cart.getProductPrice());
			ps.setDouble(7, cart.getTotalPrice());
			ps.setString(8,Id);
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
