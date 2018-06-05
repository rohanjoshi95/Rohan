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
@Table(name = "ATM_spr")
public class ATM {

	@Id
	@Column(nullable =false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ATMId;
	
	@Column
	private BigDecimal atmamount;

	@ManyToOne(targetEntity = Bank.class)
	private Bank bank;

	public ATM() {
		
	}

	/**
	 * @param aTMId
	 * @param atmamount
	 * @param bank
	 */
	public ATM(Integer ATMId, BigDecimal atmamount, Bank bank) {
		this.ATMId = ATMId;
		this.atmamount = atmamount;
		this.bank = bank;
	}

	/**
	 * @return the ATMId
	 */
	public Integer getATMId() {
		return ATMId;
	}

	/**
	 * @param ATMId the ATMId to set
	 */
	public void setATMId(Integer ATMId) {
		this.ATMId = ATMId;
	}

	/**
	 * @return the atmamount
	 */
	public BigDecimal getAtmamount() {
		return atmamount;
	}

	/**
	 * @param atmamount the atmamount to set
	 */
	public void setAtmamount(BigDecimal atmamount) {
		this.atmamount = atmamount;
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
		return "ATM [ATMId=" + ATMId + ", atmamount=" + atmamount + ", bank=" + bank + "]";
	}

	
}
