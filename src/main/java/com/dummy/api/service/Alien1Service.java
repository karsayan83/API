package com.dummy.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dummy.api.model.Alien1;

@Service
public interface Alien1Service {

	List<Alien1> findByAlienemail(String alienemail);

	void save(Alien1 alien1);

}
