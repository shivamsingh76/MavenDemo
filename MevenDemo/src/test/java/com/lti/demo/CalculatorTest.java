package com.lti.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator c = new Calculator();
	
	
	@Test
	public void testsayHello()
	{
		Assertions.assertEquals("Hello", c.sayHello());
	}
	
	@Disabled
	@Test
	public void testAdd()
	{							// expected actual message if fails
		Assertions.assertEquals(100, c.add(60, 40), "Check the code again.");
	}
	@Disabled
	@Test
	void testAssertFalse()
	{
		Assertions.assertTrue("shivam".length()==6);
		Assertions.assertFalse("shivam".length()==10);
		Assertions.assertNotEquals("Hello", "hello");
	}
	@Disabled
	@Test
	void testAssertNull() 
	{
		String str1 = null;
		String str2 = "Hi";
		Assertions.assertNull(str2);
		Assertions.assertNull(str1);
	}
	
	@Test
	public void testArrayList()
	{
		ArrayList<Integer> myList = new ArrayList<>();
	
		Assertions.assertEquals(0, myList.size());
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(2, myList.size());
	}
	
}
