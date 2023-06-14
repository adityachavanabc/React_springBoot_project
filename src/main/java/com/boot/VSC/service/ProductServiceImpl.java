package com.boot.VSC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.VSC.model.Customer;
import com.boot.VSC.model.Product;
import com.boot.VSC.repositories.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;
	
	@Override
	public Product createProduct(Product prod) {
		Product product = productRepo.save(prod);
		return product;
	}

	@Override
	public Product updateProduct(Product product, Integer prodId) {
		product.setProdId(prodId);
		productRepo.save(product);
		return product;
	}

	@Override
	public Product getProductById(Integer custId) {
		Product product = productRepo.findById(custId).get();
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = (List<Product>)productRepo.findAll();
		return products;
	}

	@Override
	public void deleteProduct(Integer prodId) {
		productRepo.deleteById(prodId);
		
	}

	@Override
	public void updateQty(int id, int qty) {
		Product p = productRepo.findById(id).get();
		if (p == null) {
			return;
		}
		int remaining = p.getQuantity() - qty;
		p.setQuantity(remaining);
		productRepo.save(p);
		
	}

	@Override
	public void updateQtyAdd(int id, int qty) {
		Product p = productRepo.findById(id).get();
		if (p == null) {
			return;
		}
		int remaining = p.getQuantity() + qty;
		p.setQuantity(remaining);
		productRepo.save(p);
		
	}



}
