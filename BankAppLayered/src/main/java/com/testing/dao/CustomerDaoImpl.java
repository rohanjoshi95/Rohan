package com.testing.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.testing.model.Customer;

public class CustomerDaoImpl implements CustomerDao{

	
	private JdbcTemplate jdbcTemplate;

	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int addCustomer(Customer cust) {
		String addquery="insert into customer (firstname , lastname , addressId) values('"+cust.getFirstname()+"','"+cust.getLastname()+"','"+cust.getCustAddId()+"')";
		System.out.println(addquery);
		return jdbcTemplate.update(addquery);

	}

	@Override
	public int updateCustomer(int custId, String fname) {
		String upquery ="update customer set firstname = "+"'" + fname +"'" + "where customerId ="+custId;
		System.out.println(upquery);
		return jdbcTemplate.update(upquery);
	}

	@Override
	public int removeCustomer(int id) {
		String remquery = "delete from customer where customerId = " + id;
		System.out.println(remquery); 
		return jdbcTemplate.update(remquery);
	}

	@Override
	public List<Customer> viewAllCustomer() {
		List<Customer> list = jdbcTemplate.query("select * from customer",new CustomerMapper());
		return list;
	}

	
}
