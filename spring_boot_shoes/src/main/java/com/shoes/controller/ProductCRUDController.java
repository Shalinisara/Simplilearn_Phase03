package com.shoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.shoes.model.Product;
import com.shoes.service.ProductCRUDService;

@RestController
public class ProductCRUDController {
	
	@Autowired
	private ProductCRUDService productcrudservice;

	@PostMapping("/product")
	public Product createProduct(@RequestBody Product product) {
		// TODO Auto-generated method stub
		return productcrudservice.createProduct(product);
	}

	@PutMapping("/product")
	public Product updateProduct (@RequestBody Product product) {
		// TODO Auto-generated method stub
		return productcrudservice.updateProduct(product);
	}

	@GetMapping("/product")
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productcrudservice.getAllProducts();
	}

	@GetMapping("/product/category/{category}")
	public List<Product> getProductsByCategory(@PathVariable String category) {
		// TODO Auto-generated method stub
		return productcrudservice.getProductsByCategory(category);
	}
	
	@DeleteMapping("/product/prod/{prodid}")
	public void deleteProduct(@PathVariable int prodid) {
		productcrudservice.deleteProduct(prodid);
		
	}
	
	
}
