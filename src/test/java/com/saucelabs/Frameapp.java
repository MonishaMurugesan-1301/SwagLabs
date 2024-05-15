package com.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameapp {
	public static void main(String[] args) throws InterruptedException  {
	// TODO Auto-generated method stub
	
    System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
    driver.manage().window().maximize();
    
    driver.switchTo().frame("packageFrame");
   
    WebElement a=driver.findElement(By.xpath("//a[contains(text(),'AbstractAnnotations')]"));
    a.click();
   Thread.sleep(1000);
   driver.navigate().back();
   Thread.sleep(1000);
   
	}
}
