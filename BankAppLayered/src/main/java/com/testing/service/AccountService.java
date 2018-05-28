package com.testing.service;
import java.util.List;
import com.testing.model.Account;

/**
@author Rohan Joshi
*Interface AccountService contains all CRUD methods
* */
public interface AccountService {

	/**
	 * addAccount method for calling addAccount method of AccountDaoImpl class 
	 * */
	int addAccount(Account account);
	/**
	 * updateAccount method for calling updateAccount method of CustomerDaoImpl class 
	 * */
	int updateAccount(int custId,String acntno);
	/**
	 * removeAccount method for calling removeAccount method of CustomerDaoImpl class 
	 * */
	int removeAccount(int acntId);
	/**
	 * viewAllAccount method for calling viewAllAccount method of CustomerDaoImpl 
	 * class 
	 * */
	List<Account> viewAllAccount();
	 /**
	 * To validate account
	 * */
	 boolean validateAccount(int id);
}
