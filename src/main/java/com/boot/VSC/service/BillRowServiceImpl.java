package com.boot.VSC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.VSC.model.BillRow;
import com.boot.VSC.repositories.BillRowRepo;

@Service
public class BillRowServiceImpl implements BillRowService {

	@Autowired
	BillRowRepo billRowRepo;
	
	
	@Override
	public BillRow addBillRow(BillRow bilRow) {
		BillRow billRow = billRowRepo.save(bilRow);
		return billRow;
	}

	@Override
	public BillRow updateBillRow(BillRow billRow, Integer billRowId) {
		billRow.setBillRow(billRowId);
		billRowRepo.save(billRow);
		return billRow;
	}

	@Override
	public BillRow getBillRowById(Integer billRowId) {
		return billRowRepo.findById(billRowId).get();	
		}

	@Override
	public List<BillRow> getAllBillRows() {
		List<BillRow> billRows = (List<BillRow>) billRowRepo.findAll();
		return billRows;
	}

	@Override
	public void deleteBillRow(Integer billRowId) {
		billRowRepo.deleteById(billRowId);
		
	}

	@Override
	public void addBillRows(List<BillRow> billRows) {
		billRowRepo.saveAll(billRows);
	}

}
