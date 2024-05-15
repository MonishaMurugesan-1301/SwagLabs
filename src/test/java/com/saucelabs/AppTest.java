package com.saucelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class AppTest {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\monimuru\\Downloads\\chromedriver.exe" );

        WebDriver driver=new ChromeDriver();
        // TODO Auto-generated method stub

         driver.get("https;//www.google.com");
         driver.manage().window().maximize();

         driver.findElement(By.linkText("Images")).click();



         Thread.sleep(1000);
         driver.close();



 

    }

 

 

    }

 