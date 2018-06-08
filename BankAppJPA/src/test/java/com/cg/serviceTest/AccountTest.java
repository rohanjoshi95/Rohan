package com.cg.serviceTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.exception.BankException;
import com.cg.model.Account;
import com.cg.model.Bank;
import com.cg.model.Customer;
import com.cg.repository.AccountDAO;
import com.cg.repository.BankDAO;
import com.cg.repository.CustomerDAO;
import com.cg.service.AccountServiceImpl;
import com.dto.WrapperBankCustomerAccount;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountTest {
	WrapperBankCustomerAccount wrappBankCustAcc;
	Customer customer;
	Bank bank;
	Account account;
	@Mock
	CustomerDAO custDao;
	
	@Mock
	AccountDAO accountDao;
	
	@Mock
	BankDAO bankDao;
	
	@InjectMocks
	AccountServiceImpl accountser;
	
	@Test
	public void testCreateAccount() throws BankException
	{
		bank = new Bank(1, new BigDecimal(500));
		customer = new Customer(1, "Rohan Joshi", 12345, bank);
		account = new Account(1, new BigDecimal(500), customer, bank);
		wrappBankCustAcc = new WrapperBankCustomerAccount(account, 1, 1);
		final Optional<Customer> tempCustomer = Optional.of(customer);
		when(custDao.findById(1)).thenReturn(tempCustomer);
	    when(accountDao.save(Mockito.any())).thenReturn(wrappBankCustAcc);
	    assertEquals(bank, accountser.createAccount(wrappBankCustAcc).getBank());
	    //System.out.println(bank);
	   // System.out.println(accountser.createAccount(wrappBankCustAcc).getBank());
	}
}
