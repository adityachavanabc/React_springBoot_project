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

import com.boot.VSC.model.BillRow;
import com.boot.VSC.service.BillRowService;

@RestController
@CrossOrigin(origins = "*")
public class BillRowController {

	@Autowired
	BillRowService billRowService;
	
	@PostMapping("/billrow/add/{cid}")
	public void addBill(@RequestBody List<BillRow> billRows, @PathVariable("cid") int customerId) {
		billRowService.addBillRows(billRows);
	}

	@PostMapping("/billrow")
	public BillRow addBillRow(@RequestBody BillRow billRow){
	return billRowService.addBillRow(billRow);
	}
	
	@GetMapping("/billrow")
	public List<BillRow> getBillRows() {
		return billRowService.getAllBillRows();
	}
	
	@GetMapping("/billrow/{id}")
	public BillRow getBillRow(@PathVariable int id){
		return billRowService.getBillRowById(id);
	}
	
	@PutMapping("/billrow/{id}")
	public BillRow updateBillRow(@RequestBody BillRow billRow, @PathVariable int id) {
		return billRowService.updateBillRow(billRow, id);
	}
	
	@DeleteMapping("/billrow/{id}")
	public void deleteBillRow(@PathVariable int id) {
		billRowService.deleteBillRow(id);
	}

}
