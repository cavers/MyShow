package com.dao;

import java.util.List;

import org.hibernate.Session;

import com.hibernate.HibernateSessionFactory;
import com.model.User;

public class UserDao {
	Session session=HibernateSessionFactory.openSession();
	//查询所有的用户信息
	public List<User> getAllUser(){
		System.out.println("asd");
		return (List<User>) session.createQuery("from users").list();
	}
	
}
