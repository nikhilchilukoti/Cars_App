package com.cars.AccessoryService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accessories")
public class Accessory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "accessories_id")
	private long accessories_id;
	@Column(name="accessories_name")
	private String accessories_name;
	@Column(name ="accessories_price")
	private long accessories_price;
	public long getAccessories_id() {
		return accessories_id;
	}
	public void setAccessories_id(long accessories_id) {
		this.accessories_id = accessories_id;
	}
	public String getAccessories_name() {
		return accessories_name;
	}
	public void setAccessories_name(String accessories_name) {
		this.accessories_name = accessories_name;
	}
	public long getAccessories_price() {
		return accessories_price;
	}
	public void setAccessories_price(long accessories_price) {
		this.accessories_price = accessories_price;
	}
	@Override
	public String toString() {
		return "Accessory [accessories_id=" + accessories_id + ", accessories_name=" + accessories_name
				+ ", accessories_price=" + accessories_price + "]";
	}
	
	
	
}