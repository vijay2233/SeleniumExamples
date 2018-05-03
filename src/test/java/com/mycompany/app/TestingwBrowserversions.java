package javacodegeeks.seleniumHeadlessBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestingwBrowserversions {

	@Test
	public void testEasy() {
		System.setProperty("webdriver.chrome.driver", "C://Users/venkata.reddy.sykam/selemium/nodes/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.navigate().to("http://google.com");
		//driver.navigate().to("http://localhost:8080/WebApp-1.0.0-SNAPSHOT/sample.html");
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+appTitle);
		WebElement java = driver.findElement(By.name("q"));
		java.sendKeys("Java Code Geeks");
		java.submit();

		System.out.println("Title of the page now is " + driver.getTitle());

		//driver.quit();
	}
}

