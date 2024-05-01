package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmsPropertiesFile 
{
	public static String getValuesofKey(String Key) throws Throwable 
	{
		Properties file = new Properties();
		FileInputStream fis = new FileInputStream("V:\\MyFiles\\Live Tech\\WorkSpace\\NewProject\\NewProject.properties");
		file.load(fis);
		
		return file.getProperty(Key);
	}
}
