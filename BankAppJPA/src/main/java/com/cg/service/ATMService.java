package com.cg.service;

import java.math.BigDecimal;

import com.cg.exception.BankException;
import com.cg.model.ATM;
import com.dto.WrapperBankATM;

public interface ATMService {

	ATM createATM(WrapperBankATM wrappatm) throws BankException;
	ATM addMoneyFromBank(Integer id,BigDecimal amt) throws BankException;
}
