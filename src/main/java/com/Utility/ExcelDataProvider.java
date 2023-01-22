package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	public static XSSFWorkbook bw;
	
	public ExcelDataProvider() throws Exception {
		
		String pathExcel="E:\\java\\FrameWork2023\\TestData\\ExcelData.xlsx";
		FileInputStream fis=new FileInputStream(pathExcel);
		bw=new XSSFWorkbook(fis);
		
	}
	 
	public static String  getStringData(String SheetName, int row, int cell) {
		
		return bw.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		
	}
	
	
	
	
	
	
	

}
