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
import com.cg.service.BankServiceImpl;
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
	Transaction trans;
	
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
	
	@Mock
	BankServiceImpl bankser;
	
	@Test
	public void testCreateAccount() throws BankException
	{
		bank = new Bank(1, new BigDecimal(500));
		customer = new Customer(1, "Rohan Joshi", 12345, bank);
		account = new Account(1, new BigDecimal(500), customer, bank);
		wrappBankCustAcc = new WrapperBankCustomerAccount(account, 1, 1);
		//final Optional<WrapperBankCustomerAccount> tempCustomer = Optional.of(wrappBankCustAcc);
		
		final Optional<Bank> tempBank = Optional.of(bank);
		Mockito.when(bankDao.findByBankId(1)).thenReturn(tempBank);
		
		final Optional<Customer> tempCustomerOne = Optional.of(customer);
		Mockito.when(custDao.findByCustomerId(1)).thenReturn(tempCustomerOne);
		
		Mockito.when(accountser.createAccount(wrappBankCustAcc)).thenReturn(account);
	    assertEquals(bank, accountser.createAccount(wrappBankCustAcc).getBank());
	    
	}
	@Test
	public void testGetAccount()throws BankException
	{
		bank = new Bank(1, new BigDecimal(500));
		customer = new Customer(1, "Rohan Joshi", 152364, bank);
		account = new Account(1, new BigDecimal(500), customer, bank);
		Optional<Account> tempAccount = Optional.of(account);
		
		when(accountDao.findByAccountId(Mockito.any())).thenReturn(tempAccount);
		assertEquals("Rohan Joshi",accountser.getAccountDetails(1).getCustomer().getCustomerName());
	}
	
	@Test
	public void testDepositMonay() throws BankException
	{
		Integer Id = 1;
		BigDecimal amt = new BigDecimal(5000);
		bank = new Bank(1, new BigDecimal(10000));
		customer = new Customer(1, "Rohan Joshi", 152364, bank);
		account = new Account(1, new BigDecimal(5000), customer, bank); 
		wrappBankCustAcc = new WrapperBankCustomerAccount(account, 1, 1);
		
		final Optional<Bank> tempBank = Optional.of(bank);
		Mockito.when(bankDao.findByBankId(1)).thenReturn(tempBank);
		
		final Optional<Customer> tempCustomerOne = Optional.of(customer);
		Mockito.when(custDao.findByCustomerId(1)).thenReturn(tempCustomerOne);
		
		Mockito.when(accountser.createAccount(wrappBankCustAcc)).thenReturn(account);
		
		final Optional<Account> tempAccountOne = Optional.of(account);
		Mockito.when(accountDao.findByAccountId(Id)).thenReturn(tempAccountOne);
		Mockito.when(transser.createTransaction(trans)).thenReturn(trans);

		Mockito.when(bankser.updateBankAmount(bank)).thenReturn(1);
		assertEquals(new BigDecimal(15000),accountser.depositeMoney(Id, amt).getBank().getAmount());
	}
	
	@Test
	public void testWithdrawMonay() throws BankException
	{
		Integer Id = 1;
		BigDecimal amt = new BigDecimal(2000);
		bank = new Bank(1, new BigDecimal(10000));
		customer = new Customer(1, "Rohan Joshi", 152364, bank);
		account = new Account(1, new BigDecimal(5000), customer, bank); 
		wrappBankCustAcc = new WrapperBankCustomerAccount(account, 1, 1);
		
		final Optional<Bank> tempBank = Optional.of(bank);
		Mockito.when(bankDao.findByBankId(1)).thenReturn(tempBank);
		
		final Optional<Customer> tempCustomerOne = Optional.of(customer);
		Mockito.when(custDao.findByCustomerId(1)).thenReturn(tempCustomerOne);
		
		Mockito.when(accountser.createAccount(wrappBankCustAcc)).thenReturn(account);
		
		final Optional<Account> tempAccountOne = Optional.of(account);
		Mockito.when(accountDao.findByAccountId(Id)).thenReturn(tempAccountOne);
		Mockito.when(transser.createTransaction(trans)).thenReturn(trans);

		Mockito.when(bankser.updateBankAmount(bank)).thenReturn(1);
		assertEquals(new BigDecimal(8000),accountser.withdrawMoney(Id, amt).getBank().getAmount());
	}
	
	
	
}
