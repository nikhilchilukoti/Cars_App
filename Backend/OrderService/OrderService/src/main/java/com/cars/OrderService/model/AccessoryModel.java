package com.cars.OrderService.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_accessories_details")
public class AccessoryModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="order_accessory_id")
	private int orderAccessoryId;
	
	
	@Column(name="accessory_id")
	private int accessories_id;
	
	@Column(name="accessory_name")
	private String accessories_name;

	public int getOrderAccessoryId() {
		return orderAccessoryId;
	}

	public void setOrderAccessoryId(int orderAccessoryId) {
		this.orderAccessoryId = orderAccessoryId;
	}

	
	public int getAccessories_id() {
		return accessories_id;
	}

	public void setAccessories_id(int accessories_id) {
		this.accessories_id = accessories_id;
	}

	public String getAccessories_name() {
		return accessories_name;
	}

	public void setAccessories_name(String accessories_name) {
		this.accessories_name = accessories_name;
	}

	public AccessoryModel(List<AccessoryModel> list) {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccessoryModel(int accessories_id, String accessories_name) {
		super();
		this.accessories_id = accessories_id;
		this.accessories_name = accessories_name;
	}
	


	

}
