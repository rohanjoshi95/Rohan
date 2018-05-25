package com.testing.service;
import java.util.List;
import com.testing.model.Address;

/**
 @author Rohan Joshi
 *Interface AddressService contains all CRUD methods for address database
 * */
public interface AddressService {

	/**
	 * addAddress method for adding address into database
	 * */
	 int addAddress(Address address);
	/**
	 * updateAddress method for updating address into database
	 * */
	 int updateAddress(int addId,String contno);
	/**
	 * removeAddress method for removing address from database
	 * */
	 int removeAddress(int addId);
	 /**
	 * viewAllAddress method for viewing all addresses from database
	 * */
	 List<Address> viewAllAddress();
	
}
