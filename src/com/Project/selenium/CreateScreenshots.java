package com.Project.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateScreenshots {

	public static void main(String[] args) throws Throwable 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dmvs.ac.in/");
		
		TakesScreenshot TSS = (TakesScreenshot)driver;
		File srcfile = TSS.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("V:\\MyFiles\\Live Tech\\WorkSpace\\NewProject\\ScreenShots\\dmvs.png"));

	}

}
