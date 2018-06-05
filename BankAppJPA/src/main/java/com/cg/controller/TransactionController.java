package com.cg.controller;

import org.apache.log4j.Logger;
import org.hibernate.engine.transaction.internal.TransactionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.BankException;
import com.cg.model.Transaction;
import com.cg.service.TransactionServiceImpl;

@RestController
public class TransactionController {

	Logger LOGGER = Logger.getLogger(TransactionController.class);
	@Autowired
	private TransactionServiceImpl trnsser;
	
	public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction trnst)throws BankException
	{
		Transaction trnstd = null;
		try {
			trnstd = trnsser.createTransaction(trnst);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());	
			}
		if(trnstd == null)
		{
			throw new BankException("No Transaction created");
		}
		else
		{
			return new ResponseEntity<Transaction>(trnstd,HttpStatus.OK);
		}
		
	}
	
}
