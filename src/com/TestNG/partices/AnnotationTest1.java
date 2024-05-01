package com.TestNG.partices;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest1 
{
	@BeforeTest
	public void beforTest()
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

}
