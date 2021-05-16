package com.shoes.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoes.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	

	public List<Product> findByCategory(String category);

}
