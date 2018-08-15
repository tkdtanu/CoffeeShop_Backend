package com.tkd.ordering.service;

import java.util.List;

import com.tkd.ordering.model.Order;

public interface OrderMgmtService {
	
	Order createNewOrder(Order order);
	
	List<Order> findAllOrders();
	
	Order findOrderByID(Long id);

}
