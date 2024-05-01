package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtilities 
{
	Workbook wb;
	public ExcelFileUtilities() throws Throwable
	{
		FileInputStream FIS = new FileInputStream("V:\\\\MyFiles\\\\Live Tech\\\\WorkSpace\\\\NewProject\\\\TextInputs\\\\InputsData.xlsx");
		wb= WorkbookFactory.create(FIS);
	}
	//rowcount
	public int rowCount(String sheetname) 
	{
		return wb.getSheet(sheetname).getLastRowNum();
	}
	//Column Count
	public int ColumnCount(String sheetname, int row) 
	{
		return wb.getSheet(sheetname).getRow(row).getLastCellNum();
		
	}
	
	//Reading Data
	public String getData(String sheetname, int row, int column) 
	{
		String data="";
		if (wb.getSheet(sheetname).getRow(row).getCell(column).getCellType()==CellType.NUMERIC) 
		{
			int celldata = (int)wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			data=String.valueOf(celldata);
		}
		else
		{
			data=wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		}
		return data;
	}
	
	//Writing Data
	//WS.getRow(0).createCell(2).setCellValue("Results");
	public void SetData(String sheetname, int row, int column, String status) throws Throwable 
	{
		Sheet sh= wb.getSheet(sheetname);
		Row rownum = sh.getRow(row);
		Cell cellnum= rownum.createCell(column);
		
		cellnum.setCellValue(status);
		
		FileOutputStream  fos= new FileOutputStream("V:\\MyFiles\\Live Tech\\WorkSpace\\NewProject\\TextOutput\\OutputData.xlsx"); 
		wb.write(fos);
		fos.close();
		
	}

}
