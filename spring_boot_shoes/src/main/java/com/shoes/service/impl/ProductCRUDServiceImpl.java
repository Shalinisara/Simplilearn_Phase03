package com.shoes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoes.model.Product;
import com.shoes.repository.ProductRepository;
import com.shoes.service.ProductCRUDService;

@Service
public class ProductCRUDServiceImpl implements ProductCRUDService {
	
	@Autowired
	private ProductRepository prodrepo;

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return prodrepo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return prodrepo.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return prodrepo.findAll();
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return prodrepo.findByCategory(category);
	}

	@Override
	public void deleteProduct(int prodid) {
		// TODO Auto-generated method stub
		prodrepo.deleteById(prodid);
		
	}

}
