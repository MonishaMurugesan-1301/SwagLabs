package com.saucelabs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCount {
	
	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		
		//location

		 File loc=new File("C:\\Users\\monimuru\\eclipse-workspace\\swaglabs\\excelfile\\.test2.xlsx");

		 //read the input

		FileInputStream fis= new FileInputStream(loc);

		XSSFWorkbook w=new XSSFWorkbook(fis);

		 

		Sheet s= w.getSheetAt(0);
		//sheet s=w.getSheet("Sheet1");
		
		//using for loop
		int rows=s.getLastRowNum();
		int cols=s.getRow(0).getLastCellNum();
		
		System.out.println(rows);
		System.out.println(cols);
		
		w.close();
		fis.close();
		
	}

}

	

