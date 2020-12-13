package com.example.CoffieWebApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CoffieWebApi.model.Products;
import com.example.CoffieWebApi.model.ViewOrder;
import com.example.CoffieWebApi.repository.OrderRepository;
import com.example.CoffieWebApi.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productrepository;
	@Autowired
	private OrderRepository orderrepository;

	@Override
	public List<Products> findAllProducts() {
		List<Products> allproduct = productrepository.findAll();
		return allproduct;
	}


	@Override
	public String orderProduct(ViewOrder data) {
			orderrepository.save(data);
		return "Order  save Success";
	}


}
