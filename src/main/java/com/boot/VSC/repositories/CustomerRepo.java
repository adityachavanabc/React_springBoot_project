package com.boot.VSC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.boot.VSC.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	@Query(value ="SELECT SUM(custCredit) FROM Customer")
	public int sumOfCredit();



}
