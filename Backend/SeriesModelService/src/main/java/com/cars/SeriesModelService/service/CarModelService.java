package com.cars.SeriesModelService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.SeriesModelService.model.CarModels;
import com.cars.SeriesModelService.repository.CarModelRepository;
import com.cars.SeriesModelService.repository.CarSeriesModelRepository;

@Service
public class CarModelService {
	
	@Autowired
	private CarModelRepository carModelRepository;
	
	@Autowired
	private CarSeriesModelRepository carSeriesModelRepository; 
	public List<CarModels> getAllModels()
	{
		return this.carModelRepository.getAll();
	}
	
	public List<CarModels> getAllms(long id)
	{
		return this.carModelRepository.getAll();
	}
	
	
}
