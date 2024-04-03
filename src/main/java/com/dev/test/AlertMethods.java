package com.dev.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.setup", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://letcode.in/alert/");
		driver.findElement(By.id("prompt")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Alert has been Accepted");
		driver.get("https://letcode.in/alert/");
		driver.findElement(By.id("prompt")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		System.out.println("Alert has been dismissed");
		driver.get("https://letcode.in/alert/");
		driver.findElement(By.id("prompt")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Hi Sankar");
		alert.accept();
		System.out.println("Sankar Entered his Name");
		driver.get("https://letcode.in/alert/");
		driver.findElement(By.id("modern")).click();
		String alertText = driver.findElement(By.className("title")).getText();
		System.out.println("Sweet Alert Text Message is:"+alertText);
		
		

//		
		driver.quit();
		
		
		
		
		
		
		

	}

}
