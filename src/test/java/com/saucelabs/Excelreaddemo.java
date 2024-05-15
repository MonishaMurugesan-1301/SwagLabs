package com.saucelabs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreaddemo {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub

		 

		File loc =new File("C:\\Users\\monimuru\\eclipse-workspace\\swaglabs\\excelfile\\.test2.xlsx");

		 

		FileInputStream fis= new FileInputStream(loc);

		XSSFWorkbook w=new XSSFWorkbook(fis);

		 

		Sheet s= w.getSheetAt(0);
		
		String cellValue = s.getRow(0).getCell(1).getStringCellValue();
		System.out.println(cellValue);
		
		w.close();
		fis.close();
		
	}

}
