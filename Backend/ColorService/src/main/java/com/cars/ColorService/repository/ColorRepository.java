package com.cars.ColorService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cars.ColorService.model.Color;


@Repository
public interface ColorRepository  extends JpaRepository<Color, Long> {

	@Query(value = "SELECT * FROM colors WHERE colors_id IN (SELECT colors_id FROM carmodelcolors WHERE carmodel_id = ?1)",nativeQuery = true)
	public List<Color> getAll(long id);
	
}
