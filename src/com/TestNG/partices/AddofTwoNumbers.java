package com.TestNG.partices;

import org.testng.annotations.Test;

public class AddofTwoNumbers {
	
	@Test
	private void AddTwonubmer() {
		
		int a=4;
		int b=5;
		
		int c = a+b;
		
		System.out.println(c);

	}
	
	@Test
	public void Multipication()
	{
		// Loop for each table
        for (int i = 1; i <= 20; i++) {
            System.out.println("Multiplication Table of " + i);
            System.out.println("-----------------------------");
            
            // Loop for each multiplication
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println(); // Empty line for separation between tables
        }

	}	
	

}
