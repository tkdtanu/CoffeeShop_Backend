package com.tkd.ordering.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tkd.ordering.enums.OrderStatusEnum;
import com.tkd.ordering.model.Order;
import com.tkd.ordering.repository.OrderRepository;
import com.tkd.ordering.service.OrderMgmtService;

@Service
public class OrderMgmtServiceImpl implements OrderMgmtService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public Order createNewOrder(Order order) {
		logger.info("Creating a new Order");
		order.setStatus(OrderStatusEnum.NEW.toString());
		Order createdOrder = orderRepository.save(order);
		logger.info("Order created successfully");
		return createdOrder;
	}

	@Override
	public List<Order> findAllOrders() {
		logger.info("Retrieving all orders");
		return orderRepository.findAll();
	}

	@Override
	public Order findOrderByID(Long id) {
		logger.info("Retrieving order based on given ID");
		return orderRepository.findById(id).get();
	}
	

}
