package com.cg.serviceTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Optional;

import org.apache.log4j.Logger;
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
import com.cg.model.Transaction;
import com.cg.repository.AccountDAO;
import com.cg.repository.BankDAO;
import com.cg.repository.CustomerDAO;
import com.cg.service.AccountServiceImpl;
import com.cg.service.TransactionServiceImpl;
import com.dto.WrapperBankCustomerAccount;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountTest {
	public final static Logger LOGGER = Logger.getLogger(AccountTest.class);
	
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
	
	@Mock
	TransactionServiceImpl transser;
	
	@Test
	public void testCreateAccount() throws BankException
	{
		bank = new Bank(1, new BigDecimal(500));
		customer = new Customer(1, "Rohan Joshi", 12345, bank);
		account = new Account(1, new BigDecimal(500), customer, bank);
		wrappBankCustAcc = new WrapperBankCustomerAccount(account, 1, 1);
		final Optional<WrapperBankCustomerAccount> tempCustomer = Optional.of(wrappBankCustAcc);
		System.out.println(tempCustomer);
	    when(accountDao.save(Mockito.any())).thenReturn(wrappBankCustAcc);
	    System.out.println(bank+"  "+ wrappBankCustAcc);
	    assertEquals(bank, accountser.createAccount(wrappBankCustAcc).getBank());
	    
	}
	
	@Test
	public void testDepositMonay() throws BankException
	{
		Integer id = 1;
		BigDecimal amt = new BigDecimal(1000);
		
		bank = new Bank(1, new BigDecimal(500));
		customer = new Customer(1, "Rohan Joshi", 12345, bank);
		account = new Account(1, new BigDecimal(500), customer, bank);
		account.setAmount(account.getAmount().add(amt));
		wrappBankCustAcc = new WrapperBankCustomerAccount(account, 1, 1);
		final Optional<Account> tempCustomer = Optional.of(account);
		when(accountDao.findByAccountId(1)).thenReturn(tempCustomer);
		when(accountDao.save(Mockito.any())).thenReturn(account);
		Transaction trans = new Transaction(account, account.getAmount(), "Deposit");
		assertEquals(1500,transser.createTransaction(trans).getAmount());
		LOGGER.info(trans);
		System.out.println(trans);
		System.out.println(account);
		LOGGER.info(account);
	}
	
	
	
	
	
}
