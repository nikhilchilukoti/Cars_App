package com.cars.AccessoryService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.AccessoryService.model.Accessory;
import com.cars.AccessoryService.repository.AccessoryRepository;


@Service
public class AccessoryService {

	
	@Autowired
	private AccessoryRepository accessoryRepository;

	
	
	public List<Accessory> getById(long id)
	{
		return this.accessoryRepository.getAll(id);
	}
	
}
