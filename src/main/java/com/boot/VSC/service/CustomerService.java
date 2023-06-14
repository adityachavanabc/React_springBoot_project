package com.boot.VSC.service;

import java.util.List;

import com.boot.VSC.model.Customer;

public interface CustomerService {

	Customer createCustomer (Customer customer);
	
	Customer updateCustomer (Customer customer, Integer custId);
	
	Customer getCustomerById (Integer custId);
	
	List<Customer> getAllCustomers ();
	
	void deleteCustomer (Integer custId);

	void takePayment(int id, int amount);

	int getTotalCredit();

}
