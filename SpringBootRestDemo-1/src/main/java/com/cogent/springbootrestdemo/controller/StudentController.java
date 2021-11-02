package com.cogent.springbootrestdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.springbootrestdemo.model.Student;
import com.cogent.springbootrestdemo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	@GetMapping("/retreive")
	public List<Student> getStudentDetails(){
		return studentService.retrieveDetails();
	}
}
