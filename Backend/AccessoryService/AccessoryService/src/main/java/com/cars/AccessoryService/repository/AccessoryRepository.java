package com.cars.AccessoryService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cars.AccessoryService.model.Accessory;

@Repository
public interface AccessoryRepository extends JpaRepository<Accessory, Long> {

	@Query(value = "SELECT * FROM accessories WHERE accessories_id IN (SELECT accessories_id FROM carmodelaccessories WHERE carmodel_id = ?1)",nativeQuery = true)
	public List<Accessory> getAll(long id);
}