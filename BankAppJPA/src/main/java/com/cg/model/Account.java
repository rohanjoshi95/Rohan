package com.cg.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account_spr")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer accountId;
	@Column
	private BigDecimal amount;
	
	@ManyToOne(targetEntity = Customer.class)
	private Customer customer;
	
	@ManyToOne(targetEntity = Bank.class)
	private Bank bank;

	/**
	 * @param accountId
	 * @param amount
	 * @param customer
	 * @param bank
	 */
	public Account(Integer accountId, BigDecimal amount, Customer customer, Bank bank) {
		this.accountId = accountId;
		this.amount = amount;
		this.customer = customer;
		this.bank = bank;
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the accountId
	 */
	public Integer getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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
	 * @return the bank
	 */
	public Bank getBank() {
		return bank;
	}

	/**
	 * @param bank the bank to set
	 */
	public void setBank(Bank bank) {
		this.bank = bank;
	}

	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", amount=" + amount + ", customer=" + customer + ", bank=" + bank
				+ "]";
	}
	
	
}
