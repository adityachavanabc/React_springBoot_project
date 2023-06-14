package com.boot.VSC.service;

import java.util.List;

import com.boot.VSC.model.Product;

public interface ProductService {

	Product createProduct(Product product);

	Product updateProduct(Product product, Integer prodId);

	Product getProductById(Integer custId);

	List<Product> getAllProducts();

	void deleteProduct(Integer prodId);

	void updateQty(int id, int qty);

	void updateQtyAdd(int id, int qty);

}
