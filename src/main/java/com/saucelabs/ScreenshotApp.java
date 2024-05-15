package com.saucelabs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotApp {
	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");
	    driver.manage().window().maximize();
	    
	    File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    File destFile = new File("./Screenshots/img1.png");
	    FileUtils.copyFile(sourceFile,destFile);
	    System.out.println("Screenshot successful");
	    
	}
}
	    
	    
	    
	
	
	


