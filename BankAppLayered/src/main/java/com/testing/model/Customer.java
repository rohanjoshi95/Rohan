package com.testing.model;

public class Customer {

	private int customerId;
	private String firstname;
	private String 	lastname;
	private Address custaddress;
	private int custaddId;
	/**
	 * @param customerId
	 * @param firstname
	 * @param lastname
	 * @param custId
	 */
	public Customer(int customerId, String firstname, String lastname, int custId) {
		this.customerId = customerId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.custaddId = custId;
	}
	
	public Customer( String firstname, String lastname, int custaddId) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.custaddId = custaddId;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	 * @return the custaddress
	 */
	public Address getCustaddress() {
		return custaddress;
	}
	/**
	 * @param custaddress the custaddress to set
	 */
	public void setCustaddress(Address custaddress) {
		this.custaddress = custaddress;
	}
	/**
	 * @return the custId
	 */
	public int getCustAddId() {
		return custaddId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustAddId(int custId) {
		this.custaddId = custId;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", custaddress=" + custaddress + ", custaddId=" + custaddId + "]";
	}
	
	
	
	
		
	
}
