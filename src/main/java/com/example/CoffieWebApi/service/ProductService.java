package com.example.CoffieWebApi.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CoffieWebApi.model.Products;
import com.example.CoffieWebApi.model.ViewOrder;

public interface ProductService{

	List<Products> findAllProducts();
	
	
	String orderProduct(ViewOrder data);
}
