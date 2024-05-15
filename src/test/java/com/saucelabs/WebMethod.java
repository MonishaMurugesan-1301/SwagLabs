package com.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMethod {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Desktop\\Path\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.linkText("Images")).click();
	    Thread.sleep(3000);
	    
	    driver.navigate().back();
	    Thread.sleep(5000);
	    
	    driver.navigate().forward();
	    Thread.sleep(6000);

	    driver.navigate().refresh();
	    Thread.sleep(7000);
	    
	    driver.close();
	   


	}

}
