package study.phonebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserPhoneBook {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		Logger logger =Logger.getLogger("UserPhoneBook");
		PhoneBook phonebook=new PhoneBook(5,"Rohan","Joshi","9096770545");
		PhoneBook phonebook1=new PhoneBook(2,"Indrajeet","Nikam","9096770546");
		PhoneBook phonebook2=new PhoneBook(7,"Swapnil","Kumbhar","9096770547");
		ArrayList<PhoneBook> arrayphonebook=new ArrayList<>();	
		arrayphonebook.add(phonebook);
		arrayphonebook.add(phonebook1);
		arrayphonebook.add(phonebook2);
		int choice;
		
		
		do {
			System.out.println("......MENU......");
			System.out.println("1.Add data into Phone Book");
			System.out.println("2.Sorting data by name ");
			System.out.println("3.Sorting data by Serial Number ");
			System.out.println("4.Remove from Phone Book");
			System.out.println("5.Search by name");
			System.out.println("6.Search by serial number");
			System.out.println("7.Search by phone number");
			System.out.println("8.Display records");
			System.out.println("9.Quit");
			System.out.println("Enter Choice");
			choice=scanner.nextInt();
			
			switch (choice) {
			case 1:
			{
				System.out.println("Enter data into Phone Book");
				int serialnumber;
				String firstname;
				String lastname;
				String mobilenumber;
					
				System.out.println("Enter serial number");
				serialnumber=scanner.nextInt();
				
				System.out.println("Enter first name");
				firstname=scanner.next();
					
				System.out.println("Enter last Name");
				lastname=scanner.next();
					
				System.out.println("Enter mobile number");
				mobilenumber=scanner.next();
					
				PhoneBook p=new PhoneBook(serialnumber,firstname,lastname,mobilenumber);
				arrayphonebook.add(p);
				System.out.println("Record added succesfully");
						
				break;	
			}
	
			case 2:
			{
				System.out.println("Sorted Data");
				Collections.sort(arrayphonebook, new NameComparator());
				arrayphonebook.stream().forEach((i->{System.out.println(i);}));
				break;
			}
			case 3:
			{
				System.out.println("Sorted Data");
				Collections.sort(arrayphonebook, new SerialNumberComparator() );
				arrayphonebook.stream().forEach((a->{System.out.println(a);}));
				break;
			}

			case 4:
			{
					
				int serialnumber;
				logger.log(Level.INFO,"Enter id of person you want to delete");
				serialnumber=scanner.nextInt();
				try
				{
						
				if(arrayphonebook.contains(serialnumber))
				{
					throw new IndexOutOfBoundsException("This serial number does not exists");
				}
				else
				{
					arrayphonebook.remove(serialnumber);
					System.out.println("Record deleted succesfully");
				}
					
				}catch(Exception e)
				{
					System.out.println("This serial number "+serialnumber+" does not exists");
				}
				break;
			}
			case 5:
			{
				String firstname;
				System.out.println("Enter first name of person you want to search");
				firstname=scanner.next();
				try
				{
				if(!arrayphonebook.contains(firstname))
				{
					System.out.println("record with name "+firstname+" does not exists");
				}
				else
				{
					Iterator<PhoneBook> itr = arrayphonebook.iterator();
					String isFound = null;
					while (itr.hasNext()) 
					{
						PhoneBook p1 = itr.next();
						isFound = p1.getFirstname();
						if (isFound.equalsIgnoreCase(firstname)) 
						{
							System.out.println(p1.getSerialnumber()+" "+p1.getFirstname()+" "+p1.getLastname()+" "+p1.getPhonenumber());
						} 
					}
				}
				}catch(Exception e)
				{
					System.out.println("Record with name "+firstname+" does not exists");
				}
				break;
			}	
			case 6:
			{
				System.out.print("\nEnter serial number: ");
	  			int serialnumber=scanner.nextInt();
	  			Iterator<PhoneBook> itr2 = arrayphonebook.iterator();
	  			int isFound2 ;
	  			
				while (itr2.hasNext()) 
				{
					PhoneBook p1 = itr2.next();
					isFound2 = p1.getSerialnumber();
					try 
					{
					if (isFound2==serialnumber) {
						
						// System.out.println("Record found/n");
						System.out.println(p1.getSerialnumber()+" "+p1.getFirstname()+" "+p1.getLastname()+" "+p1.getPhonenumber());
						
					} 
					}catch(Exception e)
					{
						System.out.println("Record does not exists");
					}
				}
	  			
	  			break;
			}
			
			case 7:
			{
				String phonenumber;
				System.out.println("Enter phone number of person you want to search");
				phonenumber=scanner.next();
				try
				{
				if(arrayphonebook.contains(phonenumber))
				{
					System.out.println("record with name"+phonenumber+"does not exists");
				}
				else
				{
					Iterator<PhoneBook> itr = arrayphonebook.iterator();
					String isFound = null;
					while (itr.hasNext()) 
					{
						PhoneBook p1 = itr.next();
						isFound = p1.getPhonenumber();
						if (isFound.equalsIgnoreCase(phonenumber)) 
						{
							System.out.println(p1.getSerialnumber()+" "+p1.getFirstname()+" "+p1.getLastname()+" "+p1.getPhonenumber());
						} 
					
					}
				
				}
				}catch(Exception e)
				{
					System.out.println("Record with name" +phonenumber+" does not exists");
				}
				break;
			}
			case 8:
			{
				arrayphonebook.stream().forEach((i->{System.out.println(i);}));
				break;
			}
			case 9:
			{
				System.out.println("Quit");
				break;
			}
			default:
				System.out.println("Invalid input");
				break;
		}
		} while (choice!=9);
	}
}
