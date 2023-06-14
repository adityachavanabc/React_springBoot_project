package com.boot.VSC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BillRow {

	private int billRow;
	private int billId;
	private int prodId;
	private int quantity;
	private int sppp;
	
	
	public BillRow() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BillRow(int billRow, int billId, int prodId, int quantity, int sppp) {
		super();
		this.billRow = billRow;
		this.billId = billId;
		this.prodId = prodId;
		this.quantity = quantity;
		this.sppp = sppp;
	}

	@Id
	@GeneratedValue
	public int getBillRow() {
		return billRow;
	}


	public void setBillRow(int billRow) {
		this.billRow = billRow;
	}


	public int getBillId() {
		return billId;
	}


	public void setBillId(int billId) {
		this.billId = billId;
	}


	public int getProdId() {
		return prodId;
	}


	public void setProdId(int prodId) {
		this.prodId = prodId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getSppp() {
		return sppp;
	}


	public void setSppp(int sppp) {
		this.sppp = sppp;
	}


	@Override
	public String toString() {
		return "BillRow [billRow=" + billRow + ", billId=" + billId + ", prodId=" + prodId + ", quantity=" + quantity
				+ ", sppp=" + sppp + "]";
	}
	
	
	
	
}
