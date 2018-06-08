package com.cg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Denomination;

public interface BankDenominationDAO extends JpaRepository<Denomination, Integer>{

	
	public Optional<Denomination> findByDenominationId(Integer denominationId);
}
