package com.testing.model;

public class Bank {

	private int bankId;
	private String bankname;
	private Address bankaddressId;
	private int bkaddressId;
	
	/**
	 * @param bankId
	 * @param bankname
	 * @param bkaddressId
	 */
	public Bank(int bankId, String bankname, int bkaddressId) {
		this.bankId = bankId;
		this.bankname = bankname;
		this.bkaddressId = bkaddressId;
	}
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the bankId
	 */
	public int getBankId() {
		return bankId;
	}

	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(int bankId) {
		this.bankId = bankId;
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
	 * @return the bkaddressId
	 */
	public int getBkaddressId() {
		return bkaddressId;
	}

	/**
	 * @param bkaddressId the bkaddressId to set
	 */
	public void setBkaddressId(int bkaddressId) {
		this.bkaddressId = bkaddressId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankname=" + bankname + ", bankaddressId=" + bankaddressId
				+ ", bkaddressId=" + bkaddressId + "]";
	}


	
	
}
