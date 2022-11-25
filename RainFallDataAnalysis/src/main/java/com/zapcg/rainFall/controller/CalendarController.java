package com.zapcg.rainFall.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zapcg.rainFall.entity.Calendar;
import com.zapcg.rainFall.repository.CalendarRepository;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/city/log")
public class CalendarController {

	@Autowired
	private CalendarRepository calendarRepository;
	
    @GetMapping(value = "/all")
    public ResponseEntity<?> findAll() {
        List<Calendar> list = new ArrayList<>();
        Iterable<Calendar> y = calendarRepository.findAll();
        y.forEach(t -> list.add(t));
        return new ResponseEntity<List<Calendar>>(list, HttpStatus.OK);
    }

	@GetMapping(value = "/all/{nam}/{year}")
	public List<Object> getAll(@PathVariable(value = "nam") String nam, @PathVariable(value = "year") Integer year) {
		return calendarRepository.findAllDetails(nam, year);
	}

	
	@PostMapping(value = "/api/new", consumes = { "application/json", "application/xml" })
	public Calendar saveUser(@Validated @RequestBody Calendar calendar) {

		return calendarRepository.save(calendar);
	}

}
