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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.ExpectedCount;

import com.cg.exception.BankException;
import com.cg.model.Bank;
import com.cg.model.Customer;
import com.cg.repository.BankDAO;
import com.cg.repository.CustomerDAO;
import com.cg.service.CustomerServiceImpl;
import com.dto.WrapperBankCustomer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerTest {

	WrapperBankCustomer wrapperCust;
	Customer customer;
	Bank bank;
	
	@Mock
	CustomerDAO custDao;
	
	@InjectMocks
	CustomerServiceImpl custService;
	
	@Mock
	BankDAO bankDao;
	
	@Autowired
	Environment environment;
	
	@Test
	public void testCreateCustomer() throws BankException
	{
		bank = new Bank(1, new BigDecimal(500));
		customer = new Customer(1, "Swapnil Kumbhar", 15246, bank);
		wrapperCust = new WrapperBankCustomer(customer,1);
		
		final Optional<Bank> tempBank = Optional.of(bank);
		Mockito.when(bankDao.findByBankId(1)).thenReturn(tempBank);
		
		Mockito.when(custService.createCustomer(wrapperCust)).thenReturn(customer);
		assertEquals("Swapnil Kumbhar",custService.createCustomer(wrapperCust).getCustomerName());
	}
	
	@Test
	public void testGetCustomer() throws BankException
	{
		bank = new Bank(1, new BigDecimal(500));
		customer = new Customer(1, "Rohan Joshi", 15246, bank); 
		Optional<Customer> opCustomer = Optional.of(customer);
		when(custDao.findByCustomerId(Mockito.any())).thenReturn(opCustomer);
		assertEquals("Rohan Joshi", custService.getCustomerDetails(1).getCustomerName());
	}
	
/*	@Test(expected = BankException.class)
	public void testCreateCustomerIfNull() throws BankException
	{
		bank = new Bank(1, new BigDecimal(500));
		customer = new Customer(1, null, 125460, bank);
		wrapperCust = new WrapperBankCustomer(customer, 1);
		
		Mockito.when(custService.createCustomer(wrapperCust)).thenReturn(customer);
		when(custService.createCustomer(wrapperCust)).thenThrow(new BankException("Customer Name cant be null"));
	}
	*/
	
}
