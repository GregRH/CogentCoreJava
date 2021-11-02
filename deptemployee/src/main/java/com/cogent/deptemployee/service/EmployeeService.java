package com.cogent.deptemployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.deptemployee.dto.Employee;
import com.cogent.deptemployee.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRep;
	public void insert(Employee emp) {
		empRep.save(emp);
	}
	public List<Employee> getEmployees(){
		return empRep.getAllData();
	}
}
