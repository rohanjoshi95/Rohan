package com.cg.service;

import com.cg.exception.BankException;
import com.cg.model.Transaction;

public interface TransactionService {

	Transaction createTransaction(Transaction transaction)throws BankException;
}
