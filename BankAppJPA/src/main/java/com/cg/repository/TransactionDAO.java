package com.cg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Transaction;

public interface TransactionDAO extends JpaRepository<Transaction, Integer>{

	public Optional<Transaction> findByTransactionId(Integer transactionId);
}
