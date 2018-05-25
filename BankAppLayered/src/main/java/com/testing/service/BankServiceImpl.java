package com.testing.service;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.testing.dao.BankDaoImpl;
import com.testing.model.Bank;

public class BankServiceImpl implements BankService {

	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	BankDaoImpl bkdao = (BankDaoImpl) context.getBean("bankdao");
	@Override
	public int addBank(Bank bank) {
		int addData = bkdao.addBank(bank);
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
	public int updateBank(int bankId,String bankname) {
		int updateData = bkdao.updateBank(bankId,bankname);
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
	public int removeBank(int bankId) {
		int removeData =bkdao.removeBank(bankId);
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
	public List<Bank> viewAllBank() {
		List<Bank> list = bkdao.viewAllBank();
		return list;
	}

	

}
