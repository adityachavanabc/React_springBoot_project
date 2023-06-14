package com.boot.VSC.service;

import java.util.List;

import com.boot.VSC.model.BillRow;

public interface BillRowService {

	BillRow addBillRow(BillRow billRow);

	BillRow updateBillRow(BillRow billRow, Integer billRowId);

	BillRow getBillRowById(Integer billRowId);

	List<BillRow> getAllBillRows();

	void deleteBillRow(Integer billRowId);

	void addBillRows(List<BillRow> billRows);

}
