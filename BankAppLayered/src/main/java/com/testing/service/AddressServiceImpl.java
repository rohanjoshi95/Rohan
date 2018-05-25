package com.testing.service;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.testing.dao.AddressDaoImpl;
import com.testing.model.Address;

public class AddressServiceImpl implements AddressService{

	
	ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
	AddressDaoImpl addrdao = (AddressDaoImpl) con.getBean("adddao");
	@Override
	public int addAddress(Address address) {
		
		final int addData = addrdao.addAddress(address); 
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
	public int updateAddress(int addId, String contno) {
		final int upData = addrdao.updateAddress(addId, contno);
		if(upData > 0)
		{
			System.out.println("Data updated successfuly");
		}
		else
		{
			System.out.println("Updation failed");
		}
		return upData;
	}
	
	@Override
	public int removeAddress(int addId) {
		final int removeData = addrdao.removeAddress(addId);
		if(removeData > 0)
		{
			System.out.println("Data deleted successfuly");
		}
		else
		{
			System.out.println("Deletion failed");
		}
		return removeData;
	}

	@Override
	public List<Address> viewAllAddress() {
		final List<Address> list = addrdao.viewAllAddress();
		return list;
	}




}
