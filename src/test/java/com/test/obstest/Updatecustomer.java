package com.test.obstest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updatecustomer {

WebDriver driver = new ChromeDriver();
	
	@Test
	public void updateCust() throws
	InterruptedException {
		driver.get("http://localhost:3000");
		driver.findElement(By.id("cust-view")).click();		
		driver.findElement(By.name("btn-up")).click();
		driver.findElement(By.name("cname")).sendKeys(" A");
		Thread.sleep(5000);

		driver.findElement(By.id("sub-upt")).submit();
	}

}
