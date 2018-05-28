package com.testing.model;

public class Account {

	private int accountId;
	private String acntnumber;
	private Customer acntcustomer;
	private int customerId;
	/**
	 * @param accountId
	 * @param acntnumber
	 * @param customerId
	 */
	public Account(int accountId, String acntnumber, int customerId) {
		this.accountId = accountId;
		this.acntnumber = acntnumber;
		this.customerId = customerId;
	}
	
	public Account( String acntnumber, int customerId) {
		
		this.acntnumber = acntnumber;
		this.customerId = customerId;
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the accountId
	 */
	public int getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	/**
	 * @return the acntnumber
	 */
	public String getAcntnumber() {
		return acntnumber;
	}
	/**
	 * @param acntnumber the acntnumber to set
	 */
	public void setAcntnumber(String acntnumber) {
		this.acntnumber = acntnumber;
	}
	/**
	 * @return the acntcustomer
	 */
	public Customer getAcntcustomer() {
		return acntcustomer;
	}
	/**
	 * @param acntcustomer the acntcustomer to set
	 */
	public void setAcntcustomer(Customer acntcustomer) {
		this.acntcustomer = acntcustomer;
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
	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", acntnumber=" + acntnumber + ", acntcustomer=" + acntcustomer
				+ ", customerId=" + customerId + "]";
	}
	
	

	
}
