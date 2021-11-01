package com.cogent.empspringboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.empspringboot.dto.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

//	public String addEmployee(Employee employee );
//	public String deleteEmployeeById(String id) ;
//	public void deleteAllEmployees();
//	public Optional<Employee> getEmployeeById(String id) ;
//	public Optional<List<Employee>> getEmployees();
//	public String updateEmployee(String id, Employee employee);
//	public boolean isEmployeeExists(String id);
//	
	
	
}

