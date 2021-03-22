package com.groot.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet{
	static String excellocation = "C:\\Users\\Senthilnathan\\workspace\\GrootanTechnology\\Excelsheet\\Test_Data.xlsx";
	static String sheetName = "Test_Data";
public void writefile (String nameRec, int getcell, int getrow, int sheetnum) throws Exception{
	File src = new File (excellocation);
	FileInputStream fis = new FileInputStream(src);
	XSSFWorkbook xsf = new XSSFWorkbook(fis);
	XSSFSheet sheet = xsf.getSheetAt(sheetnum);
	sheet.getRow(getcell).getCell(getrow).setCellValue(nameRec);
	FileOutputStream fos = new FileOutputStream(src);
	xsf.write(fos);
	xsf.close();
	
}

}