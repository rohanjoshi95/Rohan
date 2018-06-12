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
import com.cg.repository.BankDAO;
import com.cg.service.BankServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BankTest {

	Bank bank;
	
	@Mock
	BankDAO bankDao;

	
	@InjectMocks
	BankServiceImpl bankService;
	
	@Test
	public void testCreateank() throws BankException
	{
		bank=new Bank(1,new BigDecimal(10));
		when(bankDao.save(Mockito.any(Bank.class))).thenReturn(bank);
		assertEquals(bank, bankService.createBank(bank));
	}
	
	@Test
	public void testGetBank() throws BankException
	{
		bank = new Bank();
		bank.setAmount(new BigDecimal(100));
		bank.setBankId(1);
		Optional<Bank> opBank = Optional.of(bank);
		when(bankDao.findByBankId(Mockito.any())).thenReturn(opBank);
		assertEquals(new BigDecimal(100), bankService.getBankDetails(1).getAmount());
	}

}
