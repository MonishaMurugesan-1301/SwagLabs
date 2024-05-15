package com.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author monimuru
 *
 */
public class LinkTest {
		
		/**
		 * @param args
		 * @throws InterruptedException
		 */
		public static void main(String[] args) throws InterruptedException  {
			// TODO Auto-generated method stub
			
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
	        driver.get("https://www.saucedemo.com");
		    driver.manage().window().maximize();
		    //driver.findElement(By.linkText("Images")).click();
		    //Thread.sleep(2000);
		    driver.findElement(By.partialLinkText("gma")).click();
            driver.close();
            Thread.sleep(2000);
	}

}
