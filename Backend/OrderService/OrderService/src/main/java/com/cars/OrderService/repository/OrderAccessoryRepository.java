package com.cars.OrderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.OrderService.model.AccessoryModel;

@Repository
public interface OrderAccessoryRepository extends JpaRepository<AccessoryModel, Integer> {
	
	

}
