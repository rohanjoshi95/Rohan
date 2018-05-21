package study.phonebook;

public class PhoneBook {
	
		private int serialnumber;
		private String firstname;
		private String lastname;
		private String phonenumber;
		
		public PhoneBook(int serialnumber, String firstname, String lastname, String phonenumber) {
			
			this.serialnumber = serialnumber;
			this.firstname = firstname;
			this.lastname = lastname;
			this.phonenumber = phonenumber;
		}

		public PhoneBook() {
			super();
		}

		/**
		 * @return the serialnumber
		 */
		public int getSerialnumber() {
			return serialnumber;
		}

		/**
		 * @param serialnumber the serialnumber to set
		 */
		public void setSerialnumber(int serialnumber) {
			this.serialnumber = serialnumber;
		}

		/**
		 * @return the firstname
		 */
		public String getFirstname() {
			return firstname;
		}

		/**
		 * @param firstname the firstname to set
		 */
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		/**
		 * @return the lastname
		 */
		public String getLastname() {
			return lastname;
		}

		/**
		 * @param lastname the lastname to set
		 */
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		/**
		 * @return the phonenumber
		 */
		public String getPhonenumber() {
			return phonenumber;
		}

		/**
		 * @param phonenumber the phonenumber to set
		 */
		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}

		@Override
		public String toString() {
		return "\nSerial Number:  "+serialnumber+" "+"\nFirst Name:  "+firstname+" "+"\nLast Name:  "+lastname+" "+"\nPhone Number:  "+phonenumber ;
		}
}
