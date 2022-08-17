package com.cucumber.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.cucumber.demo.model.Product;

@Service
public class ProductService {
	
	public List<Product> getAllProducts(){
		
		List<Product> products = new ArrayList<Product>();
		
		products.add(new Product("22","Samsung Gelaxy","The best model now",400,"John Smith"));
		products.add(new Product("23","Iphone","The latest Model",500,"John Jackson"));
		return products;
	}
	
	
	public Product getProductById(String id) {
		Predicate<Product> byId = p->p.getId().equals(id);
		return filterProducts(byId);
	}


	private Product filterProducts(Predicate<Product> byId) {
		// TODO Auto-generated method stub
		return getAllProducts().stream().filter(byId).findFirst().orElse(null);
	}

}
