package com.testing.dao;

import java.util.List;

import com.testing.model.Account;

public interface AccountDao {

	 int addAccount(Account acnt);
	 int updateAccount(int acntId,String acntno);
	 int removeAccount(int id);
	 List<Account> viewAllAccount();
}
