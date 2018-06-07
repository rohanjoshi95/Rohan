package com.cg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

import com.cg.exception.BankException;
import com.cg.model.Account;
import com.cg.model.Customer;
import com.cg.model.Transaction;
import com.cg.repository.TransactionDAO;

@Service("TransactionService")
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	private TransactionDAO transdao;
	
	@Override
	public Transaction createTransaction(Transaction transaction) throws BankException {
		
		Account account = transaction.getAccount();
		Integer accountId = account.getAccountId(); 
		
		if(accountId == 0)
		{
			throw new BankException("accountId or can't be 0");
		}
		else
		{
		Transaction trans = transdao.save(transaction);
		return trans;
		}
	}

	@Override
	public Optional<Transaction> getTransactionDetails(Integer accountId) throws BankException {
	
		if(accountId == 0)
		{
			throw new BankException("CustomerId can't be 0");
		}
		else
		{
			Optional<Transaction> translist = transdao.findById(accountId);
			return translist;
		}
	}

}
