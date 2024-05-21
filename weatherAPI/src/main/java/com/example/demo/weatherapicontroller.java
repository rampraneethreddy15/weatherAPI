
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class weatherapicontroller {
	
	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/weather")
	public Weather getWeather(@RequestParam String city) {
	    return weatherService.getWeather(city);
	}
}

