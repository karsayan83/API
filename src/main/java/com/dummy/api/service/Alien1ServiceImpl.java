package com.dummy.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dummy.api.model.Alien1;
import com.dummy.api.repository.Alien1Repository;

@Service
public class Alien1ServiceImpl implements Alien1Service{
	@Autowired
	private Alien1Repository arepo;
	
	@Override
	public List<Alien1> findByAlienemail(String alienemail) {
		List<Alien1> alienData = arepo.findByAlienemail(alienemail); 
		return alienData;
	}

	@Override
	public void save(Alien1 alien1) {
		arepo.save(alien1);		
	}
}
