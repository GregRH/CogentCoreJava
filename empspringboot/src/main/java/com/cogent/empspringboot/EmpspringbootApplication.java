package com.cogent.empspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmpspringbootApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(EmpspringbootApplication.class, args);
//		EmployeeService service = applicationContext.getBean(EmployeeService.class);
//		Employee emp = new Employee("a001", "a", "a", new Date(), new Date(), 10.0f);
//		Employee emp2 = new Employee("a002", "b", "a", new Date(), new Date(), 10.0f);
//		Employee emp3 = new Employee("a003", "c", "a", new Date(), new Date(), 10.0f);
//		service.addEmployee(emp);
//		service.addEmployee(emp2);
//		service.addEmployee(emp3);
		//StudentRepository rep = applicationContext.getBean(StudentRepository.class);
		//Student s1 = new Student(100l, "Brad", new Address(1002l,"First st", "City", "State", "Us"));
		//rep.save(s1);
		//rep.findAll().stream().forEach(System.out::println);
	
	}

}
