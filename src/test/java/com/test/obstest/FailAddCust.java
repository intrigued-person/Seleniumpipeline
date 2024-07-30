package com.test.obstest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FailAddCust {

	WebDriver driver = new ChromeDriver();

	@Test
	public void addProd() throws InterruptedException {
		driver.get("http://localhost:3000");
		driver.findElement(By.id("reg-cust")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("cname")).sendKeys("shakeel");
		Thread.sleep(2000);
		driver.findElement(By.name("mobile")).sendKeys("9952721019");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.name("pid")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("pid"));
	      dropdown.findElement(By.xpath("//option[. = '1']")).click();
	    }
	    // driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.id("add-btn")).submit();
		
		Alert alert = driver.switchTo().alert(); // switch to alert
		 
		String alertMessage = driver.switchTo().alert().getText(); // capture alert message
 
		System.out.println(alertMessage); // Print Alert Message
		Thread.sleep(5000);
		alert.accept();

	}

}
