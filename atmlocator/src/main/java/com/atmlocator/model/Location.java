package com.atmlocator.model;

import java.util.List;

public class Location {

	private Address address;
	private float distance;
	private List<DayInfo> openingHours;
	private String functionality;
	private String type;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public List<DayInfo> getOpeningHours() {
		return openingHours;
	}
	public void setOpeningHours(List<DayInfo> openingHours) {
		this.openingHours = openingHours;
	}
	public String getFunctionality() {
		return functionality;
	}
	public void setFunctionality(String functionality) {
		this.functionality = functionality;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
		
		
