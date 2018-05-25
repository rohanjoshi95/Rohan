package com.testing.service;
import java.util.List;
import com.testing.model.Bank;

/**
@author Rohan Joshi
*Interface BankService contains all CRUD methods for bank database
* */
public interface BankService {

	/**
	 * addBank method for adding bank into database
	 * */
	int addBank(Bank bank); 
	/**
	 * updateBank method for updating bank into database
	 * */
	int updateBank(int bankId,String bankname);
	/**
	 * removeBank method for removing bank into database
	 * */
	int removeBank(int bankId);
	/**
	 * viewAllBank method for viewing all banks from database
	 * */
	List<Bank> viewAllBank();
}
