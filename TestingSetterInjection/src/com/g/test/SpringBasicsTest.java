package com.g.test;

import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.g.beans.WelcomeGreetings;

public class SpringBasicsTest {
	public static void main(String[] args) {
		FileSystemResource res = new FileSystemResource("src/com/g/cfgs/applicationContext.xml");
		
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		Date d=(Date)factory.getBean("dt");
		
		System.out.println("d obj data::"+d);
		System.out.println("------------------");
		WelcomeGreetings greetings = (WelcomeGreetings)factory.getBean("wmg");
		System.out.println("message::"+greetings.welcome("Bala"));
	}

}
