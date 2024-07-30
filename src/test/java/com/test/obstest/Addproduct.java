package com.test.obstest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addproduct {

	WebDriver driver = new ChromeDriver();
	
	@Test
	public void addProd() {
		driver.get("http://localhost:3000/create");		
		driver.findElement(By.name("pname")).sendKeys("vivo v30");
		driver.findElement(By.name("quantity")).sendKeys("100");
		driver.findElement(By.name("price")).sendKeys("36000");
		driver.findElement(By.id("sub")).submit();
	}

}
