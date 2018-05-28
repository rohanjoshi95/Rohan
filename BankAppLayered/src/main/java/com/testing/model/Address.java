package com.testing.model;

public class Address {
	
	private int addressId;
	private String zipnumber;
	private String city;
	private String contactnumber;
	/**
	 * @param addressId
	 * @param zipnumber
	 * @param city
	 * @param contactnumber
	 */
	
	public Address()
	{
		
	}
	public Address(int addressId, String zipnumber, String city, String contactnumber) {
		this.addressId = addressId;
		this.zipnumber = zipnumber;
		this.city = city;
		this.contactnumber = contactnumber;
	}
	
	public Address( String zipnumber, String city, String contactnumber) {
		
		this.zipnumber = zipnumber;
		this.city = city;
		this.contactnumber = contactnumber;
	}
	/**
	 * @return the addressId
	 */
	public int getAddressId() {
		return addressId;
	}
	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	/**
	 * @return the zipnumber
	 */
	public String getZipnumber() {
		return zipnumber;
	}
	/**
	 * @param zipnumber the zipnumber to set
	 */
	public void setZipnumber(String zipnumber) {
		this.zipnumber = zipnumber;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the contactnumber
	 */
	public String getContactnumber() {
		return contactnumber;
	}
	/**
	 * @param contactnumber the contactnumber to set
	 */
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}


	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", zipnumber=" + zipnumber + ", city=" + city + ", contactnumber="
				+ contactnumber + "]";
	}

	
	
}
