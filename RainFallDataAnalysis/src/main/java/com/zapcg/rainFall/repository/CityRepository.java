package com.zapcg.rainFall.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//import java.util.Optional;

//import org.springframework.data.repository.CrudRepository;

import com.zapcg.rainFall.entity.City;
@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
	
	@Query(value = "select cityname from city;" , nativeQuery = true)
	List<String> findAllDetails( String citys);
	


}
