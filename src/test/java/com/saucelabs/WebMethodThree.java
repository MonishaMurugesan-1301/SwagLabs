package com.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMethodThree {
	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    //driver.findElement(By.linkText("Images")).click();
	    //Thread.sleep(2000);
	    
	    WebElement a=driver.findElement(By.partialLinkText("Gma"));
	    Thread.sleep(2000);
	    System.out.println(a.getText());
	    a.click();
        driver.close();
	}
}
