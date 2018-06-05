package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exception.BankException;
import com.cg.model.Transaction;
import com.cg.repository.TransactionDAO;

@Service
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	private TransactionDAO transdao;
	
	@Override
	public Transaction createTransaction(Transaction transaction) throws BankException {
		Transaction trans = transdao.save(transaction);
		return trans;
	}

}
