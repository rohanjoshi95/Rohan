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
import com.cg.model.ATM;
import com.cg.service.ATMServiceImpl;
import com.dto.WrapperBankATM;

@RestController
public class ATMController {
	public ATMController() {
		// TODO Auto-generated constructor stub
	}

	public static final Logger LOGGER = Logger.getLogger(ATMController.class);
	
	@Autowired
	private ATMServiceImpl atmser;
	
	@PostMapping("/createATM")
	public ResponseEntity<ATM> createATM(@RequestBody WrapperBankATM wrappatm) throws BankException
	{
		ATM atmd = null;
		try {
				atmd = atmser.createATM(wrappatm);
		} catch (BankException e) {
			LOGGER.error(e.getMessage());;
		}
		if(atmd == null){
			throw new BankException("No ATM created");
		}
		
		else{
			return new ResponseEntity<ATM>(atmd,HttpStatus.OK);
		}
		
	}
	
	@GetMapping("/addMoneyFromBank/{id}/{amt}")
	public ResponseEntity<ATM> addMoneyFromBank(@PathVariable Integer id , @PathVariable BigDecimal amt) throws BankException
	{
		
		ATM atm = null;
		try {
			atm = atmser.addMoneyFromBank(id, amt);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		if(atm == null)
		{
			throw new BankException("Money not Added");
		}
		else
		{
			return new ResponseEntity<ATM>(atm,HttpStatus.OK);
		}
	}
	
	
	
	
	
	
	
}
