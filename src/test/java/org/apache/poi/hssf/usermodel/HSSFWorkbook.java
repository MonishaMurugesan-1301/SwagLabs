
package saucelabs.logpage;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class Excelfile {
 
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        /*File file=new File("C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\logpage\\src\\test\\java\\saucelabs\\logpage\\Excelfold\\t.xlsx");
        FileOutputStream fos=new FileOutputStream(file); 
        Workbook w=new XSSFWorkbook();
        Sheet sheet=w.createSheet();
        sheet.createRow(0);
        sheet.getRow(0).createCell(0).setCellValue("hello");
        sheet.getRow(0).createCell(1).setCellValue("i am ");
        sheet.getRow(0).createCell(2).setCellValue("savee");
        sheet.createRow(1);
        sheet.getRow(1).createCell(0).setCellValue("hello");
        sheet.getRow(1).createCell(1).setCellValue("This is ");
        sheet.getRow(1).createCell(2).setCellValue("savee");
        w.write(fos);
        w.close();*/
        File file=new File("C:\\Windows\\System32\\config\\systemprofile\\eclipse-workspace\\logpage\\src\\test\\java\\saucelabs\\logpage\\Excelfold\\t2.xls");
        FileOutputStream fos=new FileOutputStream(file); 
        Workbook w=new HSSFWorkbook();
        Sheet sheet=w.createSheet("TestSheet1");
        sheet.createRow(0);
        sheet.getRow(0).createCell(0).setCellValue("hello");
        sheet.getRow(0).createCell(1).setCellValue("i am ");
        sheet.getRow(0).createCell(2).setCellValue("savee");
        Sheet sheet1=w.createSheet("TestSheet2");
        sheet1.createRow(1);
        sheet1.getRow(1).createCell(0).setCellValue("Capg");
        sheet1.getRow(1).createCell(1).setCellValue("This is ");
        sheet1.getRow(1).createCell(2).setCellValue("savee");
        w.write(fos);
        w.close();
    }
 
}

[15:57] MURUGESAN, MONISHA
done nga

