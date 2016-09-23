package Com.selenium.automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class VerifyYahooTitle {
	
	// Declare the Webdriver as Instance varaible
	 private WebDriver driver;
	 
	// This our Expected Tittle(Result)
	 private String expectedTittle = "Yahoo";
	 
  @Test
  public void verifyTitle() {
	  
	  // Open the website
	  driver.get("https://in.yahoo.com/");
	  
	 // Get the actual title using selenium code
	  String actualTittle = driver.getTitle();
	  
	 /*
	  * Verify the page title using by comparision of Actual and Expected
	  * Title
	  */
	  
	 Assert.assertEquals(expectedTittle, actualTittle);
	  }
	  
  
  @BeforeTest
  public void invokeBrowser() {
	  
	// Invoking the firefox browser
	  driver = new FirefoxDriver();
	  }
	  
  

  @AfterTest
  public void closeBrowser() {
	  
	  driver.close();
  }

}
