package com.atmlocator.services;

import java.util.List;

import com.atmlocator.model.Location;


public interface AtmLocatorService {

	List<Location> getAllLocations();

	List<Location> getAtmInfoInCity(String city);

}
