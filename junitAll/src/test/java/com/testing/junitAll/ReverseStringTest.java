package com.testing.junitAll;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

	
	ReverseString rs = new ReverseString();
	
	@Test
	public void isReverseStringTest()
	{
		assertEquals("nahoR ihsoJ",rs.reverseString("Rohan Joshi"));
	}
}
