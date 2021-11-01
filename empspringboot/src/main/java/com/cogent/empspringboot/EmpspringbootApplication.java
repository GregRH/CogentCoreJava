package com.cogent.empspringboot;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.empspringboot.dto.Answer;
import com.cogent.empspringboot.dto.Question;
import com.cogent.empspringboot.repository.QuestionRepository;

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
		QuestionRepository session = applicationContext.getBean(QuestionRepository.class);
		Answer ans1=new Answer();    
	    ans1.setAnswername("Java is a programming language");    
	    ans1.setPostedBy("Ravi Malik");    
	        
	    Answer ans2=new Answer();    
	    ans2.setAnswername("Java is a platform independents");    
	    ans2.setPostedBy("Sudhir Kumar");    
	        
	    Answer ans3=new Answer();    
	    ans3.setAnswername("Servlet is an Interface");    
	    ans3.setPostedBy("Jai Kumar");  
	    
	    
	    Answer ans5=new Answer();    
	    ans5.setAnswername("Servlet is an Interface and new interface");    
	    ans5.setPostedBy("Jai Kumar");  
	        
	    Answer ans4=new Answer();    
	    ans4.setAnswername("Servlet is an API");    
	    ans4.setPostedBy("Arun");    
	        
	    ArrayList<Answer> list1=new ArrayList<Answer>();    
	    list1.add(ans1);    
	    list1.add(ans2);    
	        
	    ArrayList<Answer> list2=new ArrayList<Answer>();    
	    list2.add(ans3);    
	    list2.add(ans4);    
	        //Questions-What is java
	    //Question-what is servlets
	    
	    Question question1=new Question();    
	    question1.setQname("What is Java?");    
	    question1.setAnswers(list1);    
	        
	    Question question2=new Question();    
	    question2.setQname("What is Servlet?");    
	    question2.setAnswers(list2);    
	        
	    session.save(question1);    
	    session.save(question2);   
	    session.save(ans5);
		
	}

}
