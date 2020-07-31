package com.cars.OrderService.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.OrderService.model.OrderServiceEntity;


@Repository
public interface OrderServiceRepository extends JpaRepository<OrderServiceEntity,Integer> {

}
