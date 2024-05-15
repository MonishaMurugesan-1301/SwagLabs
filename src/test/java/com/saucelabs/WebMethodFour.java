package com.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMethodFour {
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	    
	    System.out.println(driver.getCurrentUrl());

	    String title=driver.getTitle();
	    System.out.println("the title is:" +title);
	    
	    WebElement a=driver.findElement(By.id("user-name"));
	    System.out.println(a.getAttribute("class"));
	    System.out.println(a.getTagName());
	    try
	    {
	    	WebElement b=driver.findElement(By.id("login-button"));
	    	String logcolor=b.getCssValue("color");
	    	System.out.println(logcolor);
	    }
	    finally
	    {
	    driver.close();
	    }
	}
}
