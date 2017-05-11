package com.dao;

import java.util.List;

import com.model.user;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userDao ud=new userDao();
		List<user> test1=ud.getAllUser();
		for(user u:test1){
			System.out.println(u);
		}
	}

}
