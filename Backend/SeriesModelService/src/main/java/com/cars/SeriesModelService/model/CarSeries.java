package com.cars.SeriesModelService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carseries")
public class CarSeries {

	@Id
	@Column(name = "carseries_id")
	private long seriesId;
	@Column(name = "carseries_name")
	private String seriesName;
	public long getSeriesId() {
		return seriesId;
	}
	public void setSeriesId(long seriesId) {
		this.seriesId = seriesId;
	}
	public String getSeriesName() {
		return seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
	@Override
	public String toString() {
		return "CarSeries [seriesId=" + seriesId + ", seriesName=" + seriesName + "]";
	}
	
	
	
	
	
}
