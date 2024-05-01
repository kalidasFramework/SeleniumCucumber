package com.Project.selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import CommonFunctionLibrary.NewProjectLibrary;
import Utilities.HrmsPropertiesFile;

public class DataLoginTesting {

	public static void main(String[] args) throws Throwable 
	{
		NewProjectLibrary NPL= new NewProjectLibrary();
		NPL.OpenURL(HrmsPropertiesFile.getValuesofKey("URL"));
		
		FileInputStream fis = new FileInputStream("V:\\MyFiles\\Live Tech\\WorkSpace\\NewProject\\TextInputs\\InputsData.xlsx");
		XSSFWorkbook Wb= new XSSFWorkbook(fis);
		XSSFSheet WS= Wb.getSheet("ORMHRMLoginData");
		
		String Username = WS.getRow(1).getCell(0).getStringCellValue();
		String Password = WS.getRow(1).getCell(1).getStringCellValue();
		
		String results = NPL.LoginMethod(Username, Password);
		
		WS.getRow(1).createCell(2).setCellValue(results);
		
		FileOutputStream FOis = new FileOutputStream("V:\\MyFiles\\Live Tech\\WorkSpace\\NewProject\\TextInputs\\InputsData.xlsx");
		Wb.write(FOis);
		Wb.close();
		
		NPL.LogoutMethod();
		NPL.CloseMethod();
	}

}
