package com.cogent.employee_registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.employee_registration.bo.EmployeeBO;
import com.cogent.employee_registration.dao.EmployeeRepository;
import com.cogent.employee_registration.dto.EmployeeDTO;

@Service
public class EmployeeMgmtService {
	@Autowired
	EmployeeRepository dao;
	public String calculate(EmployeeDTO dto) throws Exception{
		EmployeeBO ebo = new EmployeeBO();
		ebo.setName(dto.getName());
		ebo.setAddress(dto.getAddress());
		ebo.setDepartment(dto.getDept());
		ebo.setSalary(dto.getSalary());
		float gs = calculateGrossSalary(dto.getSalary());
		ebo.setGross_salary(gs);
		float ns = calculateNetSalary(dto.getSalary());
		ebo.setNet_salary(ns);
		EmployeeBO saved = dao.save(ebo);
		if(saved!=null) {
			return("Insert Success:: Calculated salaries DA::"+
		calculateDA(ebo.getSalary())+" HRA::"+
		calculateHRA(ebo.getSalary())+" GrossSalary::"+
		calculateGrossSalary(ebo.getSalary())+" PF::"+
		calculatePF(ebo.getSalary())+" NetSalary::"+
		calculateNetSalary(ebo.getSalary()));
		}
		else {
			return("Failed to insert:: Calculated salaries DA::"+
					calculateDA(ebo.getSalary())+" HRA::"+
					calculateHRA(ebo.getSalary())+" GrossSalary::"+
					calculateGrossSalary(ebo.getSalary())+" PF::"+
					calculatePF(ebo.getSalary())+" NetSalary::"+
					calculateNetSalary(ebo.getSalary()));
		}
		
	}
	private float calculateDA(float sal) {
		return (sal * 22.0f)/100.0f;
	}
	private float calculateHRA(float sal) {
		return (sal * 24.0f)/100.0f;
	}
	private float calculateGrossSalary(float sal) {
		return sal + calculateDA(sal)+ calculateHRA(sal);
	}
	private float calculatePF(float sal) {
		return (calculateGrossSalary(sal)*10.0f)/100.0f;
	}
	private float calculateNetSalary(float sal) {
		return calculateGrossSalary(sal)-calculatePF(sal);
	}
}
