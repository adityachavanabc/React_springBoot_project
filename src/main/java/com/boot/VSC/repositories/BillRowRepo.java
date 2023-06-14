package com.boot.VSC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.VSC.model.BillRow;

public interface BillRowRepo extends JpaRepository<BillRow, Integer> {

}
