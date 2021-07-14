package com.atmlocator.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.atmlocator.model.Location;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AtmLocatorServiceImpl implements AtmLocatorService{

	@Autowired
	RestTemplate restTemplate;
	
	private String endpointUrl = "https://www.ing.nl/api/locator/atms/";
	
	@Override
	public List<Location> getAllLocations() {

		String response = (String) restTemplate.getForObject(endpointUrl, String.class);
	    String responseString = response.substring(5);
	    ObjectMapper mapper = new ObjectMapper();

	    List<Location> locationList = null;
		try {
			locationList = Arrays.asList(mapper.readValue(responseString, Location[].class));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	    return locationList;
	}

	@Override
	public List<Location> getAtmInfoInCity(String city) {

		String response = (String) restTemplate.getForObject(endpointUrl, String.class);
	    String responseString = response.substring(5);
	    ObjectMapper mapper = new ObjectMapper();

	    List<Location> locationList = null;
		try {
			locationList = Arrays.asList(mapper.readValue(responseString, Location[].class));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		locationList = locationList.stream().filter(loc -> city.equalsIgnoreCase(loc.getAddress().getCity())).collect(Collectors.toList());
	    return locationList;
	}
	
	

}
