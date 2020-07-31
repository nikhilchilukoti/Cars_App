package com.cars.OrderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.OrderService.model.Role;



@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
