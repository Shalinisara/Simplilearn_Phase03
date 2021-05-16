package com.shoes.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@ToString
@NoArgsConstructor

public class Product {
	@Id
	private int id;
	
	private String prodname;
	
	private String category;
	
	private int price; 
	
//	@ManyToMany(mappedBy = "products", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
//	private Set<XOrder> xorders = new HashSet<>();

}
