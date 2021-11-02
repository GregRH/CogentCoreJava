package com.cogent.deptemployee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.deptemployee.dto.Department;
import com.cogent.deptemployee.dto.Employee;
import com.cogent.deptemployee.repository.DepartmentRepository;
import com.cogent.deptemployee.service.DepartmentService;
import com.cogent.deptemployee.service.EmployeeService;

@SpringBootApplication
public class DeptemployeeApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(DeptemployeeApplication.class, args);
		
		DepartmentService da = ac.getBean(DepartmentService.class);
		EmployeeService es = ac.getBean(EmployeeService.class);
		Department d1 = new Department();
		Employee e1 = new Employee();
		Employee e2= new Employee();
		Employee e3 = new Employee();
		e1.setEmpCode("emp1");
		e1.setEmpName("Jordan");
		e1.setSalary(1000);
		e2.setEmpCode("emp2");
		e2.setEmpName("Jeff");
		e2.setSalary(1000);
		e3.setEmpCode("emp3");
		e3.setEmpName("James");
		e3.setSalary(1000);
//		e3.setDept(d1);
//		e2.setDept(d1);
//		e1.setDept(d1);
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e3);
		empList.add(e2);
		empList.add(e1);
		d1.setDeptCode("d1");
		d1.setName("Dept1");
		d1.setCity("Johannesburg");
		d1.setEmpList(empList);
		da.insert(d1);
		//es.getEmployees().stream().forEach(System.out::println);
		empList=es.getEmployees();
		System.out.println(empList.get(1).getDept().getCity());
		
	}

}
