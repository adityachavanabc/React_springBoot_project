package com.boot.VSC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.VSC.model.Customer;
import com.boot.VSC.service.CustomerService;
import com.boot.VSC.utills.UserUtil;

@RestController
@CrossOrigin(origins = "*")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer customer) {
		customer.setUserId(UserUtil.getLoggedInUserId());
	return customerService.createCustomer(customer);
	}
	
	@GetMapping("/customer")
	public List<Customer> getCustomers() {
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable int id){
		return customerService.getCustomerById(id);
	}
	
	@PutMapping("/customer/{id}")
	public Customer updaCustomer(@RequestBody Customer customer, @PathVariable int id) {
		return customerService.updateCustomer(customer, id);
	}
	
	@DeleteMapping("/customer/{id}")
	public void deleteCustomer(@PathVariable int id) {
	   customerService.deleteCustomer(id);
	}
	
	@PutMapping("/customer/takepayment/{id}/{amount}")
	public void takePayment(@PathVariable int id, @PathVariable int amount) {
		customerService.takePayment(id, amount);
	}
	
	@GetMapping("/customer/totalCredit")
	public int getTtlCredit(){
		return customerService.getTotalCredit();
	}
	
}
