package com.cars.SeriesModelService.model;

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
	private long modelId;
	@Column(name = "carmodel_name")
	private String modelName;
	@Column(name = "carmodel_price")
	private long modelPrice;
	public long getModelId() {
		return modelId;
	}
	public void setModelId(long modelId) {
		this.modelId = modelId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public long getModelPrice() {
		return modelPrice;
	}
	public void setModelPrice(long modelPrice) {
		this.modelPrice = modelPrice;
	}
	@Override
	public String toString() {
		return "CarModels [modelId=" + modelId + ", modelName=" + modelName + ", modelPrice=" + modelPrice + "]";
	}
	
	
	
	
}
