package com.testing.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.testing.model.Address;

public class AddressMapper implements RowMapper<Address>{

@Override
public Address mapRow(ResultSet rs, int rowNum) throws SQLException {
	Address address = new Address(rs.getInt("addressId"), rs.getString("zipnumber"), rs.getString("city"), rs.getString("contactnumber"));
	return address;

	}

}