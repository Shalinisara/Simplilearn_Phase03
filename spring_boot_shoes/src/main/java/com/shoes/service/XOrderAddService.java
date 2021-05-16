package com.shoes.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.shoes.model.XOrder;

public interface XOrderAddService {
	
	
public XOrder createXOrder(XOrder xorder);
public List<XOrder> getAllXOrdersByCategory(String category);
public List<XOrder> getAllXOrdersByDatecreated(LocalDate datecreated);

}
