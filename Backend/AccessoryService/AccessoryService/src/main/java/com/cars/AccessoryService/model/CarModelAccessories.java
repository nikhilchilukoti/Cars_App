package com.cars.AccessoryService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carmodelaccessories")
public class CarModelAccessories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "carmodelaccessories_id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "carmodel_id")
	private CarSeries seriesId;
	
	@ManyToOne
	@JoinColumn(name="accessories_id")
	private CarModels modelId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public CarSeries getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(CarSeries seriesId) {
		this.seriesId = seriesId;
	}

	public CarModels getModelId() {
		return modelId;
	}

	public void setModelId(CarModels modelId) {
		this.modelId = modelId;
	}

	@Override
	public String toString() {
		return "CarModelAccessories [id=" + id + ", seriesId=" + seriesId + ", modelId=" + modelId + "]";
	}
	
	
	
}
