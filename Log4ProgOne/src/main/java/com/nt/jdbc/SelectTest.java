package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SelectTest {
	private static Logger logger = Logger.getLogger(SelectTest.class);
	static {
		try {
			PropertyConfigurator.configure("src/main/resources/log4j.properties");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql:///productcrud","root","#gRh1234567890");
			if(con!=null) {
				st=con.createStatement();
				if(st!=null) {
					rs=st.executeQuery("SELECT * FROM STUDENT");
					if(rs!=null) {
						while(rs.next()) {
							System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
						}
					}
				}
			}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)
					rs.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(st!=null)
					st.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
		}
		
	}
}
