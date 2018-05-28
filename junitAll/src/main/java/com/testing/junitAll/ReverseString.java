package com.testing.junitAll;

public class ReverseString {

	/*
	 *method reverseString to reverse the given string 
	 **/
	public String reverseString(String str) { 
    String[] split = str.split(" ");
	  String result =""; 
	  for (int i = 0; i < split.length; i++) 
	  {
		  String temp="";
		  for (int j = split[i].length()-1; j >=0; j--) 
		  {
			  temp = temp + split[i].charAt(j);
		  }
		  result = result + temp+" ";
	  }
	 
	return result; 
	  
	}
	
}

