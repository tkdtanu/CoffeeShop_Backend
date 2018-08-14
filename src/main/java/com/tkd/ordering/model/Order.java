package com.tkd.ordering.model;

import java.time.LocalDate;

/**
 * @author TKD
 *
 */
public class Order {
	
	private Long id;
	
	private String itemName;
	
	private Long quantity;
	
	private Long price;
	
	private LocalDate orderDateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public LocalDate getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(LocalDate orderDateTime) {
		this.orderDateTime = orderDateTime;
	}
	

}
