package study.lambda;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LambdaExpression {
	static Logger logger = Logger.getLogger("LambdaExpression");

	public static void main(String[] args) {
	
		OddCheck oddCheck = (number) ->
		{
			if(number%2==0) {
				logger.log(Level.INFO,"Entered number is even");
				//System.out.println("Entered number is even");
				return true;
			}
			else
			{
				logger.log(Level.INFO,"Entered number is odd");
				//System.out.println("Entered number is odd");
				return false;
			}
		};
		
		System.out.println(oddCheck.isOdd(12));
		
		PrimeCheck primeCheck=(number)->
		{
			boolean flag=true;
				for (int i = 0; i < number; i++) 
				{	
					if(number%2==0)
					{
						flag=false;
						break;
					}
					
				}
			if(flag==true)
			{
				logger.log(Level.INFO, "Entered number is Prime");
				//System.out.println("Entered number is Prime");
				return true;
			}
			else
			{
				logger.log(Level.INFO, "Entered number is not Prime");
				//System.out.println("Entered number is not Prime");
				return false;
			}	
		};
		
		System.out.println(primeCheck.isPrime(17));
		
		
		PalindromeCheck palindromeCheck=(number)->
		{
			int temp=number;
			int sum=0;    
			  while(number>0)
			  {    
			   int remainder=number % 10;  
			   sum =sum * 10 + remainder;    
			   number = number/10;    
			  
			  }
			  
			  if (temp==sum) {
				logger.log(Level.INFO, "Entered number is Palindrome");
				//System.out.println("Entered number is Palindrome");
				return true;
			  }
			  else
			  {
				  logger.log(Level.INFO, "Entered number is not Palindrome");
				  //System.out.println("Entered number is not Palindrome");
				  return true;
			  }
		};
		
		System.out.println(palindromeCheck.isPalindrome(252));		
	}
}
