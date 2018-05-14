package study.palindromesortchars;

import java.util.Scanner;

public class PalSortChars {

public static void main(String[] args) {
	

	int  rem, reverse_num, temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		int arr[]=new int[10];
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
			
			 temp=arr[i];
		      
			 reverse_num=0;
		     
			 while(temp>0)
			 {
		         rem=temp%10;
		         temp=temp/10;
		         reverse_num=reverse_num*10+rem;
		     
			 }
		      if(arr[i]==reverse_num)
		         System.out.println(arr[i]+" ");
		   }
			
		}

	}
	
	

