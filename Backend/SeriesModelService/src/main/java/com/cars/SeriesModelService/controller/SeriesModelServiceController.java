package com.cars.SeriesModelService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.SeriesModelService.model.CarModels;
import com.cars.SeriesModelService.model.CarSeries;
import com.cars.SeriesModelService.model.CarSeriesModel;
import com.cars.SeriesModelService.service.CarModelService;
import com.cars.SeriesModelService.service.CarSeriesModelService;
import com.cars.SeriesModelService.service.CarSeriesService;
@RestController
@CrossOrigin
@RequestMapping("/getsm")
public class SeriesModelServiceController {
	
	@Autowired
	private CarSeriesService carSeriesService;
	
	@Autowired
	private CarModelService carModelService;
	
	@Autowired
	private CarSeriesModelService carSeriesModelService;
	
	@GetMapping("/allseries")
	public List<CarSeries> getCarSeries() {
		return carSeriesService.getAllSeries();
	}
	
	@GetMapping("/allmodels")
	public List<CarModels> getCarModles() {
		return carModelService.getAllModels();
	}
	
	@GetMapping("/getmodels/{id}")
	public List<CarModels> getItem(@PathVariable("id") long id) {
		
		List<CarModels> list=new ArrayList<CarModels>();
	
		list=this.carSeriesModelService.getById(id);
	
		return list;
	}
	
	
	
}
