package com.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\ChPath\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");
	    driver.manage().window().maximize();
	   
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("secret_sauce");
        Thread.sleep(1000);

        WebElement button=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        //button.click();
        
        button.submit();
        Thread.sleep(1000);
        driver.close();


		 

		    }

}


