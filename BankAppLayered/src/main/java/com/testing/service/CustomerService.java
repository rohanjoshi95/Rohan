package com.testing.service;
import java.util.List;
import com.testing.model.Customer;

/**
@author Rohan Joshi
*Interface CustomerService contains all CRUD methods
* */
public interface CustomerService {
	
	/**
	 * addCustomer method for calling addCustomer method of CustomerDaoImpl 
	 * class 
	 * */
	int addCustomer(Customer cust);
	/**
	 * updateCustomer method for calling updateCustomer method of CustomerDaoImpl 
	 * class 
	 * */
	int updateCustomer(int custId,String lastname);
	/**
	 * removeCustomer method for calling removeCustomer method of CustomerDaoImpl 
	 * class 
	 * */
	int removeCustomer(int custId);
	/**
	 * viewAllCustomer method for calling viewAllCustomer method of CustomerDaoImpl 
	 * class 
	 * */
	List<Customer> viewAllCustomer();
	
}
