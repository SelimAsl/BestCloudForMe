package com.bestcloud.task.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bestcloud.task.model.City;
import com.bestcloud.task.model.Writer;

@RestController
class CityController {
	
	@GetMapping
	public List<Writer> getWriter(){
		return List.of (new Writer("Selimcan","Aslan"));		
	}
	
	@GetMapping("/temperature/istanbul")
	public List<City> getCity(){
		return List.of (new City("istanbul",3.4));		
	}
}
