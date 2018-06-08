package com.cg.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.Account;

@Repository
public interface AccountDAO extends JpaRepository<Account, Integer>{
	
	public Optional<Account> findByAccountId(Integer accountId);
}
