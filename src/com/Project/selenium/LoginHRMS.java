package com.Project.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginHRMS {

	public static void main(String[] args) 
	{
		ChromeDriver dopen = new ChromeDriver();
		dopen.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dopen.manage().window().maximize();
		dopen.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//AppLogin code
		
		dopen.findElement(By.name("username")).sendKeys("Admin");
		dopen.findElement(By.name("password")).sendKeys("admin123");
		
		dopen.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		

	}

}
