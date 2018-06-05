package com.cg.service;

import java.math.BigDecimal;


import com.cg.exception.BankException;
import com.cg.model.Account;
import com.dto.WrapperBankCustomerAccount;

public interface AccountService {

	Account createAccount(WrapperBankCustomerAccount wrappbkcusacc)throws BankException;
	Account depositeMoney(Integer id,BigDecimal amt)throws BankException;
	Account withdrawMoney(Integer id,BigDecimal amt)throws BankException;
	Account getAccountDetails(Integer id)throws BankException;

}
