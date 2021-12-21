package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.nt.entity.InsurancePolicy;
import com.nt.utility.HibernateUtil;

public class LoadObjectTest {
	public static void main(String[] args) {
		Session ses = null;
		InsurancePolicy policy=null;
		ses=HibernateUtil.getSession();
		try {
			policy=ses.get(InsurancePolicy.class, 9001L);
			if(policy==null)
				System.out.println("record not found");
		else {
			 System.out.println("record found and displayed");
			 System.out.println(policy);
		}
		}catch(HibernateException he) {
			he.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}
	}
}
