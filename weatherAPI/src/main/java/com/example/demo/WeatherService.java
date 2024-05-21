package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class WeatherService {
	
	
	@Autowired
	private RestTemplate restT;
	
	private String apikey = "f49b362949b74e1dad0171222232502";
	
	private static final String WEATHER_API_URL = "https://api.weatherapi.com/v1/current.json?key=f49b362949b74e1dad0171222232502&q=";
	
	public Weather getWeather(String city) {
		
		String apiUrl = WEATHER_API_URL + city;
		
		ResponseEntity<reqdata> res = restT.getForEntity(apiUrl, reqdata.class); 
		
		
		
		return new Weather(res.getBody().getLocation().getCity(), res.getBody().getCurrent().getTemp_c(), res.getBody().getCurrent().getTemp_f());
	}

}


