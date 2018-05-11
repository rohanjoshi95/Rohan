package study.duplicates;

import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		
		int[] arr= {2,6,6,6,4,7,0};
		
		int length = arr.length;
		
		System.out.println("Enter the number ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int count=0;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
	
		}
		System.out.println("Repeated count"+count++);
		
	}


	
}
