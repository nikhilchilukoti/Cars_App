package com.cars.ColorService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "colors")
public class Color {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "colors_id")
	private long colors_id;
	@Column(name="colors_name")
	private String colors_name;
	@Column(name ="colors_price")
	private long colors_price;
	@Column(name ="colors_quantity")
	private long colors_quantity;
	public long getColors_id() {
		return colors_id;
	}
	public void setColors_id(long colors_id) {
		this.colors_id = colors_id;
	}
	public String getColors_name() {
		return colors_name;
	}
	public void setColors_name(String colors_name) {
		this.colors_name = colors_name;
	}
	public long getColors_price() {
		return colors_price;
	}
	public void setColors_price(long colors_price) {
		this.colors_price = colors_price;
	}
	public long getColors_quantity() {
		return colors_quantity;
	}
	public void setColors_quantity(long colors_quantity) {
		this.colors_quantity = colors_quantity;
	}
	@Override
	public String toString() {
		return "Color [colors_id=" + colors_id + ", colors_name=" + colors_name + ", colors_price=" + colors_price
				+ ", colors_quantity=" + colors_quantity + "]";
	}
	
}
