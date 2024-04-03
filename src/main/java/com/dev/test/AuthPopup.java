package com.dev.test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.setup", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		System.out.println("Auth Popup is Done");
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
