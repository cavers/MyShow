package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.User;

public class Test2 {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		List<User> u=(List<User>)session.createQuery("from users");
		System.out.println(u.get(0).getName());
	}
}
