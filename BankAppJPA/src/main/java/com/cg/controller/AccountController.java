package com.cg.controller;

import java.math.BigDecimal;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.BankException;
import com.cg.model.Account;
import com.cg.service.AccountServiceImpl;
import com.dto.WrapperBankCustomerAccount;

@RestController
public class AccountController {

	final Logger LOGGER =Logger.getLogger(AccountController.class);
	
	@Autowired
	private AccountServiceImpl acntser;
	
	@PostMapping("/createAccount")
	public ResponseEntity<Account> createAccount(@RequestBody WrapperBankCustomerAccount wrappbkcusacnt) throws BankException
	{
		Account acntd = null;
		try {
			acntd = acntser.createAccount(wrappbkcusacnt);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		
		if(acntd == null)
		{
			throw new BankException("No account created");
		}
		else
		{
			return new ResponseEntity<Account>(acntd, HttpStatus.OK);
		}
		
	}
	
	@GetMapping("/depositeMoney/{id}/{amt}")
	public ResponseEntity<Account> depositeMoney(@PathVariable Integer id , @PathVariable BigDecimal amt ) throws BankException
	{
		Account acntd = null;
		try {
			acntd = acntser.depositeMoney(id, amt);
		} catch (Exception e) {
			LOGGER.error("Amount not deposited");
		}
	
		return new ResponseEntity<Account>(acntd, HttpStatus.OK);
		
		
	}
	
	@GetMapping("/withdrawMoney/{id}/{amt}")
	public ResponseEntity<Account> withdrawMoney(@PathVariable Integer id , @PathVariable BigDecimal amt ) throws BankException
	{
		Account acntd = null;
		try {
			acntd = acntser.withdrawMoney(id, amt);
		} catch (Exception e) {
			LOGGER.error("Amount not withdrawned");
		}
	
		return new ResponseEntity<Account>(acntd, HttpStatus.OK);
	}
	

	@GetMapping("/getAccountDetails/{id}")
	public ResponseEntity<Account> getAccountDetails(@PathVariable Integer id) throws BankException
	{
		Account acnt = null;
		try {
			acnt = acntser.getAccountDetails(id);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		
		if(acnt == null)
		{
			throw new BankException("Account Not Found");
		}
		else
		{
			return new ResponseEntity<Account>(acnt,HttpStatus.OK);
		}

	}

}
