package com.testing.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private String bankname;
	private List<Customer> customer;
	private Address address;


	public Bank(String bankname, List<Customer> customer, Address address) {
		
		this.bankname = bankname;
		this.customer = customer;
		this.address = address;
	}
	
	public Bank()
	{
		bankname=" HDFC Bank ";
	}

	/**
	 * @return the bankname
	 */
	public String getBankname() {
		return bankname;
	}

	/**
	 * @param bankname the bankname to set
	 */
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	/**
	 * @return the customer
	 */
	public List<Customer> getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Bank [name=" + bankname + ", customer=" + customer + ", address=" + address + "]";
	}
	
	public void display()
	{
		System.out.println(bankname);
		System.out.println("\nCustomers are :");
		customer.stream().forEach((i->{System.out.println(i);}));
	}
	
	
	
	
}
