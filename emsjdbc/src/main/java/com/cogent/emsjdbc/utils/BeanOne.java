package com.cogent.emsjdbc.utils;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanOne {
	BeanTwo beanTwo;
	
	 public BeanOne(BeanTwo beanTwo) {
	      System.out.println("BeanOne Initialized");
	   }

	   public void doSomthing() {
	      beanTwo.doSomthing();
		   System.out.println("Inside doSomthing() method of BeanOne");
	   }

}
