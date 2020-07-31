package com.cars.OrderService.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.OrderService.service.OrderService;
import com.cars.OrderService.service.SaveDTO;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class OrderCreationScreenController {
	
	@Autowired
	OrderService orderservice;
	
	@RequestMapping("/save")
	public boolean saveDetails(@RequestBody SaveDTO save) {
		return orderservice.saveOrder(save);	
	}

}


