package com.cg.service;

import com.cg.exception.BankException;
import com.cg.model.Bank;

public interface BankService {

	Bank createBank(Bank bank) throws BankException;
	Bank getBankDetails(Integer id) throws BankException;
	int updateBankAmount(Bank bank) throws BankException;
}
