package com.cars.OrderService.service;

import java.util.List;

import com.cars.OrderService.model.AccessoryModel;
import com.cars.OrderService.model.ColorModel;



public class SaveDTO {
	private int orderId;
	private int seriesId;
	private int modelId;
	private List<AccessoryModel> accessoriesSelect;
	private List<ColorModel> colorsSelect;
	private long price;
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public int getSeriesId() {
		return seriesId;
	}
	public void setSeriesId(int seriesId) {
		this.seriesId = seriesId;
	}
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public List<AccessoryModel> getAccessoriesSelect() {
		return accessoriesSelect;
	}
	public void setAccessoriesSelect(List<AccessoryModel> accessoriesSelect) {
		this.accessoriesSelect = accessoriesSelect;
	}
	public List<ColorModel> getColorsSelect() {
		return colorsSelect;
	}
	public void setColorsSelect(List<ColorModel> colorsSelect) {
		this.colorsSelect = colorsSelect;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	public SaveDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SaveDTO(int orderId, int seriesId, int modelId, List<AccessoryModel> accessoriesSelect,
			List<ColorModel> colorsSelect, long price) {
		super();
		this.orderId = orderId;
		this.seriesId = seriesId;
		this.modelId = modelId;
		this.accessoriesSelect = accessoriesSelect;
		this.colorsSelect = colorsSelect;
		this.price = price;
	}
	


	
}
