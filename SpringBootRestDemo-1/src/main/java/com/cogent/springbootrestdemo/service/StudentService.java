package com.cogent.springbootrestdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springbootrestdemo.model.Student;
import com.cogent.springbootrestdemo.model.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	public List<Student> retrieveDetails(){
		return studentRepository.findAll();
	}
}
