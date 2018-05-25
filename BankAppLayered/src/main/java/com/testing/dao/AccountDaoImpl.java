package com.testing.dao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import com.testing.model.Account;

public class AccountDaoImpl implements AccountDao{

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

	/**
	 * addAccount method for inserting Account details 
	 */
	@Override
	public int addAccount(Account acnt) {
		String addquery="insert into account values('"+acnt.getAccountId()+"','"+acnt.getAcntnumber()+"','"+acnt.getCustomerId()+"')";
		System.out.println(addquery);
		return jdbcTemplate.update(addquery);
	
	}

	/**
	 * updateAccount method for updating Account details 
	 */
	@Override
	public int updateAccount(int acntId, String acntno) {
		String upquery="update account set accountnumber="+"'" + acntno + "'" + " where accountId = " + acntId;
		System.out.println(upquery);
		return jdbcTemplate.update(upquery);

	}

	/**
	 * removeAccount method for removing Account from table 
	 */
	@Override
	public int removeAccount(int id) {
		String remquery = "delete from account where accountId = " + id;
		System.out.println(remquery);
		return jdbcTemplate.update(remquery);
	
	}

	@Override
	public List<Account> viewAllAccount() {
		List<Account> list = jdbcTemplate.query("select * from account", new AccountMapper());
		return list;
	}



}
