package study.phonebook;

import java.util.Comparator;

public class NameComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {	
		PhoneBook phonebook1=(PhoneBook) o1;
		PhoneBook phonebook2=(PhoneBook) o2;
		
		return phonebook1.getFirstname().compareTo(phonebook2.getFirstname());
	}

}
