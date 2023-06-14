package com.boot.VSC.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {


	@Id
	@GeneratedValue
	private int userId;
	private String firmName;
	private String userPhone;
	private String userName;
	private String password;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int userId, String firmName, String userPhone, String userName, String password) {
		super();
		this.userId = userId;
		this.firmName = firmName;
		this.userPhone = userPhone;
		this.userName = userName;
		this.password = password;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getFirmName() {
		return firmName;
	}


	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}


	public String getUserPhone() {
		return userPhone;
	}


	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	@Column(unique = true)
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


	@Override
	public String toString() {
		return "User [userId=" + userId + ", firmName=" + firmName + ", userPhone=" + userPhone + ", userName=" + userName
				+ ", password=" + password + "]";
	}
	
	
}

