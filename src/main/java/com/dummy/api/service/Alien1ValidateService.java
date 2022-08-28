package com.dummy.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dummy.api.model.Alien1;

@Service
public class Alien1ValidateService {
	@Autowired
	private Alien1Service ias;
	
	public ResponseEntity<?> checkUser(Alien1 alien1) {
		List<Alien1> availableAlien = ias.findByAlienemail(alien1.getAlienemail());
		ResponseEntity<?> responseEntity = null;
		
		if(availableAlien.size() > 0 && !availableAlien.isEmpty()) {
			responseEntity = ResponseEntity.status(HttpStatus.CONFLICT).build(); //409
		}
		else if(availableAlien.isEmpty() && availableAlien.size() == 0) {
			ias.save(alien1);
			responseEntity = ResponseEntity.status(HttpStatus.OK).build(); //200
		}
		
		return responseEntity;
	}

}
