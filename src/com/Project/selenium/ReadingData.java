package com.Project.selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData {

	public static void main(String[] args) throws Throwable 
	{
		FileInputStream fis = new FileInputStream("V:\\MyFiles\\Live Tech\\WorkSpace\\NewProject\\TextInputs\\InputsData.xlsx");

		XSSFWorkbook Wb= new XSSFWorkbook(fis);
		XSSFSheet WS= Wb.getSheet("ORMHRMLoginData");	
		
		
		  String Edata = WS.getRow(0).getCell(0).getStringCellValue(); String Edata1 =
		  WS.getRow(0).getCell(1).getStringCellValue();
		  
		  String Adata = WS.getRow(1).getCell(0).getStringCellValue(); String Adata1 =
		  WS.getRow(1).getCell(1).getStringCellValue();
		  
		  System.out.println(Edata + "  " + Edata1);
		  
		  System.out.println(Adata + "    " + Adata1);
		 
		
		  int rwc = WS.getLastRowNum();
			
			for (int i = 0; i <=rwc; i++) 
			{
				String Edata2 = WS.getRow(i).getCell(0).getStringCellValue();
				String Edata3 = WS.getRow(i).getCell(1).getStringCellValue();
				
				System.out.println(Edata2 + "  " + Edata3);
			}
		
		
		WS.getRow(0).createCell(2).setCellValue("Results");
		WS.getRow(1).createCell(2).setCellValue("Pass");
		
		FileOutputStream FOis = new FileOutputStream("V:\\MyFiles\\Live Tech\\WorkSpace\\NewProject\\TextInputs\\InputsData.xlsx");
		Wb.write(FOis);
		Wb.close();
		
		
        
	}
}
