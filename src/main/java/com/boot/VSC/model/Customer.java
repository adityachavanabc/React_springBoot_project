package com.boot.VSC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int custId;
	private String custName;
	private String custVehicle;
	private String custPhone;
	private int custCredit;
	private int userId;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(int custId, String custName, String custVehicle, String custPhone, int custCredit, int userId) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custVehicle = custVehicle;
		this.custPhone = custPhone;
		this.custCredit = custCredit;
		this.userId = userId;
	}

	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public String getCustVehicle() {
		return custVehicle;
	}


	public void setCustVehicle(String custAddress) {
		this.custVehicle = custAddress;
	}


	public String getCustPhone() {
		return custPhone;
	}


	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}


	public int getCustCredit() {
		return custCredit;
	}


	public void setCustCredit(int custCredit) {
		this.custCredit = custCredit;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custVehicle=" + custVehicle + ", custPhone="
				+ custPhone + ", custCredit=" + custCredit + ", userId=" + userId + "]";
	}
	
	
	
}
