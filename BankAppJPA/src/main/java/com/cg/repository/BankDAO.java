package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.Bank;

@Repository
public interface BankDAO extends JpaRepository<Bank, Integer>{

}
