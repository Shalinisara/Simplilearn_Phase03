package com.shoes.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoes.model.XOrder;
import com.shoes.service.XOrderAddService;


@RestController
public class XOrderController {
	
	
	
	@Autowired
	private XOrderAddService xorderservice;
	
	

	@PostMapping("/xorder")
	public XOrder createXOrder(@RequestBody XOrder xorder) {
		// TODO Auto-generated method stub
		System.out.println("In Order controller");
		return xorderservice.createXOrder(xorder);
	}



	@GetMapping("/xorder/category/{category}")
	public List<XOrder> getAllXOrdersByCategory(@PathVariable String category) {
		// TODO Auto-generated method stub
		System.out.println("Ctrler:" +category);
		return xorderservice.getAllXOrdersByCategory(category);
	}


	@GetMapping("/xorder/datecreated/{datecreated}")
	public List<XOrder> getAllXOrdersByDatecreated(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate datecreated) {
		System.out.println("controller: date" + datecreated);
		// TODO Auto-generated method stub
		return xorderservice.getAllXOrdersByDatecreated(datecreated);
	}
	
	
	
	

}
