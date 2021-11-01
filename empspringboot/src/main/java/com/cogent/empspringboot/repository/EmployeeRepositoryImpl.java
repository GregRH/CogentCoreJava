//package com.cogent.empspringboot.repository;
//
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.cogent.empspringboot.dto.Employee;
//import com.cogent.empspringboot.utils.DBUtils;
//@Repository
//public class EmployeeRepositoryImpl implements EmployeeRepository {
//	@Autowired
//	DBUtils dbutils;
//	public String addEmployee(Employee employee) {
//		Connection con = dbutils.getConnection();
//		String insertStatement = "insert into employeeDatabase values(?,?,?,?,?,?)";
//		try {
//			PreparedStatement ps = con.prepareStatement(insertStatement);
//			ps.setString(1,employee.getEmpId());
//			ps.setString(2, employee.getEmpFirstName());
//			ps.setString(3, employee.getEmpLastname());
//			ps.setDate(4, new Date(employee.getDoj().getTime()));
//			ps.setDate(5, new Date(employee.getDob().getTime()));
//			ps.setFloat(6, employee.getEmpSalary());
//			int count = ps.executeUpdate();
//			ps.close();
//			dbutils.closeConnection(con);
//			return "Success "+count;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		dbutils.closeConnection(con);
//		return null;
//	}
//
//	public String deleteEmployeeById(String id) {
//		// TODO Auto-generated method stub
//		Connection con = dbutils.getConnection();
//		try {
//			String query = "DELETE FROM employeeDatabase WHERE empId = ?";
//			PreparedStatement st = con.prepareStatement(query);
//			st.setString(1, id);
//			st.executeUpdate();
//			st.close();
//			dbutils.closeConnection(con);
//			return("Success");
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		dbutils.closeConnection(con);
//		return null;
//	}
//
//	public void deleteAllEmployees() {
//		// TODO Auto-generated method stub
//		Connection con = dbutils.getConnection();
//		
//		try {
//			Statement st = con.createStatement();
//			String query = "TRUNCATE table employeeDatabase";
//			st.executeUpdate(query);
//			st.close();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		dbutils.closeConnection(con);
//	}
//
//	public Optional<Employee> getEmployeeById(String id) {
//		// TODO Auto-generated method stub
//		Connection con = dbutils.getConnection();
//		String preparedQuery = "SELECT * from employeeDatabase WHERE empId = ? LIMIT 1";
//		try {
//			PreparedStatement pt =con.prepareStatement(preparedQuery);
//			pt.setString(1, id);
//			ResultSet rs = pt.executeQuery();
//			if(rs.next()) {
//				Employee e = new Employee();
//				e.setEmpId(rs.getString(1));
//				e.setEmpFirstName(rs.getString(2));
//				e.setEmpLastname(rs.getString(3));
//				e.setDoj(rs.getDate(4));
//				e.setDob(rs.getDate(5));
//				e.setEmpSalary(rs.getFloat(6));
//				rs.close();
//				pt.close();
//				
//				return Optional.ofNullable(e);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//		dbutils.closeConnection(con);}
//		return Optional.empty();
//	}
//
//	public Optional<List<Employee>> getEmployees() {
//		// TODO Auto-generated method stub
//		List<Employee> employees = new ArrayList<Employee>();
//		Connection con = dbutils.getConnection();
//		String query = "SELECT * FROM employeeDatabase";
//		Statement st;
//		
//		try {
//			st = con.createStatement();
//			ResultSet rs = st.executeQuery(query);
//			while(rs.next()) {
//				Employee emp = new Employee();
//				emp.setEmpId(rs.getString("empId"));
//				emp.setEmpFirstName(rs.getString("empFirstName"));
//				emp.setEmpLastname(rs.getString("empLastName"));
//				emp.setDoj(rs.getDate("doj"));
//				emp.setDob(rs.getDate("dob"));
//				emp.setEmpSalary(rs.getFloat("empSalary"));
//				employees.add(emp);
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			dbutils.closeConnection(con);
//		}
//		
//		return Optional.ofNullable(employees);
//	}
//
//	public String updateEmployee(String id, Employee employee) {
//		// TODO Auto-generated method stub
//		Connection con = dbutils.getConnection();
//		String query = "UPDATE employeeDatabase SET empId = ?, empFirstName = ?, empLastName = ?, doj = ?, dob = ?, empSalary = ? WHERE empId = ?"; 
//		try {
//			PreparedStatement ps = con.prepareStatement(query);
//			ps.setString(1,employee.getEmpId());
//			ps.setString(2, employee.getEmpFirstName());
//			ps.setString(3, employee.getEmpLastname());
//			ps.setDate(4, new Date(employee.getDoj().getTime()));
//			ps.setDate(5, new Date(employee.getDob().getTime()));
//			ps.setFloat(6, employee.getEmpSalary());
//			ps.setString(7,employee.getEmpId());
//			ps.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	public boolean isEmployeeExists(String id) {
//		Connection con = dbutils.getConnection();
//		String query = "SELECT * FROM employeeDatabase WHERE empId = ?";
//		try {
//			PreparedStatement pt = con.prepareStatement(query);
//			pt.setString(1, id);
//			ResultSet rt = pt.executeQuery();
//			boolean flag =rt.next();
//			rt.close();
//			pt.close();
//			return flag;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally {
//			dbutils.closeConnection(con);
//		}
//		return false;
//	}
//
//}
