package com.testing.junitAll;

public class Duplicate {

	public int isDuplicate(int arr[],int number)
	{
		   int cnt=0;
       	for (int i = 0; i < arr.length; i++) 
       	{
       			if(arr[i]==number)
       			{
       				cnt++;
       			}
			}
		 
		 return cnt;
	}
	
}
