package com.sgic.libraryspringmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.sgic.libraryspringmvc.entity.MainClassification;
import com.sgic.libraryspringmvc.util.HibernateUtil;

public class MainClassificationDAOImpl implements MainClassificationDAO{
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	public MainClassification saveMainClassification(MainClassification mainClass) {
		 hibernateTemplate.save(mainClass);
		 return null;
	}

	public List<MainClassification> viewMainClassification() {
		System.out.println(hibernateTemplate.loadAll(MainClassification.class));
		return hibernateTemplate.loadAll(MainClassification.class); 
	}
	
	public void updateMainClassification(MainClassification mainClass) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(mainClass);
		session.getTransaction().commit();
		session.close();
//		hibernateTemplate.update(mainClass);
	}
	public MainClassification getMainClassificationById(Long mainClassId) {
		System.out.println("MainClassification Id: " + mainClassId);
		return hibernateTemplate.get(MainClassification.class, mainClassId);
	}
	
	public MainClassification deleteMainClassification(Long mainClassId) {
//		hibernateTemplate.delete(hibernateTemplate.get(MainClassification.class,mainClassId));
//		System.out.println(mainClassId +" sucessfully deleted");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(hibernateTemplate.get(MainClassification.class,mainClassId));
		session.getTransaction().commit();
		session.close();
		return null;
	}

}
