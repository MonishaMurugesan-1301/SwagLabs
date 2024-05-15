package org.apache.poi.hssf.usermodel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.google.common.collect.Table.Cell;

public class ExcelReadDemo {
	
	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub

		 

		File loc =new File("C:\\Users\\monimuru\\eclipse-workspace\\swaglabs\\excelfile\\.test2.xlsx");

		 

		FileInputStream fis= new FileInputStream(loc);

		Workbook w=new XSSFWorkbook(fis);

		 

		Sheet s= w.getSheet("TestSht");
		//Rows
		Row r=s.getRow(0);
		
		//cells
		Cell c=r.getCell(0);
		System.out.println(c);
		
		w.close();
		fis.close();
		
	}
		

	
	

}
