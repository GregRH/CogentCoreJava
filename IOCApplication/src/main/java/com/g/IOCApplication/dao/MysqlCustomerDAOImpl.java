package com.g.IOCApplication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.g.IOCApplication.bo.CustomerBO;

public final class MysqlCustomerDAOImpl implements CustomerDAO {
	private static final String CUSTOMER_INSERT_QUERY
	="INSERT INTO SPRING_CUSTOMER(CNAME,CADD,PAMT,INTRAMT) VALUES(?,?,?,?)";
	private DataSource ds;
	public MysqlCustomerDAOImpl(DataSource ds) {
		this.ds=ds;
	}
	public int insert(CustomerBO bo) throws Exception {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps =null;
		int count=0;
		con=ds.getConnection();
		ps=con.prepareStatement(CUSTOMER_INSERT_QUERY);
		ps.setString(1,bo.getCname());
		ps.setString(2,bo.getCadd());
		ps.setFloat(3,bo.getPamt());
		ps.setFloat(4,bo.getIntramt());
		count = ps.executeUpdate();
		ps.close();
		con.close();
		return count;
	}

}
