package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Product;

public class SaveObjectTest {
	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		Product prod = null;
		Transaction tx =null;
		boolean flag=false;
		Integer idval=0;
		
		cfg=new Configuration();
		System.out.println(cfg.getProperties());
		System.out.println("....................");
		cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
		System.out.println(cfg.getProperties());
		
		factory=cfg.buildSessionFactory();
		System.out.println("session factory opbject class name::"+factory.getClass());
		
		ses=factory.openSession();
		System.out.println("session object class name::"+ses.getClass());
		
		prod = new Product();
		
		prod.setPname("chair");
		prod.setPrice(900000.0f);prod.setQty(9.0f);
		
		try {
			tx=ses.beginTransaction();
			System.out.println("tx object class name::"+tx.getClass());
			
			idval=(Integer)ses.save(prod);
			System.out.println("Generated id value::"+idval);
			flag=true;
			 System.out.println("id value::"+prod.getPid());
		}catch(HibernateException he) {
			he.printStackTrace();
			flag=false;
		}
		finally {
			if(flag==true) {
				tx.commit();
			}
			else {
				tx.rollback();
				System.out.println("object is not saved");
			}
			ses.close();
			factory.close();
		}
	}
}
