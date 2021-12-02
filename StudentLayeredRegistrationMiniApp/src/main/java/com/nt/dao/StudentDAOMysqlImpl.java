package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOMysqlImpl implements IStudentDAO {
	private static final String INSERT_LAYERED_STUDENT="INSERT INTO LAYERED_STUDENT(SNAME,SADD,TOTAL,AVG,RESULT) VALUES(?,?,?,?,?)";
	private DataSource ds;
	
	public StudentDAOMysqlImpl()throws Exception{
		 System.out.println("DAO 0param");
		 InitialContext ic = new InitialContext();
		 ds=(DataSource)ic.lookup("java:/comp/env/DsJndi-mysql");
	}
	
	@Override
		public int intsert(StudentBO bo) throws Exception {
		Connection con=getPooldJdbcConnection();
		PreparedStatement ps= con.prepareStatement(INSERT_LAYERED_STUDENT);
		ps.setString(1, bo.getSname());
		ps.setString(2, bo.getSadd());
		ps.setInt(3, bo.getTotal());
		ps.setFloat(4, bo.getAvg());
		ps.setString(5, bo.getResult());
		int result=ps.executeUpdate();
		ps.close();
		
		return result;
	}
	private Connection getPooldJdbcConnection()throws Exception{
		Connection con = ds.getConnection();
		return con;
	}

}
