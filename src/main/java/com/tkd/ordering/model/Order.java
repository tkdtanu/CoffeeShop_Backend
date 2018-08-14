package com.tkd.ordering.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author TKD
 */
@Entity
@JsonInclude(Include.NON_NULL)
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String itemName;
	
	private Long quantity;
	
	private Long price;
	
	private LocalDate orderDateTime;
	
	public Order() {
		super();
	}

	public Order(String itemName, Long quantity, Long price, LocalDate orderDateTime) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.orderDateTime = orderDateTime;
	}

	public Order(Long id, String itemName, Long quantity, Long price, LocalDate orderDateTime) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.orderDateTime = orderDateTime;
	}

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

	@Override
	public String toString() {
		return "Order [id=" + id + ", itemName=" + itemName + ", quantity=" + quantity + ", price=" + price
				+ ", orderDateTime=" + orderDateTime + "]";
	}
	
}
