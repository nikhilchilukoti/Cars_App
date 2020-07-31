package com.cars.OrderService.model;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_color_details")
public class ColorModel  implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="order_color_id")
	private int orderColorId;
	
	
	@Column(name="color_id")
	private int colors_id;
	
	@Column(name="color_name")
	private String colors_name;
	


	public int getOrderColorId() {
		return orderColorId;
	}

	public void setOrderColorId(int orderColorId) {
		this.orderColorId = orderColorId;
	}


	


	public int getColors_id() {
		return colors_id;
	}

	public void setColors_id(int colors_id) {
		this.colors_id = colors_id;
	}

	public String getColors_name() {
		return colors_name;
	}

	public void setColors_name(String colors_name) {
		this.colors_name = colors_name;
	}

	public ColorModel(List<ColorModel> list) {
		super();
		// TODO Auto-generated constructor stub
	}

	public ColorModel(int colors_id, String colors_name) {
		super();
		this.colors_id = colors_id;
		this.colors_name = colors_name;
	}
	
	

}
