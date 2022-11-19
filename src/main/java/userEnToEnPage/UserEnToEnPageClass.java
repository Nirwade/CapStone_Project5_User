package userEnToEnPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import medCapStone.BaseClass;

public class UserEnToEnPageClass extends BaseClass  {
	
	WebDriver driver = BaseClass.driver;
	ExtentTest test = BaseClass.test;
	
//	=========================================WebElements============================================
	
    @FindBy(xpath="//a[@href='/medicare/login']")
	WebElement login;
    
    @FindBy(xpath="//input[@id='username']")
    WebElement user;
    
    @FindBy(xpath="//input[@id='password']")
    WebElement passwrd;
   
    @FindBy(xpath="//input[@value='Login']")
    WebElement submit;
    
    @FindBy(xpath="//a[@href='/medicare/show/all/products']")
    WebElement viewprod;
    
    @FindBy(xpath="//a[@href='/medicare/show/1/product']")
    WebElement showprod;
    
    @FindBy(xpath="//div[@class='se-pre-con']")
    WebElement prod1added;
    
    @FindBy(xpath="//a[@href='/medicare/show/all/products']")
    WebElement viewprod1;
    
    @FindBy(xpath="//a[@href='/medicare/show/2/product']")
    WebElement showprod2;
    
    @FindBy(xpath="//div[@class='se-pre-con']")
    WebElement prod2added;
    
    @FindBy(xpath="//a[@href='/medicare/show/all/products']")
    WebElement viewprod2;
    
    @FindBy(xpath="//a[@href='/medicare/show/3/product']")
    WebElement showprod3;
    
    @FindBy(xpath="//div[@class='se-pre-con']")
    WebElement prod3added;
    
    @FindBy(xpath="//a[@href='/medicare/show/all/products']")
    WebElement viewprod3;
    
    @FindBy(xpath="//a[@href='/medicare/show/4/product']")
    WebElement showprod4;
    
    @FindBy(xpath="//div[@class='se-pre-con']")
    WebElement prod4added;
    
    @FindBy(xpath="//a[@href='/medicare/show/all/products']")
    WebElement viewprod4;
    
    @FindBy(xpath="//a[@href='/medicare/show/5/product']")
    WebElement showprod5;
    
    @FindBy(xpath="//a[@href='/medicare/cart/add/5/product']")
    WebElement prod5added;
    
    @FindBy(xpath="//a[@href='/medicare/cart/validate']")
    WebElement checkout1;
    
    @FindBy(xpath="//a[text() ='Select']")
    WebElement selctAdres;
    
    @FindBy(xpath="//a[text() ='Pay']")
    WebElement paymnt;
    
    @FindBy(xpath="//h3[@class='text-center']")
    WebElement odrConfdActul;
    
//    @FindBy(xpath="//div[text()='Username and Password is invalid!']")
//    WebElement Login1click;
   
    
    public UserEnToEnPageClass () {
    	
    PageFactory.initElements(driver,this);
    	
    }
    
 //========================================= Functions====================================================
    
    public void loginFunction(String Username, String Password) {
    	
    	WebDriverWait wait = new WebDriverWait(driver,300);
   	 wait.until(ExpectedConditions.elementToBeClickable(login));
		 login.click();
		 test.log(LogStatus.PASS, "login page clicked successfully");
		 
         user.sendKeys(Username);
         test.log(LogStatus.PASS, "Username Clicked succesfully");
         
         passwrd.sendKeys(Password);
         test.log(LogStatus.PASS, "Password clcicked succesfully");

         submit.click();
         test.log(LogStatus.PASS, "Login Successfull");
         
//         String LogfailActulMsg  = Login1click.getText();
//    	 String ExpedMsg = "Username and Password is invalid!";
//         String ActulMsg = LogfailActulMsg;
//         Assert.assertEquals(ActulMsg, ExpedMsg);
//         test.log(LogStatus.FAIL, "unsuccessful login");
    	
         
    }      
     
    
    public void HomePage() {
        	 
    	 WebDriverWait wait = new WebDriverWait(driver,700);
    	 wait.until(ExpectedConditions.elementToBeClickable(viewprod));
    	 viewprod.click();
         test.log(LogStatus.PASS, "Viewproduct clicked successfully");
         
         List <WebElement> prodinpage1=driver.findElements(By.xpath("//a[@class='btn btn-success']"));
         System.out.println("The number of products are " + prodinpage1.size() );
    	 for (WebElement prodlists :prodinpage1) {
         System.out.println(prodlists.getAttribute("href"));
    	 }
    		 
   	     wait.until(ExpectedConditions.elementToBeClickable(showprod));
   		 showprod.click(); 
   		 test.log(LogStatus.PASS, "Show product clicked successfully");
   		 
   		 
	     wait.until(ExpectedConditions.elementToBeClickable(prod1added));
	     prod1added.click(); 
	     test.log(LogStatus.PASS, "product 1 added successfully");

	     wait.until(ExpectedConditions.elementToBeClickable(viewprod1));
  		 viewprod1.click();
         test.log(LogStatus.PASS, "viewprod1 clicked successfully");
         
         wait.until(ExpectedConditions.elementToBeClickable(showprod2));
		 showprod2.click();
         test.log(LogStatus.PASS, "showprod2 clicked successfully");
         
         wait.until(ExpectedConditions.elementToBeClickable(prod2added));
         prod2added.click();
         test.log(LogStatus.PASS, "prod2added clicked successfully");
         
         wait.until(ExpectedConditions.elementToBeClickable(viewprod2));
         viewprod2.click();
         test.log(LogStatus.PASS, "viewprod2 clicked successfully");  
         
         wait.until(ExpectedConditions.elementToBeClickable(showprod3));
		 showprod3.click(); 
         test.log(LogStatus.PASS, "showprod3 clicked successfully");
         
         wait.until(ExpectedConditions.elementToBeClickable(prod3added));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", prod3added);
         test.log(LogStatus.PASS, "prod3added clicked successfully");
         
         wait.until(ExpectedConditions.elementToBeClickable(viewprod3));
         viewprod3.click();
         test.log(LogStatus.PASS, "viewprod3 clicked successfully");
         
         wait.until(ExpectedConditions.elementToBeClickable(showprod4));
		 showprod4.click();
         test.log(LogStatus.PASS, "showprod4 clicked successfully");
         
         wait.until(ExpectedConditions.elementToBeClickable(prod4added));
         prod4added.click();
         test.log(LogStatus.PASS, "prod4added clicked successfully");
         
         wait.until(ExpectedConditions.elementToBeClickable(viewprod4));
         viewprod4.click();
         test.log(LogStatus.PASS, "viewprod4 clicked successfully");
         
         wait.until(ExpectedConditions.elementToBeClickable(showprod5));
		 showprod5.click();
         test.log(LogStatus.PASS, "showprod5 clicked successfully");
         
         wait.until(ExpectedConditions.elementToBeClickable(prod5added));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", prod5added);
         test.log(LogStatus.PASS, "product5 added successfully");

    	 }
         
         
         
    	 public void checkoutFunction() {
    		   	 
        	WebDriverWait wait = new WebDriverWait(driver,500);
        	
            wait.until(ExpectedConditions.elementToBeClickable(checkout1));
           ((JavascriptExecutor)driver).executeScript("arguments[0].click();", checkout1) ;      	
            wait.until(ExpectedConditions.elementToBeClickable(selctAdres));
 			((JavascriptExecutor)driver).executeScript("arguments[0].click();", selctAdres);

 			test.log(LogStatus.PASS, "address selected successfully");
 			
            wait.until(ExpectedConditions.elementToBeClickable(paymnt));
            paymnt.click();
 			test.log(LogStatus.PASS, "Payment done");

 			String odrConfdActul1 = odrConfdActul.getText();
		    String odrConfdExptd= "Your Order is Confirmed!!";
		    Assert.assertEquals(odrConfdActul1, odrConfdExptd);

    	 }
		 
}

