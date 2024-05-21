package com.example.demo;

public class Weather {
	
	private String city;
	private double currentTemp_c;
	private double currentTemp_f;
	
	public String getCity() {
		return city;
	}
	public void setcity(String city) {
		this.city = city;
	}
	public double getCurrentTemp_c() {
		return currentTemp_c;
	}
	public void setCurrentTemp_c(double currentTemp_c) {
		this.currentTemp_c = currentTemp_c;
	}
	public double getCurrentTemp_f() {
		return currentTemp_f;
	}
	public void setCurrentTemp_f(double currentTemp_f) {
		this.currentTemp_f = currentTemp_f;
	}
	
	public Weather (String city, double currentTemp_c, double currentTemp_f) {
		
		this.city = city;
		this.currentTemp_c = currentTemp_c;
		this.currentTemp_f = currentTemp_f;
	}

}
