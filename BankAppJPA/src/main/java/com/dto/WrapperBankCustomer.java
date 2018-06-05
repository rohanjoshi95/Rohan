package com.dto;

import com.cg.model.Customer;

public class WrapperBankCustomer {

	private Customer customer;
	private Integer bankId;
	/**
	 * @param customer
	 * @param bankId
	 */
	public WrapperBankCustomer(Customer customer, Integer bankId) {
		this.customer = customer;
		this.bankId = bankId;
	}
	
	public WrapperBankCustomer() {
		
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the bankId
	 */
	public Integer getBankId() {
		return bankId;
	}

	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	@Override
	public String toString() {
		return "WrapperBankCustomer [customer=" + customer + ", bankId=" + bankId + "]";
	}
	
	
}
