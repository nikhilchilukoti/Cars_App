package com.cars.SeriesModelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.SeriesModelService.model.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
