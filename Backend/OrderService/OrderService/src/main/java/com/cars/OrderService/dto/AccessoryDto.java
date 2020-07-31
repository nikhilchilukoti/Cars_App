package com.cars.OrderService.dto;

public class AccessoryDto {
private int orderAccessoryId;
	
	private String accessories_name;

	public int getOrderAccessoryId() {
		return orderAccessoryId;
	}

	public void setOrderAccessoryId(int orderAccessoryId) {
		this.orderAccessoryId = orderAccessoryId;
	}

	public String getAccessories_name() {
		return accessories_name;
	}

	public void setAccessories_name(String accessories_name) {
		this.accessories_name = accessories_name;
	}

	public AccessoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccessoryDto(int orderAccessoryId, String accessories_name) {
		super();
		this.orderAccessoryId = orderAccessoryId;
		this.accessories_name = accessories_name;
	}
	
	
}
