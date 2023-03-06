package com.javabrains.userinfoservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="user")
@Table(name="user")
public class User {
	
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column(name="user_name")
	private String userName;
	
	public User() {}
	
	public User(int userId, String userName)
	{
		this.userId=userId;
		this.userName=userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
