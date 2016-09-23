package Com.selenium.automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomateLoginpage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://automationpractice.com");
		
		// Click on the SignIn Link
		 WebElement element = driver.findElement(By.xpath(".//*[@class='login']"));
		  element.click();
		  
		  // Enter the email id into the textbox
		  
		  WebElement element1=driver.findElement(By.id("email"));
		  element1.sendKeys("rajattiwari92@gmail.com");
		  
		  // Enter the password into the textbox
		  
		  WebElement element2=driver.findElement(By.id("passwd"));
		  element2.sendKeys("tiwari@2");
		  
		   //Click on the Submit button for login
		  
		  WebElement element3=driver.findElement(By.id("SubmitLogin"));
		  element3.click();
		  
		  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		  
		  
		  // Click on the Women link
		  
		  driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a")).click();
		  
		  // Click on the Tshirst link
		  
		  driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a")).click();
		  
		  // Click on the Add to Cart
		  
		  driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")).click();
		  
		  // Click on proceed to checkout
		  
		  driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
		  
		  // CLick on proceed to checkout
		  driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span")).click();
		  
		  // Click on proceed button
		  driver.findElement(By.xpath(".//*[@id='center_column']/form/p/button")).click();
		  
		  // Click on checkbox
		  
		  driver.findElement(By.xpath(".//*[@id='cgv']")).click();
		  
		  // CLick on proceed button
		  
		  driver.findElement(By.xpath(".//*[@id='form']/p/button")).click();
		  
		  // CLick on Payment
		  
		  driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")).click();
		  
		  // Click on  " I confirm my order"
		  
		  driver.findElement(By.xpath(".//*[@id='cart_navigation']/button")).click();
		  
		  // Click on the Logout link
		  WebElement element4=driver.findElement(By.xpath(".//*[@class='logout']"));
		  element4.click();
		  
		  
		  driver.close();
		  
		 

	}

}
