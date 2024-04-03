package com.dev.test;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.setup", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		System.out.println("Entered Selenium");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.F5);
		System.out.println("Page Refreshed");
		driver.get("https://demo.guru99.com/test/upload/");
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\SeleniumAutomation\\TestAutomationFramework\\test-data\\login-data.xlsx");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		String text = driver.findElement(By.xpath("//h3[@class='demo']//center[1]")).getText();
		System.out.println(text);
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
