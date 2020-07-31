package com.cars.SeriesModelService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.SeriesModelService.model.CarModels;
import com.cars.SeriesModelService.repository.CarSeriesModelRepository;

@Service
public class CarSeriesModelService {
	
	@Autowired
	private CarSeriesModelRepository carSeriesModelRepository;

	/*
	 * public List<CarSeriesModel> getByid(long id) { return
	 * this.carSeriesModelRepository.getAll(); }
	 */
	
	public List<CarModels> getById(long id)
	{
		return this.carSeriesModelRepository.getAll(id);
	}
	

}

/*SELECT carmodel_name FROM carmodel WHERE carmodel_id IN */