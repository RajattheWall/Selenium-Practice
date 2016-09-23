package Com.selenium.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateanAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new FirefoxDriver();
		
		//Navigate to the Url of the application.
		driver.get("http://automationpractice.com");
		
		// click on SignIn link
		WebElement element=driver.findElement(By.xpath(".//*[@class='login']"));
		element.click();
		
		
		// Click on Email address on Create Account
		WebElement element1=driver.findElement(By.id("email_create"));
		element1.sendKeys("rajattiwari92@outllok.com");
		
		//Click on Create Account Button
		
		WebElement element2= driver.findElement(By.id("SubmitCreate"));
		element2.click();
		
		/**
		 * @param args fill all the details for the new registartion account 
		 */
		
		
		// Click on the Title checkbox
		WebElement element3= driver.findElement(By.xpath(".//*[@for='id_gender1']"));
		element3.click();
		
		// Enter text in FirstName
		
		WebElement element4= driver.findElement(By.id("customer_firstname"));
		element4.sendKeys("Aditya");
		
		// Enter text in Last Name
		
		WebElement element5= driver.findElement(By.id("customer_lastname"));
		element5.sendKeys("Saxena");
		
		// Enter the text in password.
		
		WebElement element6= driver.findElement(By.id("passwd"));
		element6.sendKeys("Saxena");
		
		
		// Enter the firstname
		
		WebElement element7= driver.findElement(By.id("firstname"));
		element7.sendKeys("Aditya");
		
       
		// Enter the password
		
		WebElement element8= driver.findElement(By.id("lastname"));
		element8.sendKeys("Saxena");
		
		// Enter the Comapany Name
		
		WebElement element9= driver.findElement(By.id("company"));
		element9.sendKeys("Asus");
		
		// Enter The address
		
		WebElement element10= driver.findElement(By.id("address1"));
		element10.sendKeys("Doorn0-301, 2nd floor, Carlona Building, NorthStreet, Petersandbox");
		
		
		// Enter the address 2
		
		WebElement element11= driver.findElement(By.id("address2"));
		element11.sendKeys("Bhootnath street North Caolina New York USA");
		
		// Enter the city
		WebElement element12= driver.findElement(By.id("city"));
		element12.sendKeys("New York");
		
		
       // Enter the State
		
		WebElement element13= driver.findElement(By.id("id_state"));
		element13.sendKeys("Florida");
		
		// Enter the Zipcode
		
		WebElement element14= driver.findElement(By.id("postcode"));
		element14.sendKeys("54609");
		
		//Enter the country
		
		WebElement element15= driver.findElement(By.id("postcode"));
		element15.sendKeys("United States");
		
		// Enter the Alternate email id
		
		WebElement element16= driver.findElement(By.id("alias"));
		element16.sendKeys("rajattiwari92@gmail.com");
		
		
		// click on the Register Button
		
		WebElement element17= driver.findElement(By.id("submitAccount"));
		element17.click();
	}

}
