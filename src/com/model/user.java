package com.model;

import java.io.Serializable;

public class user implements Serializable {
	private Integer id;
	private String userName;
	private String password;
	private String name;
	private String sex;
	private String phone;
	private String qq;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public user(Integer id, String userName, String password, String name,
			String sex, String phone, String qq) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.qq = qq;
	}
	public user() {
		super();
	}
}
