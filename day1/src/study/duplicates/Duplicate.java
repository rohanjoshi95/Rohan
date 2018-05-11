package study.duplicates;

public class Duplicate {
	public static void main(String[] args) {
		
		{
	        int[] array = {1, 2,2, 5, 5, 6, 6};
	 
	        for (int i = 0; i < array.length-1; i++)
	        {
	            for (int j = i+1; j < array.length; j++)
	            {
	                if ((array[i] == array[j]) && (i != j))
	                {
	                    System.out.println("Duplicate Elements : "+array[j]);
	                }
	            }
	        }
		}
	}
}
