package com.dummy.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dummy.api.model.Alien1;

@Repository
public interface Alien1Repository extends JpaRepository<Alien1, Integer> {

	List<Alien1> findByAlienemail(String alienemail);

}
