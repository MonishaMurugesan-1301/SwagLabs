package com.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectapptwo {
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.rediff.com/");
	    driver.manage().window().maximize();
	    
	    Actions act=new Actions(driver);
	    
	   WebElement acc=driver.findElement(By.xpath("//a[@href='http://register.rediff.com/register/register.php?FormName=user_details']"));
	    
			act.moveToElement(acc).doubleClick().build().perform();
	}
	    

}
