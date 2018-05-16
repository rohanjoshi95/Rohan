package com.testing.junitAll;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DuplicateTest {

	Duplicate dup=new Duplicate();
	
	@Test
	public void isDuplicateTest()
	{
		int arr[]= {2,5,6,2,4,5,4,3,5,4,4};
		assertEquals(2, dup.isDuplicate(arr, 2)); //2 comes 2 times in an array
		assertEquals(3, dup.isDuplicate(arr, 5)); //5 comes 3 times in an array
		assertEquals(4, dup.isDuplicate(arr, 4)); //4 comes 4 times in an array
	}
}
