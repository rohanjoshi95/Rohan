package com.testing.service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.testing.dao.AccountDao;
import com.testing.dao.AccountDaoImpl;
import com.testing.model.Account;
import com.testing.model.Customer;

public class AccountServiceImpl implements AccountService{

	Logger logger = Logger.getLogger("AccountServiceImpl");
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	AccountDaoImpl accdao = (AccountDaoImpl) context.getBean("acntdao");
	@Override
	public int addAccount(Account account) {
	
		int addData = accdao.addAccount(account);
		if(addData > 0)
		{
			System.out.println("Data inserted successfuly");
		}
		else
		{
			System.out.println("Insertion failed");
		}
		return addData;
	}
	
	
	@Override
	public int updateAccount(int accId,String acntno) {
		int updateData = accdao.updateAccount(accId,acntno);
		if(updateData > 0)
		{
			System.out.println("Data updated successfuly");
		}
		else
		{
			System.out.println("Updation failed");
		}
		return updateData;
	}

	@Override
	public int removeAccount(int acntId) {
		int removeData = accdao.removeAccount(acntId);
		if(removeData > 0)
		{
			System.out.println("Data removed successfuly");
		}
		else
		{
			System.out.println("Deletion failed");
		}
		return removeData;
	}


	@Override
	public List<Account> viewAllAccount() {
		List<Account> list = accdao.viewAllAccount();
		if(!list.isEmpty())
		{
		list.stream().forEach((i->{System.out.println(i);}));
		}
		return list;
	}
	public boolean validateAccount(int id)
	{
		AccountServiceImpl acimpl = (AccountServiceImpl) context.getBean("acntser");
		List<Account> list = acimpl.viewAllAccount();
		logger.log(Level.INFO, "Enter Id number");
		for (Account account : list) {
			if (id == account.getAccountId()) {
				return true;
			}
			return false;
		}
		return false; 
	}


}
