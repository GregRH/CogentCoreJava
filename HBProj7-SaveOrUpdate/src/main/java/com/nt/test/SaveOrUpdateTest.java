package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Membership;
import com.nt.utility.HibernateUtil;

public class SaveOrUpdateTest {
public static void main(String[] args) {
	Session ses=null;
	Membership member=null;
	Transaction tx=null;
	boolean flag=false;
	
	ses = HibernateUtil.getSession();
	member=new Membership();
//	member.setMid(888888888888L);
	member.setName("G");
	member.setAddrs("NY");
	member.setRewardPoints(16L);
	try {
		tx=ses.beginTransaction();
		ses.saveOrUpdate(member);
		flag=true;
	}catch(HibernateException he) {
		flag=false;
		he.printStackTrace();
	}finally {
		if(flag) {
			tx.commit();
			System.out.println("Saved or updated");
		}else {
			tx.rollback();
			System.out.println("Not saved or updated");
		}
		HibernateUtil.closeSession(ses);
		HibernateUtil.closeSessionFactory();
	}
}
}
