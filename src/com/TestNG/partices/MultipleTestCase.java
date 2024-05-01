package com.TestNG.partices;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleTestCase 
{
	@Test(dataProvider = "getData")
	public void OpenURL(String UserName, String Password)
	{
		System.out.println(UserName);
		System.out.println(Password);
	}
	@DataProvider
	public Object[][] getData() 
	{
		Object[][] data = new Object[2][2]; // Adjusted the array size to accommodate three sets of data
	    
	    // First set of data
	    data[0][0] = "Kalidas"; // Changed indices to 0 and 1 for the first set
	    data[0][1] = "Kalidas@123";
	    
	    // Second set of data
	    data[1][0] = "Ram"; // Corrected the indices to 1 and 0 for the second set
	    data[1][1] = "ram@123";
	    
	   
	    return data;
	}
	

}