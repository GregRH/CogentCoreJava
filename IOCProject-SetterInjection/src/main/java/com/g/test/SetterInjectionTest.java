package com.g.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.g.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemResource res = new FileSystemResource("src/main/java/com/g/cfgs/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		WishMessageGenerator generator = (WishMessageGenerator) factory.getBean("wmg");
		System.out.println("Result:: "+ generator.generateWishMessage("Greg"));
	}

}
