package com.saucelabs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTable {
	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub

		 

		File loc =new File("C:\\Users\\monimuru\\eclipse-workspace\\swaglabs\\excelfile\\.test2.xlsx");

		 

		FileInputStream fis=new FileInputStream(loc);

		 

		XSSFWorkbook w =new XSSFWorkbook(fis);

		XSSFSheet s= w.getSheetAt(0);

		 

		int rowCount = s.getPhysicalNumberOfRows();

		 

		for(int i=0;i< rowCount;i++) // 2 rows

		{

		XSSFRow r= s.getRow(i);

		 

		int cellCount = r.getPhysicalNumberOfCells();

		for(int j=0;j< cellCount;j++)

		{

		XSSFCell c= r.getCell(j);

		String cellValue = getCellValue(c);

		System.out.print("||"+cellValue);

		 

		}

		System.out.println();

		}

		w.close();

		fis.close();

		 

		}

		 

		public static String getCellValue(XSSFCell c)

		{

		switch(c.getCellType())

		{

		case STRING:

		return c.getStringCellValue();

		case NUMERIC:

		return String.valueOf(c.getStringCellValue());

		case BOOLEAN:

		return String.valueOf(c.getStringCellValue());

		 

		default:

		return c.getStringCellValue();

		}
		}
}
		 

		