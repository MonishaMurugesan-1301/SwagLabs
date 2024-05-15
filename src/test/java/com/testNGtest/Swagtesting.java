package com.testNGtest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Swagtesting {
	
	@Test

 public void SwagSearch1()
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.saucedemo.com");
    driver.manage().window().maximize();
    
    String expectedTitle= "google";
    String actualtitle = driver.getTitle();
    assertEquals(actualtitle,expectedTitle,"title mismatched");
    
    String actualUrl= "google";
    String expectedUrl = driver.getTitle();
    assertEquals(actualUrl,expectedUrl,"Url mismatched");
    
    driver.quit();
    
}
}
    
    
    
    
