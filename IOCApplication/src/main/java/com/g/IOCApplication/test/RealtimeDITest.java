package com.g.IOCApplication.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.g.IOCApplication.controller.MainController;
import com.g.IOCApplication.vo.CustomerVO;

public class RealtimeDITest {
	public static void main(String[] args) {
		Scanner sc = null;
		String name = null, cadd=null,pamt=null,rate=null,time=null;
		CustomerVO vo = null;
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader=null;
		MainController controller=null;
		String result=null;
		sc=new Scanner(System.in);
		System.out.println("Enter customername:: ");
		name=sc.next();
		System.out.println("Enter customeraddress:: ");
		cadd=sc.next();
		System.out.println("Enter principle amount");
		pamt=sc.next();
		System.out.println("Enter rate of interest");
		rate=sc.next();
		System.out.println("Enter time:: ");
		time=sc.next();
		vo = new CustomerVO();
		vo.setCname(name);
		vo.setCadd(cadd);
		vo.setpAmt(pamt);
		vo.setRate(rate);
		vo.setTime(time);
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/g/IOCApplication/cfgs/applicationContext.xml");
		controller=factory.getBean("controller",MainController.class);
		try {
			result= controller.processCustomer(vo);
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("internal problem");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
