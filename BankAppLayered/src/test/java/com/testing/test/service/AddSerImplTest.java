package com.testing.test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testing.model.Address;
import com.testing.service.AddressServiceImpl;

public class AddSerImplTest {

	ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
	AddressServiceImpl addser = (AddressServiceImpl) con.getBean("addser");
	
	@Test
	public void isAddAddress()
	{
		int st = addser.addAddress(new Address("415220", "Kolhapur", "9096550454"));
		assertEquals(1,st);
	}
	
	@Test
	public void isUpdateAddress()
	{
		int st = addser.updateAddress(5, "9096777545");
		assertEquals(1,st);
	}
	
	@Test
	public void isRemoveAddress()
	{
		int st = addser.removeAddress(11);
		assertNotEquals(1,st);
	}
	@Test
	public void isViewAllAddress()
	{
		List<Address> list = addser.viewAllAddress();
		assertNotEquals(5,list.size());
	}
	
	@Test
	public void isValidateAddress()
	{
		final boolean st = addser.validateAddress(1);
		assertEquals(false,st);
	}
		
}
