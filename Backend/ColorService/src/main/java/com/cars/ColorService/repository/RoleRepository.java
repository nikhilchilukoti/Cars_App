package com.cars.ColorService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.ColorService.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
