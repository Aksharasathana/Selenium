package com.dev.test;

import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.setup", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		WebElement element = driver.findElement(By.xpath("(//input[@name='btnI'])[2]"));
		System.out.println(element.getTagName());
		System.out.println(element.getCssValue("background-color"));
		System.out.println(element.getCssValue("colour"));
		System.out.println(element.getCssValue("font-size"));
		System.out.println(element.getCssValue("font-family"));
		
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
