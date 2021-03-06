package com.testing.bank;

import java.util.ArrayList;

public interface Account {
	
	public ArrayList withdraw(double amount);  //method withdraw for withdrawing money from account 
	public ArrayList deposit(double amount);  //method deposit for crediting money in the account 
	public ArrayList<Account> getStatement(ArrayList list); //method getStatement for checking balance 
}
