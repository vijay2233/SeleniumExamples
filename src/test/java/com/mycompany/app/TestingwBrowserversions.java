package javacodegeeks.seleniumHeadlessBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.io.File;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;


public class TestingwBrowserversions {

	@Test
	public void testEasy() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C://Users/venkata.reddy.sykam/selemium/nodes/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.navigate().to("http://google.com");
		//driver.navigate().to("http://localhost:8080/WebApp-1.0.0-SNAPSHOT/sample.html");
		String appTitle = driver.getTitle();
		this.takeSnapShot(driver, "googlepaghe.png") ;
		System.out.println("Application title is :: "+appTitle);
		WebElement java = driver.findElement(By.name("q"));
		java.sendKeys("Java Code Geeks");
		java.submit();
		this.takeSnapShot(driver, "googlesearch.png") ;
		System.out.println("Title of the page now is " + driver.getTitle());

		//driver.quit();
	}
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
}

