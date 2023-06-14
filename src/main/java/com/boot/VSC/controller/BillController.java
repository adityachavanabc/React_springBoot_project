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

import com.boot.VSC.model.Bill;
import com.boot.VSC.model.BillRow;
import com.boot.VSC.model.ui.BillUI;
import com.boot.VSC.service.BillRowService;
import com.boot.VSC.service.BillService;

@RestController
@CrossOrigin(origins = "*")
public class BillController {

	@Autowired
	BillService billService;
	
	@Autowired
	BillRowService billRowService;

	@PostMapping("/bill")
	public void addBill(@RequestBody BillUI billUi){
		
		Bill bill = new Bill();

		bill.setCustId(billUi.getCustId());
		
		  long millis=System.currentTimeMillis();  
	        java.sql.Date date=new java.sql.Date(millis);  
	        
		bill.setDate(date);
		bill.setTotal(billUi.getTotal());
		bill.setUserId(billUi.getUserId());
		
	 bill = billService.addBill(bill);
	 double total = 0;
	 for (BillRow row : billUi.getBillRows()) {
		 row.setBillId(bill.getBillId());
		 total = total + (row.getQuantity() * row.getSppp());
	 }
	 
	 billRowService.addBillRows(billUi.getBillRows());
	}
	
	@GetMapping("/bill")
	public List<Bill> getBills() {
		return billService.getAllBills();
	}
	
	@GetMapping("/bill/{id}")
	public Bill getBill(@PathVariable int id){
		return billService.getBillById(id);
	}
	
	@PutMapping("/bill/{id}")
	public Bill updateBill(@RequestBody Bill bill, @PathVariable int id) {
		return billService.updateBill(bill, id);
	}
	
	@DeleteMapping("/bill/{id}")
	public void deleteBill(@PathVariable int id) {
		billService.deleteBill(id);
	}

}
