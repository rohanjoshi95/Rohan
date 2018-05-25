                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     package study.bankapplication;

import java.util.List;

/**
 * @author Rohan Joshi
 *
 */
public class Bank extends Address{

	private String bankname;
	private List<Customer> customer;
	private Address address;


	public Bank(String bankname, List<Customer> customer, Address address) {
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

	
	
}
