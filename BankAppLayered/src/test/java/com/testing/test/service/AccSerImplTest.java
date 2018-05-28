package com.testing.test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testing.model.Account;
import com.testing.service.AccountServiceImpl;

public class AccSerImplTest {

	ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	AccountServiceImpl accser = (AccountServiceImpl) con.getBean("acntser");
	
	@Test
	public void isAddAccount()
	{
		int st = accser.addAccount(new Account("152469", 9));
		assertEquals(1,st);
	}
	@Test
	public void isUpdateAccount()
	{
		int st = accser.updateAccount(4, "909677");
		assertNotEquals(1,st);
	}
	
	@Test
	public void isRemoveAccount()
	{
		int st = accser.removeAccount(7);
		assertNotEquals(1,st);
	}
	@Test
	public void isViewAllAccount()
	{
		List<Account> list = accser.viewAllAccount();
		assertNotEquals(4,list.size());
	}
	
	@Test
	public void isValidateAddress()
	{
		final boolean st = accser.validateAccount(1);
		assertEquals(false,st);
	}
}
