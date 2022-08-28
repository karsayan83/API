package com.dummy.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dummy.api.model.Alien1;
import com.dummy.api.service.Alien1ValidateService;

@RestController
public class ApiPostController {
	@Autowired
	private Alien1ValidateService avs;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping(path = "/postAlien", consumes = {"application/json"})
	public ResponseEntity<?> getAlienBrowserSubmissions(@RequestBody Alien1 alien1){
		ResponseEntity<?> response = avs.checkUser(alien1);
		return response;
	}
}
