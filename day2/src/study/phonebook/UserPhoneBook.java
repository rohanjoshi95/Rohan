package study.phonebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserPhoneBook {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		Logger logger =Logger.getLogger("UserPhoneBook");
		PhoneBook phonebook=new PhoneBook(1,"Rohan","Joshi","9096770545");
		PhoneBook phonebook1=new PhoneBook(2,"Indrajeet","Nikam","9096770546");
		PhoneBook phonebook2=new PhoneBook(3,"Swapnil","Kumbhar","9096770547");
		ArrayList<PhoneBook> arrayphonebook=new ArrayList<>();
		
		arrayphonebook.add(phonebook);
		arrayphonebook.add(phonebook1);
		arrayphonebook.add(phonebook2);
		int choice;
		do {
			System.out.println("......MENU......");
			System.out.println("1.Add into Phone Book");
			System.out.println("2.Remove from Phone Book");
			System.out.println("3.Search by name");
			System.out.println("4.Search by serial number");
			System.out.println("5.Search by phone number");
			System.out.println("6.Display records");
			System.out.println("7.Quit");
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				{
					System.out.println("Enter data into Phone Book");
					int serialnumber;
					String firstname;
					String lastname;
					String mobilenumber;
					
					System.out.println("Enter serial number");
					serialnumber=sc.nextInt();
				
					System.out.println("Enter first name");
					firstname=sc.next();
					
					System.out.println("Enter last Name");
					lastname=sc.next();
					
					System.out.println("Enter mobile number");
					mobilenumber=sc.next();
					
						PhoneBook p=new PhoneBook(serialnumber,firstname,lastname,mobilenumber);
						arrayphonebook.add(p);
						System.out.println("Record added succesfully");
						
						break;	
					}
					
				
			case 2:
				{
					
					int serialnumber;
					logger.log(Level.INFO,"Enter id of person you want to delete");
					serialnumber=sc.nextInt();
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
			case 3:
			{
				String firstname;
				System.out.println("Enter first name of person you want to search");
				firstname=sc.next();
				try
				{
				if(arrayphonebook.contains(firstname))
				{
					System.out.println("record with name"+firstname+"does not exists");
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
					System.out.println("Record with name" +firstname+" does not exists");
				}
				break;
			}
			
			case 4:
			{
				System.out.print("\nEnter serial number: ");
	  			int serialnumber=sc.nextInt();
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
			
			case 5:
			{
				String phonenumber;
				System.out.println("Enter phone number of person you want to search");
				phonenumber=sc.next();
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
			case 6:
			{
				Iterator<PhoneBook> iterator=arrayphonebook.iterator();
				for (Iterator iterator2 = arrayphonebook.iterator(); iterator2.hasNext();) 
				{	
					System.out.println(iterator2.next());	
				} 
				break;
			}
			case 7:
			{
				System.out.println("Quit");
				break;
			}
			default:
				System.out.println("Invalid input");
				break;
		}
		} while (choice!=7);

	}

}
