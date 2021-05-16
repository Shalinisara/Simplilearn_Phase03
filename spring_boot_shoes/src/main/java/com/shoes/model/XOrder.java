package com.shoes.model;



import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.NoArgsConstructor;



@Entity
@Table
@NoArgsConstructor
public class XOrder {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
//	@CreationTimestamp
//	private LocalDateTime datecreated;
	
	//private String category;
	private String category;
	private int prodid;
	private int quantity;
	private int amount;
	
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate datecreated;
	
	@ManyToOne
	@JoinColumn(name ="user_id", insertable=false,updatable=false)
//	@Column(insertable=false, updatable=false)
	private User user;
	
	
	


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getProdid() {
		return prodid;
	}


	public void setProdid(int prodid) {
		this.prodid = prodid;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}

	
	

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public XOrder(String category, int prodid, int quantity, int amount, LocalDate datecreated, User user) {
		super();
		this.category = category;
		this.prodid = prodid;
		this.quantity = quantity;
		this.amount = amount;
		this.datecreated = datecreated;
		this.user = user;
	}


	public LocalDate getDatecreated() {
		return datecreated;
	}


	public void setDatecreated(LocalDate datecreated) {
		this.datecreated = datecreated;
	}


	
	

	//List<Product> products = new ArrayList<>();
	

}

