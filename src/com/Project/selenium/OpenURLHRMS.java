package com.Project.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURLHRMS {

	public static void main(String[] args) 
	{
		
		ChromeDriver dopen = new ChromeDriver();
		dopen.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dopen.manage().window().maximize();
		
	}
}