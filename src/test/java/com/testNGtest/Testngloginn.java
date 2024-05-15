package com.testNGtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testngloginn {
	@Test
	
	public void Loginpage()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");
	    driver.manage().window().maximize();
	   
        WebElement uname=driver.findElement(By.id("user-name"));
        uname.sendKeys("standard_user");
      

        WebElement pwd=driver.findElement(By.id("password"));
        pwd.sendKeys("secret_sauce");
        

        WebElement button=driver.findElement(By.id("login-button"));
        //button.click();
        
        button.submit();
	}

}
