package CommonFunctionLibrary;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.HrmsPropertiesFile;


public class NewProjectLibrary {
	
	String res;
	ChromeDriver driver;
	
	//URL Launching
	public String OpenURL(String URL) 
	{
		driver = new ChromeDriver();
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		if (driver.findElement(By.name("username")).isDisplayed()) 
		{
			res= "Pass";
		}
		else {
			res = "Fail";
		}	
		return res;
	}
	
	public String LoginMethod(String username, String password) 
	{
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		if (driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).isDisplayed()) 
		{
		    res="Pass";	
		}
		else 
		{
			res="Fail";
		}
		return res;
	}
	
	//Click on PIM and Employee Add 
	public String ClickPIM() 
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		
		if (driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).isDisplayed()) 
		{
			res="Clicked PIM";
		}
		else
		{
			res="Not Clicked PIM - Fail";
		}
		return res;
		
	}
	
	
	public String AddEmployee(String firstname, String middleName, String lastname, String employeeid, String username1, String password1, String Confirmpassword) 
	{
		driver.findElement(By.name("firstName")).sendKeys(firstname);
		driver.findElement(By.name("middleName")).sendKeys(middleName);
		driver.findElement(By.name("lastName")).sendKeys(lastname);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys(employeeid);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys(username1);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys(password1);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys(Confirmpassword);
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		
		scrollUp(driver);
		
		if (driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/h6")).isDisplayed()) 
		{
			res="Add Employee details Clicked Personal Details";
		}
		else
		{
			res="Not Clicked Personal Details - Fail";
		}
		return res;
		
	}
	
	//Personal details Method
	
	public String PersonalDetailsMethod(String OtherId, String drivelience, String expiredate, String dob) 
	{
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input")).sendKeys(OtherId);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys(drivelience);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")).sendKeys(expiredate);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")).sendKeys(dob);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")).click();
		
		scrollUp(driver);
		
		if (driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/h6")).isDisplayed()) 
		{
			res="Personal details Clicked Contact Details";
		}
		else
		{
			res="Not Clicked Personal Details - Fail";
		}
		return res;
		
		
	}
	
	
	public String Contactdetails(String street1, String street2, String city, String state, String pincode, String home, String mobil, String offlice, String emailid, String officeid) 
	{
		scrollUp(driver);
		//Contact Details
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(street1);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys(street2);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")).sendKeys(city);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys(state);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")).sendKeys(pincode);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys(home);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys(mobil);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input")).sendKeys(offlice);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input")).sendKeys(emailid);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[2]/div/div[2]/input")).sendKeys(officeid);
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")).click();
		
		scrollUp(driver);
		
		if (driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/h6")).isDisplayed()) 
		{
			res="Add the Details of the Contact Details";
		}
		else
		{
			res="Not Clicked Contact details - Fail";
		}
		return res;
		
		
	}

		private void scrollUp(ChromeDriver driver) 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        // Scroll up by 250 pixels
	        js.executeScript("window.scrollBy(0, -250)");
		}

		//application logout
		public void LogoutMethod() {
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
			//driver.findElement(By.linkText("Logout")).click();
		}
	
		//application close
		public void CloseMethod() 
		{
			driver.close();
		}
		
	
	public static void main(String[] args) throws Throwable 
	{
		NewProjectLibrary npl = new NewProjectLibrary();
		String result = npl.OpenURL(HrmsPropertiesFile.getValuesofKey("URL"));
		System.out.println(result); 
		
		//Login in HRMS
	   String result1 =	npl.LoginMethod(HrmsPropertiesFile.getValuesofKey("Username"), HrmsPropertiesFile.getValuesofKey("Password"));
	   System.out.println(result1);
	   
	   //Click on PIM
	   String result2 = npl.ClickPIM();
	   System.out.println(result2);
	   
	   //Add Employee details
	   String result3= npl.AddEmployee(HrmsPropertiesFile.getValuesofKey("FirstName"), HrmsPropertiesFile.getValuesofKey("MiddleName"), HrmsPropertiesFile.getValuesofKey("LastName"), HrmsPropertiesFile.getValuesofKey("EmployeeID"), HrmsPropertiesFile.getValuesofKey("UserName1"), HrmsPropertiesFile.getValuesofKey("Password1"), HrmsPropertiesFile.getValuesofKey("ConfirmPassword"));
	   System.out.println(result3);
	   
	   //Enter Personal Details
	   String result4=npl.PersonalDetailsMethod(HrmsPropertiesFile.getValuesofKey("OtherID"), HrmsPropertiesFile.getValuesofKey("DriveLicencseNumber"), HrmsPropertiesFile.getValuesofKey("LicenseExpiryDate"), HrmsPropertiesFile.getValuesofKey("DateofBirth"));
	   System.out.println(result4);
	   
	   
	   //Enter Personal Details
	   String result5= npl.Contactdetails(HrmsPropertiesFile.getValuesofKey("Street"), HrmsPropertiesFile.getValuesofKey("Street1"), HrmsPropertiesFile.getValuesofKey("City"), HrmsPropertiesFile.getValuesofKey("State"), HrmsPropertiesFile.getValuesofKey("PostalCode"), HrmsPropertiesFile.getValuesofKey("Home"), HrmsPropertiesFile.getValuesofKey("Mobile"), HrmsPropertiesFile.getValuesofKey("Work"), HrmsPropertiesFile.getValuesofKey("Mail"), HrmsPropertiesFile.getValuesofKey("Workmail"));
	   System.out.println(result5);
	   
	   
	   //logout
	   npl.LogoutMethod(); 
	   npl.CloseMethod();
	}
}
