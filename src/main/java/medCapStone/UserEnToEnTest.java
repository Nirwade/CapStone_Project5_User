package medCapStone;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import userEnToEnPage.UserEnToEnPageClass;

public class UserEnToEnTest extends BaseClass {

	
	@Test(priority=1)
	public void loginPassTest() {
		
	UserEnToEnPageClass page = new UserEnToEnPageClass ();
	page.loginFunction("kn@gmail.com", "12345");
		

	}
	
	@Test(priority =0, enabled = false)
	public void LoginFailTest ()  {
		
	UserEnToEnPageClass page = new UserEnToEnPageClass ();
	page.loginFunction("shash@gmail.com", "q4fdns");
	
 
	}
	
	
	@Test(priority=2, enabled = true)
	public void HomePageTest() {
		
	UserEnToEnPageClass page = new UserEnToEnPageClass ();
	page.HomePage();


	}

	
       
	   @Test(priority=3, enabled = true)
	   public void checkout() {
	    	  
	   UserEnToEnPageClass page = new UserEnToEnPageClass ();
	   page.checkoutFunction();
			 
	      }
	      	 
			 
	 }
		
	


