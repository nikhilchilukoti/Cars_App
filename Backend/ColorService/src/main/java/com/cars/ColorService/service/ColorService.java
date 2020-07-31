package com.cars.ColorService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.ColorService.model.Color;
import com.cars.ColorService.repository.ColorRepository;

@Service
public class ColorService {

	@Autowired
	private ColorRepository colorRepository;
	
	public List<Color> getById(long id)
	{
		return this.colorRepository.getAll(id);
	}
	

}
