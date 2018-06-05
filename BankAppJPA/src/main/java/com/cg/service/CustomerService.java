package com.cg.service;

import com.cg.exception.BankException;
import com.cg.model.Customer;
import com.dto.WrapperBankCustomer;

public interface CustomerService {

	Customer createCustomer(WrapperBankCustomer wrappcustomer) throws BankException;
	Customer getCustomerDetails(Integer id) throws BankException;
	
}
