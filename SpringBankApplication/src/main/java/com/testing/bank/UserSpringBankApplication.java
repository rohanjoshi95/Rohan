package com.testing.bank;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserSpringBankApplication {
	public static void main(String[] args) {
		
	
	Logger logger=Logger.getLogger("UserSpringBankApplication");
	Scanner scanner = new Scanner(System.in);
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	Customer customer = (Customer) context.getBean("beancustomer");
	customer.show();
	
	Bank bank = (Bank) context.getBean("beanbank");
	bank.display();
	
	Account account;
	int choice;
	do 
	{
		System.out.println("......MENU......");
		System.out.println("1.Saving Account ");
		System.out.println("2.Checking Account ");
		System.out.println("3.Flexible Account ");
		System.out.println("4.Quit ");
		System.out.println("Enter Choice");
		choice=scanner.nextInt();
		
		switch (choice) 
		{
			case 1:
			{
				System.out.println("......SUBMENU......");
				System.out.println("w for cash withdrawal");
				System.out.println("d for cash deposit");
				
				account=new SavingAccount();
				char ch = 'a';
				if(account instanceof SavingAccount)
					{
					ArrayList list = null;
					ch=scanner.next().charAt(0);
						if((ch=='w') || (ch=='W'))
						{
							double withdrawamount;
							logger.log(Level.INFO, "Enter amount for withdrawal");
							withdrawamount=scanner.nextDouble();
							if(withdrawamount < 0)
							{
								logger.log(Level.INFO, "Enter valid amount");
								break;
							}
							else
							{
								list=account.withdraw(withdrawamount);
								ArrayList list1=account.getStatement(list);
								SavingAccount.getBalance();
								System.out.println(list1);
								System.out.println("Cash debited successfuly");
							}
						}
						else if((ch=='d') || (ch=='D'))
						{
							double depositamount;
							logger.log(Level.INFO, "Enter amount for deposit");
							depositamount=scanner.nextDouble();
							if(depositamount < 0)
							{
								logger.log(Level.INFO, "Enter valid amount");
								break;
							}
							else
							{
								list=account.deposit(depositamount);
								ArrayList list1=account.getStatement(list);
								SavingAccount.getBalance();
								System.out.println(list1);
								
							}
						}
					}
				
				break;
			}
			case 2:
			{
				System.out.println("......MENU......");
				System.out.println("w for cash withdrawal");
				System.out.println("d for cash deposit");
				
				account=new CheckingAccount();
				char ch = 'a';
				if(account instanceof CheckingAccount)
					{
					ArrayList list = null;
					ch=scanner.next().charAt(0);
						if((ch=='w') || (ch=='W'))
						{
							double withdrawamount;
							logger.log(Level.INFO, "Enter amount for withdrawal");
							withdrawamount=scanner.nextDouble();
							if(withdrawamount < 0)
							{
								logger.log(Level.INFO, "Enter valid amount");
								break;
							}
							else
							{
								list=account.withdraw(withdrawamount);
								ArrayList list1=account.getStatement(list);
								CheckingAccount.getBalance();
								System.out.println(list1);
								System.out.println("Cash debited successfuly");
							}
						}
						else if((ch=='d') || (ch=='D'))
						{
							double depositamount;
							logger.log(Level.INFO, "Enter amount for deposit");
							depositamount=scanner.nextDouble();
							if(depositamount < 0)
							{
								logger.log(Level.INFO, "Enter valid amount");
								break;
							}
							else
							{
								list=account.deposit(depositamount);
								ArrayList list1=account.getStatement(list);
								CheckingAccount.getBalance();
								System.out.println(list1);
								
							}
						}
						
						
					}
				
				break;
			}
				
			case 3:
			{
				System.out.println("......MENU......");
				System.out.println("w for cash withdrawal");
				System.out.println("d for cash deposit");
				
				account=new FlexibleSavingAccount();
				char ch = 'a';
				if(account instanceof FlexibleSavingAccount)
					{
					ArrayList list = null;
					ch=scanner.next().charAt(0);
						if((ch=='w') || (ch=='W'))
						{
							double withdrawamount;
							logger.log(Level.INFO, "Enter amount for withdrawal");
							withdrawamount=scanner.nextDouble();
							if(withdrawamount < 0)
							{
								logger.log(Level.INFO, "Enter valid amount");
								break;
							}
							else
							{
								list=account.withdraw(withdrawamount);
								ArrayList list1=account.getStatement(list);
								FlexibleSavingAccount.getBalance();
								System.out.println(list1);;
								System.out.println("Cash debited successfuly");
							}
						}
						else if((ch=='d') || (ch=='D'))
						{
							double depositamount;
							logger.log(Level.INFO, "Enter amount for deposit");
							depositamount=scanner.nextDouble();
							if(depositamount < 0)
							{
								logger.log(Level.INFO, "Enter valid amount");
								break;
							}
							else
							{
								list=account.deposit(depositamount);
								ArrayList<Account> list1=account.getStatement(list);
								FlexibleSavingAccount.getBalance();
								System.out.println(list1);;
								
							}
						}
					}
				
				break;
			}
				
			case 4:
				System.out.println("Quit");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Input");
				break;
			}

	}while(choice!=4);	
	scanner.close();
}
}
