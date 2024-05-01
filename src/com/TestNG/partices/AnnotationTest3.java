package com.TestNG.partices;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest3 
{
	@BeforeClass
	public void beforclass() 
	{
		System.out.println("Before Class Executed");	
	}
	@BeforeTest
	public void befortest()
	{
		System.out.println("Before Method Executed");
	}
	
	@AfterTest
	public void aftertest() 
	{
		System.out.println("After Method Executed");
		
	}
	
	@Test
	public void test1() 
	{
		System.out.println("Test1 Class Executed");
	}
	@Test
	public void test2() 
	{
		System.out.println("Test2 Class Executed");
	}
	@Test
	public void test3() 
	{
		System.out.println("Test3 Class Executed");
	}
	@Test
	public void test4() 
	{
		System.out.println("Test4 Class Executed");
	}
	
	
	@AfterClass
	public void afterclass() 
	{
		System.out.println("After Class Executed");
	}
	

}
