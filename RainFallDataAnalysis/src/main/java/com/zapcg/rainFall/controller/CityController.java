package com.zapcg.rainFall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.zapcg.rainFall.entity.Years;
import com.zapcg.rainFall.repository.CityRepository;
@CrossOrigin(origins = "*")
@RequestMapping("/api/Citycontact")
@RestController
public class CityController {

	@Autowired
	private CityRepository cityRepository;

	@GetMapping(value = "/all")
	public List<String> getAll(String citys) {
		return cityRepository.findAllDetails(citys);
	}

}
