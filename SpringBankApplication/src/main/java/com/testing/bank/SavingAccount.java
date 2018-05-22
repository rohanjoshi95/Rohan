package com.testing.bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

public class SavingAccount implements Account{

Logger logger=Logger.getLogger("SavingAccount");
	
	private static double balance;
	private double interestrate;
	private double period;

	/**
	 * @param balance
	 * @param interestrate
	 * @param period
	 */
	public SavingAccount(double balance, double interestrate, double period) {
		this.balance = balance;
		this.interestrate = interestrate;
		this.period = period;
	}

	public SavingAccount()
	{
		interestrate=10;
		balance=1000;
	}
	
	
	/**
	 * @return the balance
	 */
	public static double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the interestrate
	 */
	public double getInterestrate() {
		return interestrate;
	}

	/**
	 * @param interestrate the interestrate to set
	 */
	public void setInterestrate(double interestrate) {
		this.interestrate = interestrate;
	}

	/**
	 * @return the period
	 */
	public double getPeriod() {
		return period;
	}

	/**
	 * @param period the period to set
	 */
	public void setPeriod(double period) {
		this.period = period;
	}



	@Override
	public ArrayList<Date> withdraw(double amount) {
		
		
		if((balance > 0) && (balance > amount))
		{
			balance=balance-amount;
			System.out.println("Cash credited successfuly");
		}
		else
		{
			System.out.println("Insufficient balance");
			balance=balance;
		}
		Date date=new Date();
		ArrayList<Date> list=new ArrayList<Date>();
		list.add(date);
		System.out.println("Available balance :" +balance);
		return list;
	}

	@Override
	public ArrayList<Object> deposit(double amount) {
		
		if(amount > 0)
		{
			balance=balance+amount;
		}
		else
		{
			System.out.println("Amount should be more than zero :" +balance);
			balance = balance;
		}
		Date date =new Date();
		ArrayList<Object> list=new ArrayList<>();
		list.add(date);
		System.out.println("Available balance :" +balance);
		return list;
	}

	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", interestrate=" + interestrate + ", period=" + period + "]";
	}

	@Override
	public ArrayList<Account> getStatement(ArrayList list) {
		
		ArrayList arraylist=new ArrayList();
		arraylist.add(list);
		return arraylist;
	}


}
