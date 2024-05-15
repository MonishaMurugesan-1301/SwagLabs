package com.saucelabs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooktest {
	 public static void main(String[] args) throws InterruptedException, AWTException {​​​​​​​
	        WebDriver driver=new ChromeDriver();
	        // TODO Auto-generated method stub
	         
	         driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9061994%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI78KM9LSW_AIVEpNmAh3fmQp6EAAYASAAEgK6BPD_BwE");
	         driver.manage().window().maximize();
	         
	         String current=driver.getCurrentUrl();
	         System.out.println("the current url is"+  current);
	         
	        String title=driver.getTitle();
	        System.out.println("the title is"+ title);
	         
	         Robot robot=new Robot();
	          Thread.sleep(2000);
	          
	          robot.keyPress(KeyEvent.VK_DOWN);
	          Thread.sleep(2000);
	           


	         
	         driver.findElement(By.name("firstname")).sendKeys("Monisha");
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	         
	         
	         driver.findElement(By.name("lastname")).sendKeys("M");
	         
	         
	         
	         driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("mmonisha5577@gmail.com");
	         
	         
	         driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mmonisha5577@gmail.com");
	        
	         
	         driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("MonishaM@123");
	        
	         
	         WebElement a= driver.findElement(By.id("day"));
	         
	         Select s= new Select(a);
	         
	          s.selectByValue("2");
	          
	          System.out.println(a.getAttribute("type"));
	        System.out.println(a.getTagName());
	        
	          
	          WebElement b= driver.findElement(By.id("month"));
	          Select s1= new Select(b);
	          
	          s1.selectByVisibleText("Aug");
	          
	          
	          WebElement c= driver.findElement(By.id("year"));
	          @SuppressWarnings("unused")
	        Select s2= new Select(c);
	          
	          s2.selectByValue("2000");
	          
	          
	          
	          WebElement radio1 = driver.findElement(By.xpath("//input[@value='1']"));
	          
	          @SuppressWarnings("unused")
	        WebElement radio2 = driver.findElement(By.xpath("//input[@value='2']"));
	          
	          @SuppressWarnings("unused")
	        WebElement radio3 = driver.findElement(By.xpath("//input[@value='-1']"));
	          
	          radio1.click();
	          
	        
	          
	          
	          driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	      Thread.sleep(2000);
	          
	          
	          
	          driver.close(); 
	         
	          
	          
         }
	 
	 
	 
}​​​​​​​
