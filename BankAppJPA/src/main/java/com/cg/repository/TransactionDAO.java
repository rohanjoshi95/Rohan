package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Transaction;

public interface TransactionDAO extends JpaRepository<Transaction, Integer>{

}
