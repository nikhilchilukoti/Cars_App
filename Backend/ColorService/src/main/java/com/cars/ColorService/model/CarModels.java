package com.cars.ColorService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carmodel")
public class CarModels {

	@Id
	@Column(name = "carmodel_id")
	private long id;
	@Column(name = "carmodel_name")
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
		return "CarModels [id=" + id + ", name=" + name + "]";
	}

	
	
	
	
}
