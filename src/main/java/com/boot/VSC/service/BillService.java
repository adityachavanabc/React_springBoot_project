package com.boot.VSC.service;

import java.util.List;

import com.boot.VSC.model.Bill;

public interface BillService {


	Bill addBill(Bill bill);

	Bill updateBill(Bill bill, Integer billId);

	Bill getBillById(Integer billId);

	List<Bill> getAllBills();

	void deleteBill(Integer billId);
}
