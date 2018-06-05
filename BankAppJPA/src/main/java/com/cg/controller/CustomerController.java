package com.cg.controller;

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
import com.cg.model.Customer;
import com.cg.service.CustomerServiceImpl;
import com.dto.WrapperBankCustomer;

@RestController
public class CustomerController {

	final Logger LOGGER = Logger.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerServiceImpl custser;
	
	@PostMapping(value = "/createCustomer")
	public ResponseEntity<Customer> createCustomer(@RequestBody WrapperBankCustomer wrappcustomer) throws BankException
	{
		Customer custData = null;
		try {
			custData = custser.createCustomer(wrappcustomer);
		} catch (BankException e) 
		{
		LOGGER.error(e.getMessage());	
		}
		if(custData == null)
		{
			throw new BankException("Customer Not Added");
		}
		else
		{
			return new ResponseEntity<Customer>(custData,HttpStatus.OK);
		}
	}
	
	
	@GetMapping(value = "/getCustomer/{id}")
	public ResponseEntity<Customer> getCustomerDetails(@PathVariable Integer id) throws BankException
	{
		
		Customer custData = null;
		try {
			custData = custser.getCustomerDetails(id);
			System.out.println(custData);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	if(custData == null )
	{
		throw new BankException("No details found");
	}
	else
	{
		return new ResponseEntity<Customer>(custData ,HttpStatus.OK); 
	}
	}
	
}
