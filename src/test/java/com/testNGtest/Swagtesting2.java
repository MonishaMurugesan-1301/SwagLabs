package com.testNGtest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Swagtesting2 {
	@Test

	 public void SwagSearch1()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    
	    String expectedTitle= "google";
	    String actualTitle = driver.getTitle();
	    SoftAssert softAssert= new SoftAssert();
	    //softAssert.assertAll();
		softAssert.assertEquals(actualTitle,expectedTitle,"title mismatched");
	    
		
	    String actualUrl= driver.getCurrentUrl();
	    String expectedUrl = "https://www.facebook.com/";
	    softAssert.assertEquals(actualUrl,expectedUrl,"Url mismatched");
	    softAssert.assertAll();
	    driver.quit();
	    
	}
}
	    


