package com.saucelabs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceltest {


public static void main(String[] args) throws IOException {

// TODO Auto-generated method stub

 

File file =new File("C:\\Users\\monimuru\\eclipse-workspace\\swaglabs\\excelfile\\.test1.xlsx");

 

FileOutputStream fos= new FileOutputStream(file);

Workbook w=new XSSFWorkbook();

 

Sheet sheet= w.createSheet("TestSheet");

sheet.createRow(0);

sheet.getRow(0).createCell(0).setCellValue("priya");

sheet.getRow(0).createCell(1).setCellValue("4546537");

 

Sheet s=w.createSheet("TestSh1");

s.createRow(0);

s.getRow(0).createCell(0).setCellValue("rahul");

s.getRow(0).createCell(1).setCellValue("3244243");

 

 

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


