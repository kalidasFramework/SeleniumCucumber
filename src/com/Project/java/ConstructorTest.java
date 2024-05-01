package com.Project.java;

public class ConstructorTest 
{
	int MyNumber;
	public ConstructorTest(int number) 
	{
		//They are two type of Constructor Default Constructor & Parameterize Constructor
		MyNumber = number;
		System.out.println("Constructor Executed");
	}
	public int returnNumber() 
	{
		return MyNumber;
	}
	public static void main(String[] args) 
	{
		ConstructorTest CT = new ConstructorTest(42);  //Object
		System.out.println("My Number is: "  + CT.returnNumber() );
	}
}
