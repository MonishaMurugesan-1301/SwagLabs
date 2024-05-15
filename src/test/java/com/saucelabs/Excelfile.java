package com.saucelabs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelfile {


public static void main(String[] args) throws IOException {

// TODO Auto-generated method stub

 

File file =new File("C:\\Users\\monimuru\\eclipse-workspace\\swaglabs\\excelfile\\.test2.xlsx");

 

FileOutputStream fos= new FileOutputStream(file);

Workbook w=new XSSFWorkbook();

 

Sheet sheet= w.createSheet("TestSht");

sheet.createRow(0);

sheet.getRow(0).createCell(0).setCellValue("monish");

sheet.getRow(0).createCell(1).setCellValue("5555555");

sheet.getRow(0).createCell(3).setCellValue("48765555");

 

Sheet s=w.createSheet("TS 1");

s.createRow(0);

s.getRow(0).createCell(0).setCellValue("pranesh");

s.getRow(0).createCell(1).setCellValue("7777777");

 

 

w.write(fos);

w.close();

 

 

// Workbook w=new HSSFWorkbook();

// //HSSFWorkbook w=new HSSFWorkbook();

// Sheet sheet=w.createSheet();

// sheet.createRow(0);

// sheet.getRow(0).createCell(0).setCellValue("hello");

// sheet.getRow(0).createCell(1).setCellValue("world");

// sheet.getRow(0).createCell(2).setCellValue("welcome");

//

// sheet.createRow(1);

// sheet.getRow(1).createCell(0).setCellValue("Capgemini");

// sheet.getRow(1).createCell(1).setCellValue("welcome's");

// sheet.getRow(1).createCell(2).setCellValue("Employees");

//

// w.write(fos);

// w.close();

 

}

 

}


