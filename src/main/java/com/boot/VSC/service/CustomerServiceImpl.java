package com.boot.VSC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.VSC.model.Customer;
import com.boot.VSC.repositories.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public Customer createCustomer(Customer cust) {
		Customer customer = customerRepo.save(cust);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer, Integer custId) {
		customer.setCustId(custId);
		customerRepo.save(customer);
		return customer;
	}

	@Override
	public Customer getCustomerById(Integer custId) {
		return customerRepo.findById(custId).get();
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customers = (List<Customer>)customerRepo.findAll();
		return customers;
	}

	@Override
	public void deleteCustomer(Integer custId) {
		customerRepo.deleteById(custId);
		
	}

	@Override
	public void takePayment(int id, int amount) {
		Customer c = customerRepo.findById(id).get();
		if (c == null) {
			return;
		}
		int remaining = c.getCustCredit() - amount;
		c.setCustCredit(remaining);
		customerRepo.save(c);
	}

	@Override
	public int getTotalCredit() {
		return customerRepo.sumOfCredit();
	}


}
