package com.example.CoffieWebApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CoffieWebApi.model.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {

	
//	getAll Product 
}
