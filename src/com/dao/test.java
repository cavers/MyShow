package com.dao;

import java.util.List;

import com.model.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao ud=new UserDao();
		List<User> test1=ud.getAllUser();
		for(User u:test1){
			System.out.println(u);
		}
	}

}
