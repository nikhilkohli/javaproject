package com.covid.Coviddata;

import java.io.Serializable;

public class CovidRaw implements Serializable {
	
	private int iso_code;	
	private String continent;
	private String location;
	private int date;
	private int total_cases;
	private int new_cases;	
	private int total_deaths;
	private int new_deaths;
	
	public int getIso_code() {
		return iso_code;
	}
	public void setIso_code(int iso_code) {
		this.iso_code = iso_code;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getTotal_cases() {
		return total_cases;
	}
	public void setTotal_cases(int total_cases) {
		this.total_cases = total_cases;
	}
	public int getNew_cases() {
		return new_cases;
	}
	public void setNew_cases(int new_cases) {
		this.new_cases = new_cases;
	}
	public int getTotal_deaths() {
		return total_deaths;
	}
	public void setTotal_deaths(int total_deaths) {
		this.total_deaths = total_deaths;
	}
	public int getNew_deaths() {
		return new_deaths;
	}
	public void setNew_deaths(int new_deaths) {
		this.new_deaths = new_deaths;
	}
	
	
	
	


}
