package com.canteloupe.repository;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.canteloupe.model.Cocktail;
import com.canteloupe.web.HBSessionFactory;

public class CocktailHibernate {

@SuppressWarnings("unchecked")
List<Cocktail> getAllUsers(){
		
		List<Cocktail> us = null;
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

	public Cocktail getCocktailById(int id) {
		
		Cocktail cs = null;
		Transaction tx = null;
		Session ss = null;
		
		try
		{
			ss = HBSessionFactory.getSession();
			tx = ss.beginTransaction();
			
			cs = (Cocktail) ss.createQuery("FROM cocktailtable where id = :id").getResultList();
			tx.commit();
		}
		catch(HibernateException h) {
			h.printStackTrace();
		}
		finally {
			ss.close();
		}
		return cs;
	}
}
