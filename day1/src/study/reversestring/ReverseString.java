package study.reversestring;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		  String str = null;
	      System.out.println("Enter string to be reversed");
		  Scanner sc=new Scanner(System.in);
		 
		  str=sc.nextLine();
	      String[] split = str.split(" ");
		  String result = " ";
		  
		  for (int i = 0; i < split.length; i++) 
		  {
		   
			  String temp="";
			  for (int j = split[i].length()-1; j >=0; j--) 
			  {
				
				  temp = temp + split[i].charAt(j);
		    	
			  }
			  result = result + temp +" ";
		  }
		  System.out.println(result);     
	       
	    }
}
