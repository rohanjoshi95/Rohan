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
	@SuppressWarnings("resource")
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	Customer customer = (Customer) context.getBean("beancustomer");
	Customer customer1 = (Customer) context.getBean("beancustomer1");
	
	Address add = (Address) context.getBean("beanaddress");
	Address add1 = (Address) context.getBean("beanrashmiaddress");
	
	customer.setFirstname("Rohan");
	customer.setLastname("Joshi");
	add.setStreet("Wakan Road");
	add.setHousenumber("24/1/2B");
	add.setZipnumber("415110");
	add.setCity("Karad");
	add.setContactnumber("9096770545");
	add.setEmail("rmj.rohan95@gmail.com");
	customer.setAddress(add);
	
	
	customer1.setFirstname("Ruchita");
	customer1.setLastname("Kamble");
	add1.setStreet("MG Road");
	add1.setHousenumber("24/1/2C");
	add1.setZipnumber("429110");
	add1.setCity("Nagpur");
	add1.setContactnumber("9096770546");
	add1.setEmail("ruchita.kamble@gmail.com");
	customer1.setAddress(add1);
	
	customer.show();
	customer1.show();
	
	Account account;
	int choice;
	do 
	{
		System.out.println("......MENU......");
		System.out.println("1.Saving Account ");
		System.out.println("2.Checking Account ");
		System.out.println("3.Flexible Account ");
		System.out.println("4.Show all customers");
		System.out.println("5.Quit ");
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
					ArrayList<?> list = null;
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
								ArrayList<?> list1=account.getStatement(list);
								CheckingAccount.getBalance();
								System.out.println(list1);
								
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
								ArrayList<?> list1=account.getStatement(list);
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
					ArrayList<?> list = null;
					ch=scanner.next().charAt(0);
						if((ch=='w') || (ch=='W'))
						{
							double withdrawamount;
							logger.log(Level.INFO, "Enter amount for withdrawal");
							withdrawamount=scanner.nextDouble();
							try {
							if(withdrawamount < 0)
							{
								//logger.log(Level.INFO, "Enter valid amount");
								throw new InvalidAmountException("Enter valid amount");
							}
							else
							{
								list=account.withdraw(withdrawamount);
								ArrayList<?> list1=account.getStatement(list);
								FlexibleSavingAccount.getBalance();
								System.out.println(list1);;
								
							}
							}catch (Exception e) {
								System.out.println("");
								System.out.println(e.getMessage());
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
				Bank bank = (Bank) context.getBean("beanbank");
				bank.display();
				break;
			case 5:
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
