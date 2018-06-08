package com.cg.service;

import com.cg.exception.BankException;

public interface BankDenominationService {
	
	void addDenomination(Integer amount)throws BankException;

}
