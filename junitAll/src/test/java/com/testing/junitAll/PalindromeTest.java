package com.testing.junitAll;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeTest {

	Palindrome pal=new Palindrome();
	
	@Test
	public void isPalindromeTest()
	{
		assertEquals(121, pal.isPalindrome(121));
	}
	
}
