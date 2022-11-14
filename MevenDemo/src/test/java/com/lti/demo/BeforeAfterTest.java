package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeAfterTest {

	Calculator c = new Calculator();
	int sum;

	@BeforeAll
	public static void testDbConn()
	{
		System.out.println("db conn is up");
	}
	
	@BeforeEach
	public void testStartup()
	{
		sum=500;
		System.out.println(" before each");
	}
	
	@Test
	public void testsayHello()
	{
		Assertions.assertEquals("hello", c.sayHello());
		System.out.println("test sayhello");
	}
	
	
	@Test
	public void testAdd()
	{							// expected actual message if fails
		Assertions.assertEquals(100, c.add(60, 40), "Check the code again.");
		System.out.println("test add");
	}
	
	@Test
	void testAssertFalse()
	{
		Assertions.assertTrue("shivam".length()==6);
		Assertions.assertFalse("shivam".length()==10);
		Assertions.assertNotEquals("Hello", "hello");
		System.out.println("test assert fase");

	}

	@AfterAll
	public static void testDbClose()
	{
		System.out.println(" db conn is closed");
	}
	
	@AfterEach
	public void testCleanUp()
	{
		sum =0 ;
		
		System.out.println("Clean up");
	}
}
