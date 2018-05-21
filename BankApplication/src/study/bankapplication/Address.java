package study.bankapplication;

public class Address { //Address class contains information about address

	private String street;
	private String housenumber;
	private String zipnumber;
	private String city;
	private String contactnumber;
	private String email;

	public Address(String street, String housenumber, String zipnumber, String city, String contactnumber,
			String email) {
		this.street = street;
		this.housenumber = housenumber;
		this.zipnumber = zipnumber;
		this.city = city;
		this.contactnumber = contactnumber;
		this.email = email;
	}

	public Address()
	{
		
	}
	
	
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the housenumber
	 */
	public String getHousenumber() {
		return housenumber;
	}

	/**
	 * @param housenumber the housenumber to set
	 */
	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
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

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [street=" + street + ", housenumber=" + housenumber + ", zipnumber=" + zipnumber + ", city="
				+ city + ", contactnumber=" + contactnumber + ", email=" + email + "]";
	}

	
	
	
}
