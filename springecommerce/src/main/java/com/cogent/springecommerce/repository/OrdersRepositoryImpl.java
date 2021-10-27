package com.cogent.springecommerce.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cogent.springecommerce.dto.Orders;
import com.cogent.springecommerce.utils.DBUtils;
@Repository
public class OrdersRepositoryImpl implements OrdersRepository {
	@Autowired
	DBUtils dbutils;// = DBUtils.getInstance();
//	private static OrdersRepository ordersRepository;
//	private OrdersRepositoryImpl() {}
//	public static OrdersRepository getInstance() {
//		if(ordersRepository==null) {
//			synchronized (OrdersRepositoryImpl.class) {
//				if(ordersRepository==null) {
//					ordersRepository=new OrdersRepositoryImpl();
//					return ordersRepository;
//				}
//			}
//		}
//		
//		return ordersRepository;
//	}
	@Override
	public String addOrders(Orders orders) {
		Connection con = dbutils.getConnection();
		String query= "INSERT INTO orders VALUES(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, orders.getOrderID());
			pt.setString(2, orders.getUserID());	
			pt.setString(3, orders.getInvID());
			
			pt.setString(4, orders.getProductID());
			pt.setInt(5, orders.getProductQty());
			pt.setDouble(6, orders.getProductPrice());
			pt.setDouble(7, orders.getTotalPrice());
			pt.setDouble(8, orders.getGrandTotalPrice());
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
	public String deleteOrdersById(String Id) {
		Connection con = dbutils.getConnection();
		try {
			String query = "DELETE FROM orders WHERE orderId = ?";
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
			String query = "TRUNCATE table orders";
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
	public Optional<Orders> getOrdersById(String Id) {
		Connection con = dbutils.getConnection();
		String query = "SELECT * FROM orders WHERE orderId = ?";
		try {
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, Id);
			ResultSet rs = pt.executeQuery();
			if(rs.next()) {
				Orders order = new Orders();
				order.setOrderID(rs.getString("orderId"));
				order.setInvID(rs.getString("invId"));
				order.setUserID(rs.getString("userId"));
				order.setProductID(rs.getString("productId"));
				order.setProductQty(rs.getInt("productQty"));
				order.setProductPrice(rs.getDouble("productPrice"));
				order.setTotalPrice(rs.getDouble("totalPrice"));
				order.setGrandTotalPrice(rs.getDouble("grandTotalPrice"));
				return Optional.ofNullable(order);
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
	public String updateOrders(String Id, Orders orders) {
		Connection con = dbutils.getConnection();
		String query = "UPDATE orders SET orderId = ?, userId = ?, invId = ?, productId = ?, productPrice = ?, totalPrice = ?, grandTotalPrice = ? WHERE orderId = ?"; 
		try {
			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, orders.getOrderID());
			pt.setString(2, orders.getUserID());	
			pt.setString(3, orders.getInvID());
			
			pt.setString(4, orders.getProductID());
			pt.setInt(5, orders.getProductQty());
			pt.setDouble(6, orders.getProductPrice());
			pt.setDouble(7, orders.getTotalPrice());
			pt.setDouble(8, orders.getGrandTotalPrice());
			pt.setString(9, Id);
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
}
