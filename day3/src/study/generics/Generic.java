package study.generics;

public class Generic {

	public Generic()
	{
		
	}
	
	public <T> void printarray(T arr[])//Generic method to print any type of elements
	{
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]+" ");
		}
	}
	
}
