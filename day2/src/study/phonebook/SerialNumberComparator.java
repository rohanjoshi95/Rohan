package study.phonebook;

import java.util.Comparator;

public class SerialNumberComparator implements Comparator<Object>{

	@Override
	public int compare(Object s1, Object s2) {		
		PhoneBook phonebook1=(PhoneBook) s1;
		PhoneBook phonebook2=(PhoneBook) s2;		
		
		if(phonebook1.getSerialnumber() > phonebook2.getSerialnumber())
			return 1;
		if(phonebook1.getSerialnumber() < phonebook2.getSerialnumber())
			return -1;
		else
			return 0;	
	}	
}


