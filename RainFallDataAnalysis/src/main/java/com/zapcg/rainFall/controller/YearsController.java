package com.zapcg.rainFall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zapcg.rainFall.repository.YearsRepository;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/rainfall")
public class YearsController {

	@Autowired
	private YearsRepository yerRepository;

	@GetMapping(value = "/all")
	public List<Integer> getAll(Integer year) {
		return yerRepository.findAllDetails(year);
	}

}
