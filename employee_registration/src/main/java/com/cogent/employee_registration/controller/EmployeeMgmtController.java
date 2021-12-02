package com.cogent.employee_registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cogent.employee_registration.dto.EmployeeDTO;
import com.cogent.employee_registration.service.EmployeeMgmtService;
import com.cogent.employee_registration.vo.EmployeeVO;

@Controller
public class EmployeeMgmtController {
	@Autowired
	private EmployeeMgmtService service;
	
	public String processEmployee(EmployeeVO evo) throws Exception{
		String result;
		EmployeeDTO dto = new EmployeeDTO();
		dto.setName(evo.getName());
		dto.setAddress(evo.getAddress());
		dto.setDept(evo.getDept());
		dto.setSalary(Float.parseFloat(evo.getSalary()));
		result = service.calculate(dto);
		return result;
	}
	
}
