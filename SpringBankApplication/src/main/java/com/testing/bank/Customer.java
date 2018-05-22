package com.testing.bank;


public class Customer {

	private String firstname;
	private String lastname;
	private Address address;
	
	/**
	 * @param firstname
	 * @param lastname
	 * @param account
	 * @param address
	 */
	public Customer(String firstname, String lastname,  Address address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}
	
	
	public Customer() {
		
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
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


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + "]";
	}
	
	void show()
	{
		System.out.println("Customer Name :"+firstname+" "+lastname);
		System.out.println(address.toString());
	}
	
	
}
