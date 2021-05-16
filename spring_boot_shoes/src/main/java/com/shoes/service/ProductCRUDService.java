package com.shoes.service;

import java.util.List;

import com.shoes.model.Product;

public interface ProductCRUDService {
	public Product createProduct(Product product);
	public Product updateProduct(Product product);
	public List<Product> getAllProducts();
	public List<Product> getProductsByCategory(String category);
	public void deleteProduct(int prodid);
}
