package com.boot.VSC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.VSC.model.Bill;
import com.boot.VSC.repositories.BillRepo;

@Service
public class BillServiceImpl implements BillService {

	@Autowired
	BillRepo billRepo;
	
	@Override
	public Bill addBill(Bill bil) {
		Bill bill = billRepo.save(bil);
		return bill;
	}

	@Override
	public Bill updateBill(Bill bill, Integer billId) {
		bill.setBillId(billId);
		billRepo.save(bill);
		return bill;
	}

	@Override
	public Bill getBillById(Integer billId) {
		return billRepo.findById(billId).get();
	}

	@Override
	public List<Bill> getAllBills() {
		List<Bill> bills = (List<Bill>) billRepo.findAll();
		return bills;
	}

	@Override
	public void deleteBill(Integer billId) {
		billRepo.deleteById(billId);
		
	}

}
