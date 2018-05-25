package com.testing.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.testing.model.Bank;

public class BankDaoImpl implements BankDao{

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
	public int addBank(Bank bank) {
		String addquery="insert into bank values('"+bank.getBankId()+"','"+bank.getBankname()+"','"+bank.getBkaddressId()+"')";
		System.out.println(addquery);
		return jdbcTemplate.update(addquery);
	}

	@Override
	public int updateBank(int bankid, String bankname) {
		String upquery="update bank set accountnumber="+"'" + bankname + "'" + " where bankId = " + bankid;
		System.out.println(upquery);
		return jdbcTemplate.update(upquery);
		
	}

	@Override
	public int removeBank(int id) {
		String remquery = "delete from bank where bankId = " + id;
		System.out.println(remquery);
		return jdbcTemplate.update(remquery);
	
	}

	@Override
	public List<Bank> viewAllBank() {
		List<Bank> bank = jdbcTemplate.query("select * from bank", new BankMapper());
		return bank;
	}

}
