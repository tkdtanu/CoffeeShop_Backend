package com.tkd.ordering.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Required;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author TKD
 */
@Entity
@Table(name="ORDER_DETAILS")
@JsonInclude(Include.NON_NULL)
public class Order implements Serializable {
	@Id
	@GeneratedValue(generator="order_seq")
	@SequenceGenerator(name="order_seq",sequenceName="ORDER_SEQ", allocationSize=1)
	private Long id;
	
	private String itemName;
	
	private Long quantity;

	private Long price;
	
	private LocalDateTime orderDateTime;
	
	private String customerName;
	
	private String customerPhoneNumber;
	
	private String status;
	
	public Order() {
		super();
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Order(Long id, String itemName, Long quantity, Long price, LocalDateTime orderDateTime, String customerName,
			String customerPhoneNumber, String status) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.orderDateTime = orderDateTime;
		this.customerName = customerName;
		this.customerPhoneNumber = customerPhoneNumber;
		this.status = status;
	}

	public Order(String itemName, Long quantity, Long price, LocalDateTime orderDateTime, String customerName,
			String customerPhoneNumber, String status) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.orderDateTime = orderDateTime;
		this.customerName = customerName;
		this.customerPhoneNumber = customerPhoneNumber;
		this.status = status;
	}

	public Order(String itemName, Long quantity, Long price, LocalDateTime orderDateTime, String customerName,
			String customerPhoneNumber) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.orderDateTime = orderDateTime;
		this.customerName = customerName;
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public Order(String itemName, Long quantity, Long price, LocalDateTime orderDateTime) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.orderDateTime = orderDateTime;
	}

	public Order(Long id, String itemName, Long quantity, Long price, LocalDateTime orderDateTime) {
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

	public LocalDateTime getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(LocalDateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", itemName=" + itemName + ", quantity=" + quantity + ", price=" + price
				+ ", orderDateTime=" + orderDateTime + ", customerName=" + customerName + ", customerPhoneNumber="
				+ customerPhoneNumber + "]";
	}
	
}
