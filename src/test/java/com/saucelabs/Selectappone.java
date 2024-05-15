package com.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectappone {
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
	    driver.manage().window().maximize();
	    
	    WebElement a=driver.findElement(By.id("cars"));
	    Select s=new Select(a);
	    
	    boolean b=s.isMultiple();
	    System.out.println(b);
	    
	    s.selectByIndex(0);
	    Thread.sleep(1000);
	    
	    s.selectByValue("saab");
	    Thread.sleep(1000);
	    
	    s.selectByVisibleText("Audi");
	    Thread.sleep(1000);
	    
	    //s.deselectByVisibleText("Audi");
	    //Thread.sleep(1000);
	    
	    s.deselectAll();
	    //driver.close();
	}

}
