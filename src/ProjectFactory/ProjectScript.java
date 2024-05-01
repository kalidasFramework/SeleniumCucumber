package ProjectFactory;

import java.io.File;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openxmlformats.schemas.presentationml.x2006.main.STIndex;

import CommonFunctionLibrary.FunctionLibrary;
import Utilities.ExcelFileUtilities;

public class ProjectScript {

	WebDriver driver;
	public void StartTest() throws Throwable 
	{
		ExcelFileUtilities excel = new ExcelFileUtilities();
		
		for (int i = 0; i <=excel.rowCount("MasterTestCases"); i++) 
		{
			String ModuleStatus="";
			
			if (excel.getData("MasterTestCases", i, 2).equalsIgnoreCase("Y")) 
			{
				//Application Login
				String TCModule = excel.getData("MasterTestCases", i, 1);
				
				for (int j = 1; j <= excel.rowCount(TCModule); j++) 
				{
					String Description = excel.getData(TCModule, j, 0);
					String Object_Type = excel.getData(TCModule, j, 1);
					String Locator_type = excel.getData(TCModule, j, 2);
					String Locator_Value = excel.getData(TCModule, j, 3);
					
					System.out.println(Locator_Value);
					
					String Test_Data = excel.getData(TCModule, j, 4);
					try 
					{
						if (Object_Type.equalsIgnoreCase("startBrowser")) 
						{
							driver = FunctionLibrary.startBrowser(driver);
						}
						if (Object_Type.equalsIgnoreCase("openApplication")) 
						{
							FunctionLibrary.OpenApplication(driver);
						}
						if(Object_Type.equalsIgnoreCase("waitforElement")) 
						{
							FunctionLibrary.waitforElement(driver, Locator_type, Locator_Value, Test_Data);
						}
						if (Object_Type.equalsIgnoreCase("typeAction")) 
						{
							FunctionLibrary.typeAction(driver, Locator_type, Locator_Value, Test_Data);
						} 
						if(Object_Type.equalsIgnoreCase("clearAction")) 
						{
							FunctionLibrary.clearAction(driver, Locator_type, Locator_Value, Test_Data);
						}
						if (Object_Type.equalsIgnoreCase("clickAction")) 
						{
							FunctionLibrary.clickAction(driver, Locator_type, Locator_Value);
						}
						
						if(Object_Type.equalsIgnoreCase("closeBrowser"))
						{
							FunctionLibrary.closeBrowser(driver);
						}
					
						excel.SetData(TCModule, j, 5, "Pass");
						ModuleStatus ="true";
					
					}
					catch (Exception e) {
						// TODO: handle exception
						excel.SetData(TCModule, j, 5, "Fail");
						ModuleStatus ="False";
						TakesScreenshot TSS = (TakesScreenshot)driver;
						File srcfile = TSS.getScreenshotAs(OutputType.FILE);
						FileUtils.copyFile(srcfile, new File("./ScreenShots/"+Description+FunctionLibrary.GenerateDate()+".png"));
						
						
						break;
					}
				}
				if (ModuleStatus.equalsIgnoreCase("true")) 
				{
					excel.SetData("MasterTestCases", i, 3, "Pass");
				}else
					if (ModuleStatus.equalsIgnoreCase("False")) 
					{
						excel.SetData("MasterTestCases", i, 3, "Failed");
					}
			}else 
			{
				excel.SetData("MasterTestCases", i, 3, "Not Excuted");
			}
				
		}	
	}
}
