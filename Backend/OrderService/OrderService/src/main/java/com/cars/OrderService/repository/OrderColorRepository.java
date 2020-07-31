package com.cars.OrderService.repository;
import com.cars.OrderService.model.ColorModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderColorRepository extends JpaRepository<ColorModel, Integer> {

}
