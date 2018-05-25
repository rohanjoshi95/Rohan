package com.testing.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.testing.model.Customer;

public class CustomerMapper implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer =new Customer(rs.getInt("customerId"),rs.getString("firstname"), rs.getString("lastname"),rs.getInt("addressId"));
		return customer;
	}
	
	
}
