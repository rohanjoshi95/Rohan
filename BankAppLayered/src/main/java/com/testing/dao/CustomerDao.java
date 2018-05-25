package com.testing.dao;

import java.util.List;

import com.testing.model.Customer;

public interface CustomerDao {

	public int addCustomer(Customer cust);
	public int updateCustomer(int custId,String fname);
	public int removeCustomer(int id);
	public List<Customer> viewAllCustomer();
}
