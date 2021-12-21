package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.BankAccount;
import com.nt.utility.HibernateUtil;

public class UpdateObjectTest1 {
	public static void main(String[] args) {
		Session ses = null;
		BankAccount account=null;
		Transaction tx=null;
		boolean flag=false;
		ses=HibernateUtil.getSession();
		try {
			tx=ses.beginTransaction();
			account = ses.get(BankAccount.class, 1001L);
			if(account!=null) {
			account.setBalance(410000);
			ses.update(account);
			flag=true;}
			else {
				System.out.println("recordnotfound");
				return;
			}
		}catch(HibernateException he) {
			flag=false;
			he.printStackTrace();
		}finally {
			if(flag) {
				tx.commit();
				System.out.println("Object updates");
			}else {
				tx.rollback();
				System.out.println("object not updated");
			}
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}
	}
}
