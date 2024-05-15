package com.testNGtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGlog {
	WebDriver d=null;
	
	
	 @Test
	 public void Swagsearch()	 
	 {
​​​​​​​				System.setProperty("webdriver.chrome.driver", "C:\\Users\\monimuru\\Downloads\\chromedriver.exe" );
	                
	                d=new ChromeDriver();
	                // TODO Auto-generated method stub
	                 
	                 d.get("https://www.saucedemo.com");
	                 d.manage().window().maximize();
	 
	                 
	                d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
	                
	                 
	                 d.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
	                 
	                 
	                d.findElement(By.id("login-button")).click();
	                
	 }
	 
}


