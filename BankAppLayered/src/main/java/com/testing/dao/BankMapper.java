package com.testing.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.testing.model.Bank;

public class BankMapper implements RowMapper<Bank>{

	@Override
	public Bank mapRow(ResultSet rs, int rowNum) throws SQLException {
		Bank bank = new Bank(rs.getInt("bankId"), rs.getString("bankname"), rs.getInt("addressId"));
		return bank;
	}

}
