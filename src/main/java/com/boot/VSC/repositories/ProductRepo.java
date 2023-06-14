package com.boot.VSC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.VSC.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
