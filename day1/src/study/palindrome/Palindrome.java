package study.palindrome;

import java.util.Scanner;

public class Palindrome {

	private int number;

	
	public Palindrome(int number) {
		super();
		this.number = number;
	}

	public Palindrome(){
		
	}
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void isPalindrome(int number)
	{

		int temp=number,sum=0;    
		  while(number>0)
		  {    
		   int remainder=number % 10;  
		   sum =(sum * 10) + remainder;    
		   number = number/10;    
		  
		  }
		  
		  if (temp==sum) {
			System.out.println("True");
		  }
		  else
		  {
			  System.out.println("False");
		  }
		
	}
}
