package com.cars.SeriesModelService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cars.SeriesModelService.model.CarModels;

@Repository
public interface CarModelRepository  extends JpaRepository<CarModels, Long> {

	@Query(value = "SELECT * FROM carmodel ",nativeQuery = true)
	public List<CarModels> getAll();
}
