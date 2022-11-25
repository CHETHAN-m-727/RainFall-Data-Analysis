package com.zapcg.rainFall.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

import com.zapcg.rainFall.entity.Years;

public interface YearsRepository extends JpaRepository<Years, Integer> {
	@Query(value = "select year from years;" , nativeQuery = true)
	List<Integer> findAllDetails( Integer year);



}
