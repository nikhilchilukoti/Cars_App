package com.cars.OrderService.dto;

public class ColorDto {
private int colorId;
	
	private String colors_name;

	public int getColorId() {
		return colorId;
	}

	public void setColorId(int colorId) {
		this.colorId = colorId;
	}

	public String getColors_name() {
		return colors_name;
	}

	public void setColors_name(String colors_name) {
		this.colors_name = colors_name;
	}

	public ColorDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ColorDto(int colorId, String colors_name) {
		super();
		this.colorId = colorId;
		this.colors_name = colors_name;
	}
	
	
}
