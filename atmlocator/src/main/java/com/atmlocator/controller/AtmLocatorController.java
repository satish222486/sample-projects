package com.atmlocator.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.atmlocator.model.Location;
import com.atmlocator.services.AtmLocatorService;


@RestController
public class AtmLocatorController {

	@Autowired
	private AtmLocatorService atmLocatorService;
	
	
	@GetMapping(value = "/getAllLocations")
	public List<Location> getAllLocations() {
		
		return atmLocatorService.getAllLocations();

	}
	
	@GetMapping(value = "/getAtmInfoInCity/{city}")
	public List<Location> getAtmInfoInCity(@PathVariable String city) {
		
		return atmLocatorService.getAtmInfoInCity(city);

	}
}

