package com.testing.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.testing.model.Account;

public class AccountMapper implements RowMapper<Account>{

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Account account = new Account(rs.getInt("accountId"),rs.getString("accountnumber"),rs.getInt("customerId"));
		return account;
	}

	
	
}
