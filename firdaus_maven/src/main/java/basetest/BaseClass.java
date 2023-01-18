package basetest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
//import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass 
{
		public static WebDriver driver=null;
		public static WebDriverWait wait;
		
		@BeforeClass
		public void display1() throws IOException
		{
			ExtentReport.setExtent();
		}
		
		
		@AfterClass
		public void display2()
		{
			ExtentReport.endReport();
		}
		
		
//		public void browserOpen()
//		{
//			driver=new ChromeDriver();
//			driver.get("https://surlelac.co/");
//			driver.manage().window().maximize();
//		}
		
		@BeforeTest
		@Parameters("browserName")
		public void openBrowser(String browserName) throws InterruptedException {
			 if(browserName.equals("chrome")) {
				 WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
				 System.out.println("Testing on Chrome");
			 }
//			 else if (browserName.equals("MicrosoftEdge")) {
//				 WebDriverManager.edgedriver().setup();
//				 driver = new EdgeDriver();
//				 System.out.println("Testing on MicrosoftEdge");
//			 }
			 else {
				 System.out.println("No Browser Configured...");
			 }
//			 driver.get("https://surlelac.co/collections/all");
			 
			 driver.get("https://surlelac.co/checkouts/c/73c56a5a4e6cb387ca8e9328da73dc81/information?_ga=2.117286530.502436197.1673939743-1859835451.1672231039");
//			 driver.get(TestUtiels.getPropertiesData("url"));
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
		}

		public static void explicitWait(WebElement element )
		{
			wait = new WebDriverWait(driver,Duration.ofSeconds(15));		
			wait.until(ExpectedConditions.visibilityOfAllElements(element));		
		}
		
		public void backto()
		{
			driver.navigate().back();
		}
		
		//Close browser
		
		public void browserClose()
		{
			driver.quit();
		}
		
		


}
