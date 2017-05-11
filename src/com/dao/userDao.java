package com.dao;

import java.util.List;

import org.hibernate.Session;

import com.hibernate.hib_cavers;
import com.model.user;

public class userDao {
	Session session=hib_cavers.openSession();
	//查询所有的用户信息
	public List<user> getAllUser(){
		System.out.println("asd");
		return (List<user>) session.createQuery("from users").list();
	}
	
}
