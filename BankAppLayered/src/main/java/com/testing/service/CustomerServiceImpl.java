package com.testing.service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.testing.dao.CustomerDaoImpl;
import com.testing.model.Customer;

public class CustomerServiceImpl implements CustomerService{
	static Logger logger = Logger.getLogger("CustomerServiceImpl");
	static ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
	static CustomerDaoImpl custdao=(CustomerDaoImpl) con.getBean("custdao");
	
	@Override	
	public int addCustomer(Customer cust) {

		int addData=custdao.addCustomer(cust);
		if(addData > 0)
		{
			System.out.println("Data inserted successfuly");
		}
		else
		{
			System.out.println("Insertion failed");
		}
		return addData;
	}

	@Override
	public int updateCustomer(int custId,String lastname) {
		int updateData = custdao.updateCustomer(custId,lastname);
		if(updateData > 0)
		{
			System.out.println("Data updated successfuly");
		}
		else
		{
			System.out.println("Updation failed");
		}
		return updateData;
	}

	@Override
	public int removeCustomer(int custId) {
		int removeData = custdao.removeCustomer(custId);
		if(removeData > 0)
		{
			System.out.println("Data deletion successfuly");
		}
		else
		{
			System.out.println("Deletion failed");
		}
		return removeData;
	}

	public List<Customer> viewAllCustomer() {
		List<Customer> list =  custdao.viewAllCustomer();
		if(!list.isEmpty())
		{
		list.stream().forEach((i->{System.out.println(i);}));
		}
		return list;
	}
	
	public boolean validateCustomer(int id)
	{
		CustomerServiceImpl asimpl = (CustomerServiceImpl) con.getBean("custser");
		List<Customer> list = asimpl.viewAllCustomer();
		logger.log(Level.INFO, "Enter Id number");
		for (Customer customer : list) {
			if (id == customer.getCustomerId()) {
				return true;
			}
			return false;
		}
		return false; 
	}

}
