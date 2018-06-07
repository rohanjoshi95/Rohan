package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Denomination;

public interface BankDenominationDAO extends JpaRepository<Denomination, Integer>{

	
	
}
