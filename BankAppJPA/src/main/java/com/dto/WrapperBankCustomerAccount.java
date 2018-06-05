package com.dto;

import com.cg.model.Account;
public class WrapperBankCustomerAccount {

	
	private Account account;
	private Integer customerId;
	private Integer bankId;
	
	/**
	 * @param account
	 * @param customerId
	 * @param bankId
	 */
	public WrapperBankCustomerAccount(Account account, Integer customerId, Integer bankId) {
		this.account = account;
		this.customerId = customerId;
		this.bankId = bankId;
	}
	/**
	 * 
	 */
	public WrapperBankCustomerAccount() {
	}
	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}
	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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
		return "WrapperBankCustomerAccount [account=" + account + ", customerId=" + customerId + ", bankId=" + bankId
				+ "]";
	}
	

}
