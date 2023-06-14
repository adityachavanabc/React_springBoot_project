package com.boot.VSC.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bill {

	private int billId;
	private int custId;
	private Date date;
	private double total;
	private int userId;
	
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(int billId, int custId, Date date, double total, int userId) {
		super();
		this.billId = billId;
		this.custId = custId;
		this.date = date;
		this.total = total;
		this.userId = userId;
	}

	@Id
	@GeneratedValue
	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", custId=" + custId + ", date=" + date + ", total=" + total + ", userId="
				+ userId + "]";
	}
	
	
	
}
