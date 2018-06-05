package com.cg.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;
import com.cg.exception.BankException;
import com.cg.model.Bank;
import com.cg.service.BankServiceImpl;

@RestController
public class BankController {
	
	final Logger LOGGER = Logger.getLogger(BankController.class);
	@Autowired
	private BankServiceImpl bkser;
	
	@PostMapping(value = "/createBank")
	public ResponseEntity<Bank> createBank(@RequestBody Bank bank) throws BankException
	{
		Bank bankd = null;
		try {
			bankd = bkser.createBank(bank);
		} catch (BankException e) {
			LOGGER.error(e.getMessage());
		}
		
		if(bankd == null)
		{
			throw new BankException("Bank not added");
		}
		else
		{
			return new ResponseEntity<Bank>(bankd,HttpStatus.OK);
		}
	}
	
	@GetMapping(value = "/getBank/{id}")
	public ResponseEntity<Bank> getBankDetails(@PathVariable Integer id) throws BankException
	{
		Bank bankd = null;
		try {
			bankd = bkser.getBankDetails(id);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		
		if(bankd == null)
		{
			throw new BankException("No details Found");
		}
		else
		{
			return new ResponseEntity<Bank> (bankd, HttpStatus.OK);
		}	
	}

}
