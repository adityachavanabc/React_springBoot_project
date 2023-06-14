package com.boot.VSC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.VSC.model.Bill;

public interface BillRepo extends JpaRepository<Bill, Integer> {

}
