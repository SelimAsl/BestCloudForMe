package com.bestcloud.task.model;

public class City {
	private String city;
	private double temperature;
	
	public City() {
		
		}
	public City(String city, double temperature) {
		
		this.city = city;
		this.temperature = temperature;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	

}
