package com.testing.service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.testing.dao.AddressDaoImpl;
import com.testing.model.Address;

public class AddressServiceImpl implements AddressService{

	static Logger logger = Logger.getLogger("AddressServiceImpl");
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
		final List<Address> list = addrdao.viewAllAddresses();
		if(!list.isEmpty())
		{
			System.out.println(list);
		}
		return list;
	}
	
	public boolean validateAddress(int id)
	{
		AddressServiceImpl adimpl = (AddressServiceImpl) con.getBean("addser");
		List<Address> list = adimpl.viewAllAddress();
		for (Address address : list) {
			if (id == address.getAddressId()) 
				return true;
			else
				return false;
		}
		return false; 
	}



}
