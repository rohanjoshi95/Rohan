package com.cg.service;

import java.math.BigDecimal;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.exception.BankException;
import com.cg.model.ATM;
import com.cg.model.Bank;
import com.cg.repository.ATMDAO;
import com.cg.repository.BankDAO;
import com.dto.WrapperBankATM;

@Service
public class ATMServiceImpl implements ATMService{

	@Autowired
	private ATMDAO atmdao;
	
	@Autowired
	private BankDAO bkdao;
	
	@Autowired
	private BankServiceImpl bankser;
	
	@Override
	public ATM createATM(WrapperBankATM wrappatm) throws BankException {
		
		ATM atm = null;
		ATM atmData = null;
		atm = wrappatm.getAtm();
		System.out.println(atm);
		Integer bankid = wrappatm.getBankId();
		Optional<Bank> banklist = bkdao.findByBankId(bankid);
		Bank bank = banklist.get();
		atm.setBank(bank);
		atmData = atmdao.save(atm);
		BigDecimal amount =bank.getAmount().subtract(atm.getAtmamount()); 
		bank.setAmount(amount);
		bankser.updateBankAmount(bank);
		return atmData;

	
	}

	@Override
	public ATM addMoneyFromBank(Integer id, BigDecimal amt) throws BankException {
		ATM atm = null;
		ATM atmt = null;
		Bank bk = null;
		if(id!=null ) {
			Optional<ATM> atmlist =atmdao.findByAtmId(id);
			atm = atmlist.get();
			bk = atmlist.get().getBank();
			if(bk.getAmount().compareTo(atm.getAtmamount()) > 0) {
				BigDecimal atmamt = atm.getAtmamount().add(amt);
				atm.setAtmamount(atmamt);
				BigDecimal bankamt = bk.getAmount().subtract(amt);
				bk.setAmount(bankamt);
				atm.setBank(bk);
				atmt = atmdao.save(atm);
				bankser.updateBankAmount(bk);	
			}
			else {
				throw new BankException("Insufficient Money in Bank");
			}
		}	
		else {
			throw new BankException("ATM Not Found");
		}
	return atmt;
	}
}
