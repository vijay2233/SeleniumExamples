package com.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class GoogleSearchTest {

	@Test
	public void testEasy() {
		System.setProperty("webdriver.chrome.driver", "C://Users/venkata.reddy.sykam/selemium/nodes/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.navigate().to("http://google.com");
		//driver.navigate().to("http://localhost:8080/WebApp-1.0.0-SNAPSHOT/sample.html");
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+appTitle);
		Assert.assertTrue(appTitle.equalsIgnoreCase("Google"), "Page title does not match");
		//driver.quit();
	}
}