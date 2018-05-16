package study.duplicates;

public class Duplicate {
	        
		//Passing the array and number to be checked as duplicate
	       public void checkDuplicate(int arr[],int number)
	        {
	    	   int cnt=0;
	        	for (int i = 0; i < arr.length; i++) 
	        	{
	        			if(arr[i]==number)
	        			{
	        				cnt++;
	        			}
				}
			    if(cnt>1)
			    	System.out.println(cnt+" ");
	        }

}
