package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer_spr")
public class Customer 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer customerId;
	
	@Column
	private String customerName;
	
	@Column
	private Integer customerPin;
	
	@ManyToOne(targetEntity = Bank.class)
	private Bank bank;
	
	public Customer() {
		
	}

	/**
	 * @param customerName
	 * @param customerPin
	 * @param bank
	 */
	public Customer(String customerName, Integer customerPin, Bank bank) {
		this.customerName = customerName;
		this.customerPin = customerPin;
		this.bank = bank;
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
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the customerPin
	 */
	public Integer getCustomerPin() {
		return customerPin;
	}

	/**
	 * @param customerPin the customerPin to set
	 */
	public void setCustomerPin(Integer customerPin) {
		this.customerPin = customerPin;
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
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPin=" + customerPin
				+ ", bank=" + bank + "]";
	}

}
