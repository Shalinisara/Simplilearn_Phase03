package com.shoes.service.impl;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.shoes.model.XOrder;

//import javax.persistence.EntityManager;

import com.shoes.repository.XOrderRepository;
import com.shoes.service.XOrderAddService;

@Component
public class XOrderAddServiceImpl implements XOrderAddService {
	

	@Autowired
	private XOrderRepository xorderrepo;

	@Override
	public XOrder createXOrder(XOrder xorder) {
		// TODO Auto-generated method stub
		
		return xorderrepo.save(xorder);
		
	}

	@Override
	public List<XOrder> getAllXOrdersByCategory(String category) {
		// TODO Auto-generated method stub
		System.out.println("Impl:" + category);
		return xorderrepo.findByCategory(category);
	}

	@Override
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public List<XOrder> getAllXOrdersByDatecreated(LocalDate datecreated) {
		// TODO Auto-generated method stub
		System.out.println("in Impl date is" + datecreated);
		return xorderrepo.findByDatecreated(datecreated);
	}

	
	

}
