package com.canteloupe.repository;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.canteloupe.model.User;
import com.canteloupe.web.HBSessionFactory;

public class UserHibernate {

	List<User> getAllUsers(){
		
		List<User> us = null;
		Transaction tx = null;
		Session ss = null;
		
		try
		{
			ss = HBSessionFactory.getSession();
			tx = ss.beginTransaction();
			
			us = ss.createQuery("FROM usertable").getResultList();
			tx.commit();			
		}
		catch(HibernateException h) {
			tx.rollback();
			h.printStackTrace();
		}
		finally {
			ss.close();
		}
		return us;
	}
	
	public void register(User user) {
		
		Transaction tx = null;
		Session ss = null;
		
		try
		{
			ss = HBSessionFactory.getSession();
			tx = ss.beginTransaction();
			
			ss.save(user);
			tx.commit();			
		}
		catch(HibernateException h) {
			tx.rollback();
			h.printStackTrace();
		}
		finally {
			ss.close();
		}
	}
	
	public void unregister(User user) {
		
		Transaction tx = null;
		Session ss = null;
		
		try
		{
			ss = HBSessionFactory.getSession();
			tx = ss.beginTransaction();
			
			ss.delete(user);
			tx.commit();
		}
		catch(HibernateException h) {
			tx.rollback();
			h.printStackTrace();
		}
		finally {
			ss.close();
		}
	}
	
	//Not good.
	public boolean login(String username, String password) {
		
		Transaction tx = null;
		Session ss = null;
		
		try
		{
			
			ss = HBSessionFactory.getSession();
			tx = ss.beginTransaction();
			
			if(username != null && password != null &&
					username != "" && password != "") {
				boolean num = ss.createNativeQuery("SELECT * from usertable where username = ? "
						+ "and password = ?").equals(1);
				if(num == true) {
					return true;
				}
			}
			tx.commit();
		}
		catch(HibernateException h) {
			tx.rollback();
			h.printStackTrace();
		}
		return false;
	}
}
