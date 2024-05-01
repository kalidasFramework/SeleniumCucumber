package com.TestNG.partices;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTest 
{
	@BeforeMethod
	public void beformethod()
	{
		System.out.println("Before Method Executed");
	}
	
	@AfterMethod
	public void aftermethod() 
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
