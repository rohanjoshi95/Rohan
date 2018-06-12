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
	
	@Test
	public void testCreateCustomer() throws BankException
	{
		bank = new Bank(1, new BigDecimal(500));
		customer = new Customer(1, "Swapnil Kumbhar", 15246, bank);
		wrapperCust = new WrapperBankCustomer(customer,1);
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
	
	
	
}