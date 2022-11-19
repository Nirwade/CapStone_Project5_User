package medCapStone;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {
	
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	
	@BeforeTest
	public void DataSetUp() {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		 driver = new ChromeDriver ();
		 
		 driver.get("http://localhost:8009/medicare/home");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(700, TimeUnit.MILLISECONDS);
		 
		report = new ExtentReports("ExtentReports1.html");


	}
	
	@AfterTest
	public void DataTearDown() {
		
		report.flush();
		report.close();
		driver.close();

	}

    @BeforeMethod
	public void SetUp(Method method) {
	
	
    test=report.startTest(method.getName());
	
	 
} 
	 

   @AfterMethod 
   private void Teardown() {
	
    report.endTest(test);




}
	
}
