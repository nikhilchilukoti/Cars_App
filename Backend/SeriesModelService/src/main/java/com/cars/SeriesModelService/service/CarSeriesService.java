package com.cars.SeriesModelService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.SeriesModelService.model.CarSeries;
import com.cars.SeriesModelService.repository.CarSeriesRepository;

@Service
public class CarSeriesService {
	@Autowired
	private CarSeriesRepository carSeriesRepository;
	
	public List<CarSeries> getAllSeries()
	{
		return this.carSeriesRepository.getAll();
	}
}
