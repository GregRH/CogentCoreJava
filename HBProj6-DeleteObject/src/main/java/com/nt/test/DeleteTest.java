package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Project;
import com.nt.utility.HibernateUtil;

public class DeleteTest {
	public static void main(String[] args) {
		Session ses = null;
		Project prj = null;
		Transaction tx=null;
		boolean flag=false;
		ses=HibernateUtil.getSession();
		try {
			tx=ses.beginTransaction();
			prj = ses.get(Project.class, 1);
			if(prj!=null) {
				ses.delete(prj);;
			
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
