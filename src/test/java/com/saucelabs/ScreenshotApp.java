package com.saucelabs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotApp {
	public static void main(String[] args) throws InterruptedException, IOException  {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");
	    driver.manage().window().maximize();
	    

        // File sourcefile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // File destfile=new File("./Screenshot/img1.png");
         //FileUtils.copyFile(sourcefile, destfile);
         //System.out.println("Screenshot successful");

         driver.findElement(By.id("login-button")).click();

         TakesScreenshot ts=(TakesScreenshot)driver;
         File file=ts.getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(file, new File("./Screenshot/img3.png"));
         driver.quit();
	    
	    }



}
