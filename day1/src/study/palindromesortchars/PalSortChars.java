package study.palindromesortchars;


public class PalSortChars 
{

public static void main(String[] args) 
	{
		int arr1[] =new int[15];
		int arr[]= {121,232,565,54,22,233,353,494,6556};
		System.out.println("Palindrome Numbers :");	
		
		for (int i = 0; i < arr.length; i++) 
		{
			
			int num,x,rev=0;
			num=arr[i];
		
			while(num!=0)
			{
				 x=num%10;
				 rev=rev*10+x;
				 num=num/10;
				 
			}
			
			if(rev==arr[i])
			{
				
				System.out.print(arr[i]+" ");
		
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length-1; j++) {
				
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("\nAfter Sorting :");
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
	}
	
}

