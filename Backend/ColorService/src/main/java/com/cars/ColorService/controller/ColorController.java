package com.cars.ColorService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.ColorService.model.Color;
import com.cars.ColorService.service.ColorService;


@RestController
@CrossOrigin
@RequestMapping("/getcolors")
public class ColorController {

	@Autowired
	private ColorService colorService;
	@GetMapping("/allcolors/{id}")
	public List<Color> getItem(@PathVariable("id") long id) {
		
		List<Color> list=new ArrayList<Color>();
	
		list=this.colorService.getById(id);
	
		return list;
	}
}
