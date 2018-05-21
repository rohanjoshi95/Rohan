package study.bankapplication;

import java.util.ArrayList;

public interface Account { //Interface Account has three implementable methods

	public ArrayList withdraw(double amount);  //method withdraw for withdrawing money from account 
	public ArrayList deposit(double amount);  //method deposit for crediting money in the account 
	public ArrayList<Account> getStatement(ArrayList list); //method getStatement for checking balance 
	
}
