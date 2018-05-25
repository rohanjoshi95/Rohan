package com.testing.dao;

import java.util.List;

import com.testing.model.Bank;

public interface BankDao {

	public int addBank(Bank bank);
	public int updateBank(int bankid,String bankname);
	public int removeBank(int id);
	public List<Bank> viewAllBank();
}
