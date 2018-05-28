package com.testing.test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testing.model.Bank;
import com.testing.model.Customer;
import com.testing.service.BankServiceImpl;

public class BankSerImplTest {

	
	ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
	BankServiceImpl bkser = (BankServiceImpl) con.getBean("bankser");
	
	@Test
	public void isAddBank()
	{
		int st = bkser.addBank(new Bank("Kotak Bank", 14));
		assertEquals(1,st);
	}
	
	@Test
	public void isUpdateBank()
	{
		int st = bkser.updateBank(3, "Axis Bank");
		assertNotEquals(1,st);
	}
	
	@Test
	public void isRemoveBank()
	{
		int st = bkser.removeBank(1);
		assertEquals(1,st);
	}
	
	
	@Test
	public void isViewAllBank()
	{
		List<Bank> list = bkser.viewAllBank();
		assertEquals(2,list.size());
	}
	
	
	@Test
	public void isValidateBank()
	{
		final boolean st = bkser.validateBank(1);
		assertEquals(false,st);
	}
}
