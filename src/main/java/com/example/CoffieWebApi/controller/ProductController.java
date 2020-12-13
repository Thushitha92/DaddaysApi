package com.example.CoffieWebApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CoffieWebApi.model.Products;
import com.example.CoffieWebApi.model.ViewOrder;
import com.example.CoffieWebApi.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	
	@GetMapping("view")
	public List<Products> allProducts() {
		
		return productservice.findAllProducts();
	}

	@PostMapping("add")
	public String orderProduct(@RequestBody ViewOrder data) {
		
		return productservice.orderProduct(data);
		 
	}
	
	
	
}
