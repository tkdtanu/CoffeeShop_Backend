package com.tkd.ordering.enums;

public enum OrderStatusEnum {
	NEW("NEW"),
	PROCESSING("PROCESSING"),
	PROCESSED("PROCESSED");
	
	private String status;

	private OrderStatusEnum(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return this.status;
	}
	
	
}
