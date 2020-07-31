package com.cars.AuthenticationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.AuthenticationService.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
