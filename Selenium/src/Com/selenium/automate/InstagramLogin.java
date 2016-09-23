package Com.selenium.automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InstagramLogin {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Step 1: Navigate to the url
		driver.get("https://www.instagram.com/accounts/login/");
		
		//Step2: enter your username in the textfied
		driver.findElement(By.xpath(".//*[@placeholder='Username']")).sendKeys("rajattiwari92");
		
		//Step3: enter the password in the textfield
		driver.findElement(By.xpath(".//*[@placeholder='Password']")).sendKeys("cassanova");
		
		//Step4: Click on the Log in button
		
		driver.findElement(By.xpath(".//*[@class='_aj7mu _taytv _ki5uo _o0442']")).click();
		
		//Step 5:  wait for the page to load
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Step 6 : Click on the home link
		driver.findElement(By.xpath(".//*[@class='_soakw _vbtk2 coreSpriteDesktopNavProfile']")).click();
		
		// Step7 : Click on the option
		driver.findElement(By.xpath(".//*[@class='_fcwm8 coreSpriteEllipsis _soakw']")).click();
		
		// Step 8: click on the logut option
		driver.findElement(By.xpath(".//*[@class='_4y3e3']")).click();
		
		
		driver.close();
	}

}
