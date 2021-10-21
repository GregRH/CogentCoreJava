package utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class DBUtils {
	private static DBUtils dbutils; 
	
	private DBUtils() {}
	
	public static DBUtils getInstance() {
		if(dbutils==null) {
			dbutils = new DBUtils(); 
		}
		return dbutils;
	}
	public Properties readProperties() {
		Properties properties = new Properties();
		InputStream inputStream = getClass().getClassLoader()
				.getResourceAsStream("application.properties");
		
		try {
			properties.load(inputStream);
			return properties;
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	public Connection getConnection() {
		Properties proporties = this.readProperties();
		try {
			Class.forName(proporties.getProperty("db.className"));
			Connection con = DriverManager.getConnection(proporties.getProperty("db.url"),proporties.getProperty("db.username"),proporties.getProperty("db.password"));
			return con;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
