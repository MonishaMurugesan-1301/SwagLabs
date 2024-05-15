package com.saucelabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMethodApp {
	static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Desktop\\Path\\chromedriver-win64\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
	    driver.manage().window().maximize();
	    
	    String current=driver.getCurrentUrl();
	    System.out.println("the current URL=" +current);
	    
	    String title=driver.getTitle();
	    System.out.println("the title is:" +title);
	    
	    driver.close();
	    
	}
	
	
}
