package com.cg.controller;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cg.exception.BankException;
import com.cg.model.Transaction;
import com.cg.service.TransactionServiceImpl;

@RestController
public class TransactionController {

	public static final Logger LOGGER =Logger.getLogger(TransactionController.class);
	
	@Autowired
	private TransactionServiceImpl transser;
	
	@GetMapping(value = "/getTransaction/{id}")
	public ResponseEntity<Transaction> getTransactionDetails(@PathVariable Integer id) throws BankException
	{
		
		Transaction transData = null;
		try {
			transData = transser.getTransactionDetails(id);
			System.out.println(transData);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	if(transData == null )
	{
		throw new BankException("No details found");
	}
	else
	{
		return new ResponseEntity<Transaction>(transData ,HttpStatus.OK); 
	}
	}
}
