package com.cars.SeriesModelService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cars.SeriesModelService.model.CarSeries;

@Repository
public interface CarSeriesRepository  extends JpaRepository<CarSeries, Long> {

	@Query(value = "SELECT * FROM carseries ",nativeQuery = true)
	public List<CarSeries> getAll();
}
