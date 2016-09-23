package Com.selenium.automate;


import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TakeScreenShot {
	WebDriver driver;
  @Test
  public void captureFailTestScreenShot() throws Exception {
	  
	  try {
		  
		// Enter UserName in UserName field
		 WebElement uName = driver.findElement(By.id("email"));
		 uName.sendKeys("rajattiwari92@gmail.com");
		 
		 // Enter password in password field
		 WebElement password = driver.findElement(By.id("pass"));
		 password.sendKeys("tiwari@2");
		 
		 // Click on Login button
		 driver.findElement(By.id("loginbuton")).click();
		 
		 /*
		 * Now we will verify the Expected page, After successful login User
		 * should land on facebook home page. So We will verify the Page
		 * title.
		 */
		 Assert.assertEquals("FaceBook", driver.getTitle());
		 } catch (Exception e) {
		 System.out.println("I'm in exception");
		 
		 // calls the method to take the screenshot.
		 getscreenshot();
		 }
		 }
  public void getscreenshot() throws Exception {
	  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  // The below method will save the screen shot in d drive with name
	  // "screenshot.png"
	  FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
	  }
	 

  @BeforeTest
  public void invokeTest() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
