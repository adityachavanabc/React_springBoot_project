package com.boot.VSC.model.ui;

import java.sql.Date;
import java.util.List;

import com.boot.VSC.model.BillRow;

public class BillUI {

	private int billId;
	private int custId;
	private Date date;
	private double total;
	private int userId;

	private List<BillRow> billRows;

	
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

	public List<BillRow> getBillRows() {
		return billRows;
	}

	public void setBillRows(List<BillRow> billRows) {
		this.billRows = billRows;
	}
	
	

}
