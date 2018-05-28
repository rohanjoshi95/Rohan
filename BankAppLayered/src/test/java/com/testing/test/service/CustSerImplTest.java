package com.testing.test.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testing.model.Customer;
import com.testing.service.CustomerServiceImpl;

public class CustSerImplTest {

	ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
	CustomerServiceImpl customerser = (CustomerServiceImpl) con.getBean("custser");
	
	@Test
	public void isAddCustomer()
	{
		int st = customerser.addCustomer(new Customer("Ashish", "Pawar", 7));
		assertEquals(1,st);
	}
	
	@Test
	public void isUpdateCustomer()
	{
		int st = customerser.updateCustomer(8, "Nikam");
		assertNotEquals(1,st);
	}
	
	@Test
	public void isRemoveCustomer()
	{
		int st = customerser.removeCustomer(8);
		assertNotEquals(1,st);
	}
	
	
	@Test
	public void isViewAllCustomer()
	{
		List<Customer> list = customerser.viewAllCustomer();
		assertNotEquals(1,list.size());
	}
	
	
	@Test
	public void isValidateCustomer()
	{
		final boolean st = customerser.validateCustomer(1);
		assertEquals(false,st);
	}
	
}
