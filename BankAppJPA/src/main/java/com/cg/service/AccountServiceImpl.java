package com.cg.service;

import java.math.BigDecimal;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.exception.BankException;
import com.cg.model.Account;
import com.cg.model.Bank;
import com.cg.model.Customer;
import com.cg.model.Transaction;
import com.cg.repository.AccountDAO;
import com.cg.repository.BankDAO;
import com.cg.repository.CustomerDAO;
import com.dto.WrapperBankCustomerAccount;

@Transactional
@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDAO acntdao;
	
	@Autowired
	private BankDAO bkdao;
	
	@Autowired
	private CustomerDAO custdao;
	
	@Autowired
	private BankServiceImpl bankser;
	
	@Autowired
	private TransactionServiceImpl transser;
	


	@Override
	public Account createAccount(WrapperBankCustomerAccount wrappbkcusacc) throws BankException {
	
		Account acntd = null;
		Account acntData = null;
		acntd = wrappbkcusacc.getAccount();
		Integer bankId = wrappbkcusacc.getBankId();
		Integer customerId = wrappbkcusacc.getCustomerId();
		Optional<Bank> banklist = bkdao.findByBankId(bankId);
		System.out.println(banklist);
		Bank bank = banklist.get();
		acntd.setBank(bank);
		Optional<Customer> costomerlist = custdao.findByCustomerId(customerId);
		Customer customer = costomerlist.get();
		acntd.setCustomer(customer);
		acntData = acntdao.save(acntd);
		return acntData;
	}

	@Override
	public Account depositeMoney(Integer id,BigDecimal amt) throws BankException {
		
		Account acnt = null;
		Account acntData =  null;
		Bank bk = null;
		if((id == null) || (id == 0) )
		{
			throw new BankException("Invalid Id OR Amount");
		}
		else
		{
			Optional<Account> accountlist = acntdao.findByAccountId(id);
			System.out.println(accountlist);
			BigDecimal amtount = accountlist.get().getAmount().add(amt);
			acnt = accountlist.get();
			acnt.setAmount(amtount);
			bk = accountlist.get().getBank();
			BigDecimal bkamt = bk.getAmount().add(amt);
			bk.setAmount(bkamt);
			acnt.setBank(bk);
			acntData = acntdao.save(acnt);
			Transaction trans = new Transaction(acntData, amtount, "Deposit");
			transser.createTransaction(trans);
			bankser.updateBankAmount(bk);	
		}
		return acntData;
	}

	@Override
	public Account withdrawMoney(Integer id,BigDecimal amt) throws BankException {
		
		Account acnt = null;
		Account acntData =  null;
		Bank bk = null;
		if((id == null) || (id == 0) )
		{
			throw new BankException("Invalid Id OR Amount");
		}
		else
		{
			Optional<Account> accountlist = acntdao.findByAccountId(id);
			System.out.println(accountlist);
			BigDecimal amtount = accountlist.get().getAmount().subtract(amt);
			acnt = accountlist.get();
			acnt.setAmount(amtount);
			bk = accountlist.get().getBank();
			BigDecimal bkamt = bk.getAmount().subtract(amt);
			bk.setAmount(bkamt);
			acnt.setBank(bk);
			acntData =acntdao.save(acnt);
			Transaction trans = new Transaction(acntData, amtount, "Withdraw");
			transser.createTransaction(trans);
			bankser.updateBankAmount(bk);	
		}
		return acntData;
	}

	@Override
	public Account getAccountDetails(Integer id) throws BankException {
			
		Optional<Account> list = acntdao.findById(id);
		if(list.isPresent())
		{
			Account acnt = list.get();
			return acnt;
		}
		else
		{
			throw new BankException("Account not found");
		}
		
	}
}



