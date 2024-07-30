package com.test.obstest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FailAddProd {

	WebDriver driver = new ChromeDriver();

	@Test
	public void addProd() throws
	InterruptedException{
		driver.get("http://localhost:3000/create");
		driver.findElement(By.name("pname")).sendKeys("oneplus nord 2");
		driver.findElement(By.name("quantity")).sendKeys("10");
		driver.findElement(By.name("price")).sendKeys("");
		driver.findElement(By.id("sub")).submit();
		
		Alert alert = driver.switchTo().alert(); // switch to alert
		 
		String alertMessage = driver.switchTo().alert().getText(); // capture alert message
 
		System.out.println(alertMessage); // Print Alert Message
		Thread.sleep(5000);
		alert.accept();
	}

}
