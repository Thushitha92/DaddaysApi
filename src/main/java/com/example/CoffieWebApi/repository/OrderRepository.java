package com.example.CoffieWebApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CoffieWebApi.model.Products;
import com.example.CoffieWebApi.model.ViewOrder;

public interface OrderRepository extends JpaRepository<ViewOrder, Integer> {

	
//	getAll Product 
}
