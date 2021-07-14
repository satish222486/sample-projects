package com.atmlocator.model;

import java.util.List;


public class DayInfo {

	private int dayOfWeek;
	private List<HourInfo> hours;
	public int getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public List<HourInfo> getHours() {
		return hours;
	}
	public void setHours(List<HourInfo> hours) {
		this.hours = hours;
	}
	
	

}
