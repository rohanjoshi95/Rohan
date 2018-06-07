package com.dto;

import com.cg.model.ATM;

public class WrapperBankATM {

	private ATM atm;
	private Integer bankId;
	/**
	 * @param atm
	 * @param bankId
	 */
	public WrapperBankATM(ATM atm, Integer bankId) {
		this.atm = atm;
		this.bankId = bankId;
	}
	
	public WrapperBankATM() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the atm
	 */
	public ATM getAtm() {
		return atm;
	}

	/**
	 * @param atm the atm to set
	 */
	public void setAtm(ATM atm) {
		this.atm = atm;
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
		return "WrapperBankATM [atm=" + atm + ", bankId=" + bankId + "]";
	}
	
	
}