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
@Table(name = "transaction_spr")
public class Transaction {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(nullable = false )
	private Integer transactionId;
	
	@ManyToOne(targetEntity =Customer.class)
	private Customer customer;
	
	@ManyToOne(targetEntity = Account.class)
	private Account account;
	
	@Column
	private BigDecimal amount;
	
	@Column
	private String transactionType;

	/**
	 * @param transactionId
	 * @param customer
	 * @param account
	 * @param amount
	 * @param transactionType
	 */
	public Transaction(Integer transactionId, Customer customer, Account account, BigDecimal amount,
		String transactionType) {
		this.transactionId = transactionId;
		this.customer = customer;
		this.account = account;
		this.amount = amount;
		this.transactionType = transactionType;
	}

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the transactionId
	 */
	public Integer getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
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
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", customer=" + customer + ", account=" + account
				+ ", amount=" + amount + ", transactionType=" + transactionType + "]";
	}
	

}
