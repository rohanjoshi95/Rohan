package com.testing.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.testing.model.Address;
import com.testing.model.Bank;

public class AddressDaoImpl implements AddressDao{

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
	public int addAddress(Address add) {
		
		final String addquery="insert into address(zipnumber , city , contactnumber) values('"+add.getZipnumber()+"','"+add.getCity()+"','"+add.getContactnumber()+"')";
		System.out.println(addquery);
		return jdbcTemplate.update(addquery);
		
	}

	@Override
	public int updateAddress(int addId,String contno) {
		String upquery="update address set contactnumber="+"'" + contno + "'" + " where addressId = " + addId;
		System.out.println(upquery);
		return jdbcTemplate.update(upquery);
		
	}

	@Override
	public int removeAddress(int id) {
		String remquery="delete from address where addressId = " + id;
		System.out.println(remquery);
		return jdbcTemplate.update(remquery);
	
	}

	@Override
	public List<Address> viewAllAddresses() {
		List<Address> bank = jdbcTemplate.query("select * from address", new AddressMapper());
		return bank;
	}

}
