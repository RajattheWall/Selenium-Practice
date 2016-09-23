package Com.selenium.automate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class linkedinLoginAndLogout {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");
		driver.findElement(By.id("login-email")).sendKeys("rajattiwari92@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("tiwari@2");
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
		Actions act=new Actions(driver);
		WebElement sign = driver.findElement(By.id("signin"));
		act.moveToElement(sign).doubleClick().perform();
		WebElement network = driver.findElement(By.xpath("//li[@class='nav-item']/a[contains(text(),'Connections')]"));
		act.moveToElement(network).perform();
		Thread.sleep(1000);
		WebElement addConn = driver.findElement(By.xpath("//ul[@class='sub-nav']//a[contains(text(),'Add Connections')]"));
		act.moveToElement(addConn).click().perform();
		WebElement img = driver.findElement(By.xpath(".//*[@id='img-defer-id-1-35948']"));
		act.moveToElement(img).perform();
		WebElement signOut = driver.findElement(By.xpath(".//*[@class='account-submenu-split-link']"));
		act.moveToElement(signOut).click().perform();

		}
	
	
		}




