package com.cars.AccessoryService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.AccessoryService.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
