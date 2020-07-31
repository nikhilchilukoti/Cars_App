package com.cars.SeriesModelService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cars.SeriesModelService.model.CarModels;


@Repository
public interface CarSeriesModelRepository extends JpaRepository<CarModels, Long> {

	@Query(value = "SELECT * from carmodel where carmodel_id in"
+ " (select carmodel_id from carseriesmodel where carseries_id = ?1)",nativeQuery = true)
	public List<CarModels> getAll(long id);
}
