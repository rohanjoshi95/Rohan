package com.cg.service;

import java.util.Optional;

import com.cg.exception.BankException;
import com.cg.model.Transaction;

public interface TransactionService {

	Transaction createTransaction(Transaction transaction)throws BankException;
	Optional<Transaction> getTransactionDetails(Integer accountId) throws BankException;
}
