package com.testing.dao;

import java.util.List;

import com.testing.model.Address;

public interface AddressDao {

	public int addAddress(Address add);
	public int updateAddress(int addId,String contno);
	public int removeAddress(int id);
	public List<Address> viewAllAddresses();
	
}
