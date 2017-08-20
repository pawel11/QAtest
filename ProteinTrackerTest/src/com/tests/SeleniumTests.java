package com.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {
	@Test
	public void CanOpenGoogle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\TestAutomation\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebElement searchTab = driver.findElement(By.id("lst-ib"));
		searchTab.sendKeys("Hello World", Keys.ENTER);
		
		//Thread.sleep(3000);
		driver.close();
	}

}
