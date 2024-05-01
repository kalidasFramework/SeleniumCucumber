package com.TestNG.partices;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	private void sample() {
		// TODO Auto-generated method stub
		//Implicit casting
				//lower to Higher
				System.out.println("===================");
				System.out.println("Implicit Cating");
				System.out.println("===================");
				int a =5;
				System.out.println(a);
				double d =a;
				System.out.println(d);
				
				System.out.println("===================");
				//Explicit Casting
				//Highter to Lower
				System.out.println("Explicit Cating");
				System.out.println("===================");
				
				double d1=124.4;
				System.out.println(d1);
				
				int c=(int)d1;
				System.out.println(c);
	}

}
