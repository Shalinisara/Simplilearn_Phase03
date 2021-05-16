package com.shoes.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	
	@OneToMany( mappedBy = "user" ,cascade = CascadeType.ALL)
//	@OneToMany( cascade = CascadeType.ALL)
	
	
	private List<XOrder> xOrders = new ArrayList<>();

	

//	public List<XOrder> getxOrders() {
//		return xOrders;
//	}
//
//	public void setxOrders(List<XOrder> xOrders) {
//		this.xOrders = xOrders;
	}
	
	

	
	
	
//	public void setOrders(List<XOrder> xOrders) {
//		this.orders = xOrders;
//	}

//	public void addOrder(XOrder xOrder ) {
//		this.xOrders.add(xOrder);
//	}
//	
//	public void removeOrder(XOrder xOrder ) {
//		this.xOrders.remove(xOrder);
//	}
	

