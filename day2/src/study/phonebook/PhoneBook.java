package study.phonebook;

public class PhoneBook {
	
		private int serialnumber;
		private String firstname;
		private String lastname;
		private String phonenumber;
		
		public PhoneBook(int serialnumber, String firstname, String lastname, String phonenumber) {
			super();
			this.serialnumber = serialnumber;
			this.firstname = firstname;
			this.lastname = lastname;
			this.phonenumber = phonenumber;
		}
		
		 
		
		public PhoneBook() {
			super();
		}



		public int getSerialnumber() {
			return serialnumber;
		}
		public void setSerialnumber(int serialnumber) {
			this.serialnumber = serialnumber;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}
		
		@Override
		public String toString() {
		return "Serial Number:"+serialnumber+" "+"First Name:"+firstname+" "+"Last Name:"+lastname+" "+"Phone Number:"+phonenumber ;
		}
}
