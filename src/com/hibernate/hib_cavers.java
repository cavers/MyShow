package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hib_cavers {
	private static Configuration configuration;
	private static SessionFactory factory;
	
	static{
		configuration=new Configuration().configure("hibernate.cfg.xml");
	}
	public static SessionFactory getFactory(){
		if(factory==null){
			factory=configuration.buildSessionFactory();
		}
		return factory;
	}
	//openSession
	public static Session openSession(){
		return getFactory().openSession();
	}
	//currentSession
	public static Session currentSession(){
		return getFactory().getCurrentSession();
	}
}
