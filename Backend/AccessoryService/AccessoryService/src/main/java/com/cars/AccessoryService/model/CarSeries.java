package com.cars.AccessoryService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carseries")
public class CarSeries {

	@Id
	@Column(name = "carseries_id")
	private long id;
	@Column(name = "carseries_name")
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CarSeries [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
