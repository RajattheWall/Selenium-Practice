package Com.selenium.automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {
	
	
	public static void main(String[] args) throws InterruptedException {
        
        //initialize FireFox driver
        //System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-2.35.0\\chromedriver_win32_2.2\\chromedriver.exe");        
         WebDriver driver = new FirefoxDriver(); 
          
         //Open gmail
         driver.get("http://www.gmail.com");
          
         // Enter userd id
         WebElement element = driver.findElement(By.id("Email"));
         element.sendKeys("rajattiwari92@gmail.com");
         
         // Click on Next Button
         WebElement element1= driver.findElement(By.id("next"));
         element1.click();
          
         //wait 5 secs for  userid to be entered
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          
         //Enter Password in the textfield
         WebElement element2 = driver.findElement(By.id("Passwd"));
         element2.sendKeys("tiwari@1");
          
         // Click on Submit button
         driver.findElement(By.id("signIn")).click();
          
          
         WebElement myDynamicElement = (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.id("gbg4")));
         driver.findElement(By.id("gbg4")).click();
          
         //press signout button
         
        
         
  driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
  
  Thread.sleep(2000);
  
 driver.findElement(By.id("gb_71")).click(); 
 
          driver.close();
    }
     
     
 
}


