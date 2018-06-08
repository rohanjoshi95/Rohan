package com.cg.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.exception.BankException;
import com.cg.model.Bank;
import com.cg.model.Customer;
import com.cg.repository.BankDAO;
import com.cg.repository.CustomerDAO;
import com.dto.WrapperBankCustomer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDAO custdao;
	
	@Autowired
	private BankDAO bkdao;
	
	public Customer getCustomerDetails(Integer id) throws BankException {
		
		Optional<Customer> list = custdao.findByCustomerId(id);
		if(list.isPresent())
		{
			Customer cust = list.get();
			return cust;
		}
		else
		{
			throw new BankException("Customer not found");
		}
	
	}

	@Override
	public Customer createCustomer(WrapperBankCustomer wrappcustomer) throws BankException {
		
		Customer customer = null;
		Customer custData = null;
		customer = wrappcustomer.getCustomer();
		Integer bankid = wrappcustomer.getBankId();
		Optional<Bank> banklist = bkdao.findByBankId(bankid);
		Bank bank = banklist.get();
		customer.setBank(bank);
		custData = custdao.save(customer);
		return custData;
		
	}

}
