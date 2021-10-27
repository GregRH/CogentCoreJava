package com.cogent.springecommerce.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.apachecommons.CommonsLog;
@Component
public class DBUtils {
	@Autowired
	DataSource dataSource;
	
	public DBUtils() {}
	
	
	public Connection getConnection() {
		Connection con = null;
		try {
			con = dataSource.getConnection();
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public void closeConnection(Connection connection) {
		if(connection!=null)
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

