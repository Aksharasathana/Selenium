package com.dev.test;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException, AWTException {
		
		System.setProperty("webdriver.chromedriver.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://letcode.in/");
		
		//Method 1:
		Robot robot = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    Rectangle rectangle = new Rectangle(screenSize);
	    BufferedImage source = robot.createScreenCapture(rectangle);
	    File destin = new File("./snaps/robotsnapsimage.png");
	    ImageIO.write(source, "png", destin);
	    
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		
		//Method 2:
		File firstSource = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/image15.png");
		FileHandler.copy(firstSource, dest);
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'box column')]"));
		File first = element.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snaps/image16.png");
		FileHandler.copy(first, destination);
		driver.findElement(By.name("email")).sendKeys("Sankar");
		driver.findElement(By.name("password")).sendKeys("Test password");		
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		//Method 3:
		TakesScreenshot screenshotNew = (TakesScreenshot) driver;
		File firstShot = screenshotNew.getScreenshotAs(OutputType.FILE);
		File destinationShot = new File("./snaps/image9.png");
		FileHandler.copy(firstShot, destinationShot);
		
		
		
		System.out.println("Screenshot Done");
		
		driver.quit();
		
		
		

	}

}
