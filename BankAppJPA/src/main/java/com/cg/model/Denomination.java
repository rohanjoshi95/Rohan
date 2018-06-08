package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "denomination_spr")
public class Denomination {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer denominationId;
	@OneToOne(targetEntity = Bank.class)
	private Bank bank;
	@Column
	private Integer noOfDenomination;
	@Column
	private Integer denomination;
	
	public Denomination() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param denominationId
	 * @param bank
	 * @param noOfDenomination
	 * @param denomination
	 */
	public Denomination(Integer denominationId, Bank bank, Integer noOfDenomination, Integer denomination) {
		this.denominationId = denominationId;
		this.bank = bank;
		this.noOfDenomination = noOfDenomination;
		this.denomination = denomination;
	}

	/**
	 * @return the denominationId
	 */
	public Integer getDenominationId() {
		return denominationId;
	}

	/**
	 * @param denominationId the denominationId to set
	 */
	public void setDenominationId(Integer denominationId) {
		this.denominationId = denominationId;
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

	/**
	 * @return the noOfDenomination
	 */
	public Integer getNoOfDenomination() {
		return noOfDenomination;
	}

	/**
	 * @param noOfDenomination the noOfDenomination to set
	 */
	public void setNoOfDenomination(Integer noOfDenomination) {
		this.noOfDenomination = noOfDenomination;
	}

	/**
	 * @return the denomination
	 */
	public Integer getDenomination() {
		return denomination;
	}

	/**
	 * @param denomination the denomination to set
	 */
	public void setDenomination(Integer denomination) {
		this.denomination = denomination;
	}

	@Override
	public String toString() {
		return "Denomination [denominationId=" + denominationId + ", bank=" + bank + ", noOfDenomination="
				+ noOfDenomination + ", denomination=" + denomination + "]";
	}
	
	

}
