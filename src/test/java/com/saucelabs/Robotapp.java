
package com.saucelabs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotapp {

		public static void main(String[] args) throws InterruptedException, AWTException  {
			// TODO Auto-generated method stub
			
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
	        driver.get("https://www.saucedemo.com");
		    driver.manage().window().maximize();
		    
		    Robot robot = new Robot(); //Robot class throws AWT Exception
		    Thread.sleep(2000);
		    
			robot.keyPress(KeyEvent.VK_DOWN);
		    Thread.sleep(2000);
		    
		    robot.keyPress(KeyEvent.VK_TAB); // un
		    Thread.sleep(2000);
		    
		    robot.keyPress(KeyEvent.VK_TAB);  //pwd
		    Thread.sleep(2000);
		    
		    robot.keyPress(KeyEvent.VK_TAB);  //login
		    Thread.sleep(2000);
		    
		    robot.keyPress(KeyEvent.VK_ENTER);
		    Thread.sleep(2000);
		    
		    WebElement a=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
		    System.out.println(a.getText());
		    driver.close();
		    
		}
}
		


