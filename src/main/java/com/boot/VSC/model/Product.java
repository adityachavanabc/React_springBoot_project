package com.boot.VSC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {


	@Id
	@GeneratedValue
	private int prodId;
	private String prodName;
	private int quantity;
	private int purPrice;
	private int selPrice;
	private int userId;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(int prodId, String prodName, int quantity, int purPrice, int selPrice, int userId) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.quantity = quantity;
		this.purPrice = purPrice;
		this.selPrice = selPrice;
		this.userId = userId;
	}

	public int getProdId() {
		return prodId;
	}


	public void setProdId(int prodId) {
		this.prodId = prodId;
	}


	public String getProdName() {
		return prodName;
	}


	public void setProdName(String prodName) {
		this.prodName = prodName;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getPurPrice() {
		return purPrice;
	}


	public void setPurPrice(int purPrice) {
		this.purPrice = purPrice;
	}


	public int getSelPrice() {
		return selPrice;
	}


	public void setSelPrice(int selPrice) {
		this.selPrice = selPrice;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", quantity=" + quantity + ", purPrice="
				+ purPrice + ", selPrice=" + selPrice + ", userId=" + userId + "]";
	}
	
	
}
