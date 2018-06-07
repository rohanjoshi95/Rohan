package com.cg.service;

import java.math.BigDecimal;

import com.cg.exception.BankException;

public interface BankDenominationService {
	
	void addDenomination(Integer amount)throws BankException;

}
