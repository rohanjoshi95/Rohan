package study.bankapplication;

import java.awt.List;
import java.util.ArrayList;

/**
 * @author Rohan Joshi
 *
 */
public class Bank extends Address{

	private String bankname;
	ArrayList<Customer> customer;
	Address address;


	public Bank(String bankname, ArrayList<Customer> customer, Address address) {
		super();
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
	public ArrayList<Customer> getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(ArrayList<Customer> customer) {
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

	
	
	
	
}
