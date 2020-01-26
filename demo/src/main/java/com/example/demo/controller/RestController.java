package com.example.demo.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Service.RestService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	RestService restService;
	
	
	@GetMapping(value = "")
	public ResponseEntity<Map<String, Object>> getValue(@PathVariable(value="value") String value) {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("value1", value);
		map.put("value2", 2);
		map.put("value3", 3);
		
		return new ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
	}

	
	
	
	
	
}
