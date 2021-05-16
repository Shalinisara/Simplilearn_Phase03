package com.shoes.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoes.model.XOrder;

@Repository
public interface XOrderRepository extends JpaRepository<XOrder, Integer> {

	public List<XOrder> findByCategory(String category);
	public List<XOrder> findByDatecreated(LocalDate datecreated);
}
