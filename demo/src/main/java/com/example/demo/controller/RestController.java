package com.example.demo.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Service.RestService;
import com.gogreat.gob.controller.Gson;

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
	
	@GetMapping(value = "{name}")
	public ResponseEntity<Map<String, Object>> getValue(@PathVariable(value="name") String value) {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("value1", value);
		map.put("value2", 2);
		map.put("value3", 3);
		
		return new ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
	}
	
	
	@RequestMapping(value="{name}", method=RequestMethod.DELETE, produces = "application/text; charset=utf8") 
	@ResponseBody public String cur_unexpired(HttpServletRequest req, Model model) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		List list = service.cur_unexpired(map);
		Gson gson = new Gson();
		model.addAttribute("key", "value");
		
		return gson.toJson(list);
		
	}
	
	@PostMapping(value="cur-unexpired")
	public String cur_unexpired(HttpServletRequest req, Model model) {
		
		return null;
	}
	
	
}
