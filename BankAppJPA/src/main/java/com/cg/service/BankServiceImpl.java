package com.cg.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.exception.BankException;
import com.cg.model.Bank;
import com.cg.repository.BankDAO;


@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private BankDAO bkdao;
	
	public Bank createBank(Bank bank) throws BankException {
		Bank bankd = bkdao.save(bank);
		return bankd ;
	}

	public Bank getBankDetails(Integer id) throws BankException {
		Optional<Bank> list = bkdao.findByBankId(id);
		if(list.isPresent())
		{
			Bank bk = list.get();
			return bk;
		}
		else
		{
			throw new BankException("Bank not found");
		}
	}

	@Override
	public int updateBankAmount(Bank bank) throws BankException {
	
		bkdao.save(bank);
		return 0;
	}



}
	

