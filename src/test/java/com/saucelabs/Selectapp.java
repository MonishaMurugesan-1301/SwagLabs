package com.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectapp {
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details/");
	    driver.manage().window().maximize();
	    
	    WebElement a=driver.findElement(By.id("country"));
	    Select s=new Select(a);
	    
	    s.selectByIndex(0);
	    Thread.sleep(1000);
	    
	    s.selectByValue("56");
	    Thread.sleep(1000);
	    
	    s.selectByVisibleText("Germany");
	    Thread.sleep(1000);
	    
	    driver.close();
	}
	    
}
