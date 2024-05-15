package com.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");
	    driver.manage().window().maximize();
	   
        WebElement uname=driver.findElement(By.id("user-name"));
        uname.sendKeys("standard_user");
        Thread.sleep(1000);

        WebElement pwd=driver.findElement(By.id("password"));
        pwd.sendKeys("secret_sauce");
        Thread.sleep(1000);

        WebElement button=driver.findElement(By.id("login-button"));
        //button.click();
        
        button.submit();
        Thread.sleep(1000);
        driver.close();



		 

		    }

}
