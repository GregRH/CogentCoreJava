package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Product;
import com.nt.utility.HibernateUtil;

public class PersistanceObjectTest {
	public static void main(String[] args) {
		Session ses = null;
		Product prod=null;
		Transaction tx =null;
		boolean flag=false;
		int idval=0;
		ses=HibernateUtil.getSession();
		prod=new Product();
		prod.setPname("chair16");
		try {
			tx=ses.beginTransaction();
			System.out.println("tx objext class name::"+tx.getClass());
			ses.save(prod);
			flag=true;
		}catch(HibernateException he) {
			he.printStackTrace();
			flag=false;
		}finally {
			if(flag=true)
				tx.commit();
			else {
				tx.rollback();
			}
			HibernateUtil.closeSession(ses);
		}
	}
}
