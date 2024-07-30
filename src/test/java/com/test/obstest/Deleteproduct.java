package com.test.obstest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deleteproduct {

	WebDriver driver = new ChromeDriver();

	@Test
	public void deleteProd() throws InterruptedException {
		driver.get("http://localhost:3000");
		driver.findElement(By.id("view")).click();
		driver.findElement(By.id("del-btn")).click();
		Thread.sleep(5000);

	}

}
