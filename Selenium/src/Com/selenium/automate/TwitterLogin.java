package Com.selenium.automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TwitterLogin {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Step1: Navigate to the Url
		driver.get("https://twitter.com/");
		
		//step2: Click on the login link
		driver.findElement(By.xpath(".//*[@class='Button StreamsLogin js-login']")).click();
		
		//Step3: Enter values in the username textbox
		driver.findElement(By.xpath(".//*[@placeholder='Phone, email or username']")).sendKeys("rajattiwari92@gmail.com");
		
		// Step 4: enter values in the password
		
		driver.findElement(By.xpath(".//*[@placeholder='Password']")).sendKeys("tiwari@2");
		
		// Step 5: Click on the Login button
		
		driver.findElement(By.xpath(".//*[@value='Log in']")).click();
		
	  // Step 6: Wait for the  page to load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//  Step7: Click on the Popup link
		
		driver.findElement(By.xpath(".//*[@id='user-dropdown-toggle']")).click();
		
		//Step 8: Click on Logout button
		
		driver.findElement(By.xpath(".//*[@id='signout-button']/button")).click();
		
		
		// Step 9 : close the browser
		
		driver.close();
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


