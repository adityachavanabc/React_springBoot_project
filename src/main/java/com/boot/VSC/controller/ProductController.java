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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.VSC.model.Product;
import com.boot.VSC.service.ProductService;
import com.boot.VSC.utills.UserUtil;



@RestController
@CrossOrigin(origins = "*")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
	public Product createProduct(@RequestBody Product product) {
		product.setUserId(UserUtil.getLoggedInUserId());
		return productService.createProduct(product);
	}
	
	@GetMapping("/product/{id}")
	public Product getProduct(@RequestParam int id) {
		return productService.getProductById(id);
	}
	
	@GetMapping("/product")
	public List<Product> products(){
		return productService.getAllProducts();
	}
	
	@PutMapping("/product/{id}")
	public Product updateProduct (@RequestBody Product product, @PathVariable int id) {
		return productService.updateProduct(product, id);
	}
	
	@DeleteMapping("/product/{id}")
	public void deleteProduct (@PathVariable int id) {
      //  System.out.println(id + " is of type " + ((Object)id).getClass().getSimpleName());  
		productService.deleteProduct(id);
	}
	
	@PutMapping("/product/{id}/{qty}")
	public void updateQty(@PathVariable int id, @PathVariable int qty) {
		productService.updateQty(id, qty);
	}
	
	@PutMapping("/product/add/{id}/{qty}")
	public void updateQtyAdd(@PathVariable int id, @PathVariable int qty) {
		productService.updateQtyAdd(id, qty);
	}
}
