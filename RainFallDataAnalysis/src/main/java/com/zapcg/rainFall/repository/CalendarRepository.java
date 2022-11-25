package com.zapcg.rainFall.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zapcg.rainFall.entity.Calendar;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Integer> {

	@Query(value = "select jan, fab,mar,apr,may,jun,jul,aug,sept,oct,nov,decs\r\n" + "from  calender as cal \r\n" + "inner join city as c on cal.city_id2=c.city_id\r\n"
			+ "inner join years as y on cal.year_id2= y.year_id where\r\n"
			+ "c.cityname= ?1 and y.year= ?2 ;", nativeQuery = true)
	List<Object> findAllDetails(String naam, Integer xyz);

}
