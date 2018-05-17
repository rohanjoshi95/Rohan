package study.generics;

import java.util.Scanner;
//class Generic
public class UserGeneric {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		//Object of Generic class
		Generic gn=new Generic();
		
		//Accepting Integer elements
		System.out.println("Enter integer elements");
		Integer arrinteger[]=new Integer[5];
		for (int i = 0; i < arrinteger.length; i++) {
			
			arrinteger[i]=sc.nextInt();
		}
		
		//Accepting String elements
		System.out.println("Enter String elements");
		String stringinteger[]=new String[5];
		for (int i = 0; i < stringinteger.length; i++) {
			
			stringinteger[i]=sc.next();
		}
		
		System.out.println("Output :");
		gn.printarray(arrinteger); //Printing integers using generic method printarray'
		gn.printarray(stringinteger); //Printing String using generic method printarray
		
	}

}
