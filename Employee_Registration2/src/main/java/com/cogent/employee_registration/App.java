package com.cogent.employee_registration;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.employee_registration.controller.EmployeeMgmtController;
import com.cogent.employee_registration.service.EmployeeMgmtService;
import com.cogent.employee_registration.vo.EmployeeVO;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = SpringApplication.run(App.class, args);
    	EmployeeMgmtController emc = applicationContext.getBean(EmployeeMgmtController.class);
    	Scanner sc = new Scanner(System.in);
    	String name=null,addrs=null,dept=null,salary=null,result=null;
    	EmployeeVO evo = new EmployeeVO();
    	System.out.println("Enter EmployeeName");
    	name=sc.next();
    	System.out.println("Enter EmployeeAddress");
    	addrs=sc.next();
    	System.out.println("Enter EmployeeDepartment");
    	dept=sc.next();
    	System.out.println("Enter EmployeeSalary");
    	salary=sc.next();
    	
    	evo.setName(name);
    	evo.setAddress(addrs);
    	evo.setDept(dept);
    	evo.setSalary(salary);
    	try {
    		result = emc.processEmployee(evo);
    		System.out.println(result);
    	}catch (Exception e) {
    		System.out.println(result);
    		e.printStackTrace();
    	}
    }
}
