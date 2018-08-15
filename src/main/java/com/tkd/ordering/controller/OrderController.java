package com.tkd.ordering.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tkd.ordering.model.Order;
import com.tkd.ordering.service.OrderMgmtService;

/**
 * @author TKD
 *
 */
@RestController
@RequestMapping(path="/api/order")
public class OrderController {
	
	@Autowired
	private OrderMgmtService orderMgmtService;
	
	@PostMapping("/create")
	public ResponseEntity<?> createOrder(@RequestBody Order order){
		return ResponseEntity.ok(orderMgmtService.createNewOrder(order));
	}
	
	@GetMapping("/retrieve/all")
	public List<Order> findAllOrders(){
		return orderMgmtService.findAllOrders();
	}
	
	@GetMapping("/retrieve/{orderId}")
	public Order findOrderByID(@PathVariable(value="orderId") Long orderId){
		return orderMgmtService.findOrderByID(orderId);
	}
}
