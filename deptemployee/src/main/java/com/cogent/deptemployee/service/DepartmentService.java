package com.cogent.deptemployee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.deptemployee.dto.Department;
import com.cogent.deptemployee.repository.DepartmentRepository;
@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository deptRep;
	public void insert(Department dept) {
		deptRep.save(dept);
	}
}
