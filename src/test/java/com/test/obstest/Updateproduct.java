package com.test.obstest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updateproduct {

WebDriver driver = new ChromeDriver();
	
	@Test
	public void updateProd() throws
	InterruptedException {
		driver.get("http://localhost:3000/View");		
		driver.findElement(By.name("btn-upt")).click();
		driver.findElement(By.name("pname")).sendKeys(" pro");
		Thread.sleep(5000);

		driver.findElement(By.id("sub")).submit();
	}

}
