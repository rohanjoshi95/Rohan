package study.generics;

public class Generic {

	//Generic method to print any type of elements
	public <T> void printarray(T arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]+" ");
		}
	}
	
}
