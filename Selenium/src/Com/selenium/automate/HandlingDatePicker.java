package Com.selenium.automate;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandlingDatePicker {
	
	@Test
    public void datePickerHandling()
    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Datepicker.html");
 
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('datepicker1').value = '09/12/2020';");
 
        driver.close();
    }
}




