package com.TestNG.partices;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest3 
{
	/*
	 * @BeforeMethod public void beformethod() {
	 * System.out.println("Before Method Executed"); }
	 * 
	 * @AfterMethod public void aftermethod() {
	 * System.out.println("After Method Executed"); }
	 */
	
	
	
	/*
	 * @BeforeClass public void beforclass() {
	 * System.out.println("Before Class Executed"); }
	 * 
	 * @AfterClass public void afterclass() {
	 * System.out.println("After Class Executed"); }
	 */
	
	
	@BeforeTest
	public void befortest()
	{
		System.out.println("Before Test Executed");
	}
	
	@AfterTest
	public void aftertest() 
	{
		System.out.println("After Test Executed");
		
	}
	
	@Test(priority = 1)
	public void test1() 
	{
		System.out.println("Test1 Class Executed");
	}
	@Test(priority = 2)
	public void test2() 
	{
		System.out.println("Test2 Class Executed");
	}
	@Test(priority = 3)
	public void test3() 
	{
		System.out.println("Test3 Class Executed");
	}
	@Test(priority = 4)
	public void test4() 
	{
		System.out.println("Test4 Class Executed");
	}
	
	
	
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before Suite Executed");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After Suite Executed");
	}

}
