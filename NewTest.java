package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
		private WebDriver driver = new ChromeDriver();;
		@Test
		public void testEasy() {
			driver.get("http://demo.guru99.com/test/guru99home/");
			String title = driver.getTitle();
			Assert.assertTrue(title.contains("Demo Guru99 Page"));
		}
		@BeforeTest
		public void beforeTest() {
			//NewTest nt = new NewTest();
			System.setProperty("webdriver.chrome.driver", "C://Users/venkata.reddy.sykam/selemium/nodes/chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
		}
		@AfterTest
		public void afterTest() {
			driver.quit();
		}
}