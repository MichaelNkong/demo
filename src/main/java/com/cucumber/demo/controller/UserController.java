package com.cucumber.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cucumber.demo.model.Product;
import com.cucumber.demo.service.ProductService;


@RestController
public class UserController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		
		return productService.getAllProducts();
		
	}

}
