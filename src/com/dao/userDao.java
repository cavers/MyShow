package com.dao;

import java.util.List;

import org.hibernate.Session;

import com.hibernate.Hib_cavers;
import com.model.User;

public class UserDao {
	Session session=Hib_cavers.openSession();
	//查询所有的用户信息
	public List<User> getAllUser(){
		System.out.println("asd");
		return (List<User>) session.createQuery("from users").list();
	}
	
}
