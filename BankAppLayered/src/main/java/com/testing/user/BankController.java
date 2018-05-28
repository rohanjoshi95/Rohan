package com.testing.user;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.testing.model.Account;
import com.testing.model.Address;
import com.testing.model.Bank;
import com.testing.model.Customer;
import com.testing.service.AccountServiceImpl;
import com.testing.service.AddressServiceImpl;
import com.testing.service.BankServiceImpl;
import com.testing.service.CustomerServiceImpl;

public class BankController {
	
    
	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("BankController");
		Scanner scan = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		final AddressServiceImpl addrserimpl = (AddressServiceImpl) context.getBean("addser");
		final CustomerServiceImpl custserimpl = (CustomerServiceImpl) context.getBean("custser");
		final BankServiceImpl bkserimpl = (BankServiceImpl) context.getBean("bankser");
		final AccountServiceImpl acntserimpl = (AccountServiceImpl) context.getBean("acntser");
		
		final Address add = (Address) context.getBean("addr");
		final Customer cust = (Customer) context.getBean("cust");
		final Bank bank = (Bank) context.getBean("bank");
		final Account acnt =(Account) context.getBean("acnt");
		
		int choice;
		do {
			
			System.out.println("......MENU......");
			System.out.println("1.For Bank");
			System.out.println("2.For Customer");
			System.out.println("3.For Address");
			System.out.println("4.Account");
			System.out.println("5.Exit");
			System.out.println("Enter choice");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Welcome to the bank");
				int innerchoice = 0;
				do {
					
					System.out.println("....SUBMENU....");
					System.out.println("1.Create bank");
					System.out.println("2.Update bank");
					System.out.println("3.Delete bank");
					System.out.println("4.View all banks");
					System.out.println("5.Exit");
					System.out.println("Enter innerchoice");
					innerchoice = scan.nextInt();
					switch (innerchoice) {
					case 1:
						bank.setBankname("HDFC Bank");
						bank.setBkaddressId(1);
						bkserimpl.addBank(bank);
					break;
					case 2:
						bkserimpl.updateBank(1, "Axis bank");
					break;
					case 3:
						System.out.println("Enter BankId to remove");
						int id = scan.nextInt();
						boolean test = bkserimpl.validateBank(id);
						if (test) {
							bkserimpl.removeBank(id);
						}
						else
						{
							logger.log(Level.INFO,"Invalid Bank");	
						}
					break;
					case 4:
						bkserimpl.viewAllBank();
					break;
					case 5:
						System.out.println("Exit");
					default:
						System.out.println("Invalid operation");
					break;
					}
					
				} while (innerchoice != 5);
				break;
			case 2:
				System.out.println("Welcome to the customer");
				int innerchoice1 = 0;
				do {
					System.out.println("....SUBMENU....");
					System.out.println("1.Create customer");
					System.out.println("2.Update customer");
					System.out.println("3.Delete customer");
					System.out.println("4.View all customer");
					System.out.println("5.Exit");
					System.out.println("Enter innerchoice");
					innerchoice1 = scan.nextInt();
					switch (innerchoice1) {
					case 1:
						cust.setFirstname("Rohan");
						cust.setLastname("Joshi");
						cust.setCustAddId(1);
						custserimpl.addCustomer(cust);
					break;
					case 2:
						custserimpl.updateCustomer(1, "Nikam");
					break;
					case 3:
						System.out.println("Enter customerId to remove");
						int id = scan.nextInt();
						boolean test = custserimpl.validateCustomer(id);
						if (test == true) 
						{
							custserimpl.removeCustomer(id);
						}
						else
						{
							logger.log(Level.INFO,"Invalid Customer");	
						}
					break;
					case 4:				
							custserimpl.viewAllCustomer();
					break;
					case 5:
						System.out.println("Exit");
					default:
						System.out.println("Invalid operation");
					break;
					}
					
				} while (innerchoice1 != 5);
				break;
			case 3:
				System.out.println("Welcome to the address");
				int innerchoice2 = 0;
				do {
					System.out.println("....SUBMENU....");
					System.out.println("1.Create address");
					System.out.println("2.Update address");
					System.out.println("3.Delete address");
					System.out.println("4.View all address");
					System.out.println("5.Exit");
					System.out.println("Enter innerchoice");
					innerchoice2 = scan.nextInt();
					switch (innerchoice2) {
					case 1:
						add.setZipnumber("415110");
						add.setCity("Karad");
						add.setContactnumber("9096770545");
						addrserimpl.addAddress(add);
					break;
					case 2:
						addrserimpl.updateAddress(1, "9096770516");
					break;
					case 3:
						System.out.println("Enter addressId to remove");
						int id = scan.nextInt();
						boolean test = addrserimpl.validateAddress(id);
						if (test == true) 
						{
							addrserimpl.removeAddress(id);
						}
						else
						{
							logger.log(Level.INFO,"Invalid Address");	
						}
					break;
					case 4:
						addrserimpl.viewAllAddress();
					break;
					case 5:
						System.out.println("Exit");
					default:
						System.out.println("Invalid operation");
					break;
				
					}
					
				} while (innerchoice2 != 5);
				break;
			case 4:
				System.out.println("Welcome to the account");
				int innerchoice3 = 0;
				do {
					System.out.println("....SUBMENU....");
					System.out.println("1.Create account");
					System.out.println("2.Update account");
					System.out.println("3.Delete account");
					System.out.println("4.View all account");
					System.out.println("5.Exit");
					System.out.println("Enter innerchoice");
					innerchoice3 = scan.nextInt();
					switch (innerchoice3) {
					case 1:
						acnt.setAcntnumber("154628");
						acnt.setCustomerId(1);
						acntserimpl.addAccount(acnt);
					break;
					case 2:
						acntserimpl.updateAccount(1, "265948");
					break;
					case 3:
						System.out.println("Enter accountId to remove");
						int id = scan.nextInt();
						final boolean test = acntserimpl.validateAccount(id);
						if (test) 
						{
							acntserimpl.removeAccount(id);
						}
						else
						{
							logger.log(Level.INFO,"Invalid Account");	
						}
					break;
					case 4:
						acntserimpl.viewAllAccount();
					break;
					case 5:
						System.out.println("Exit");
					default:
						System.out.println("Invalid operation");
					break;
					}
					
				} while (innerchoice3 != 5);
				break;
			case 5:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
	
		} while (choice != 5);
		
	}
	
}
