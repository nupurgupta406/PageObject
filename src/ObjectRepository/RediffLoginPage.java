package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	// normal page object model is used
	
	
          public RediffLoginPage(WebDriver driver) {
        	  this.driver=driver;
		// TODO Auto-generated constructor stub
	}

		By username=  By.xpath("//input[@id='login1']");
          By password=By.id("password");
          By signin=By.name("proceed");
          By home=By.linkText("rediff.com");
          
          public WebElement EmailId()
          {
        	 return driver.findElement(username);
          }
          
          public WebElement Password()
          {
        	 return driver.findElement(password);
          }
          public WebElement submit()
          {
        	 return driver.findElement(signin);
          }
          public WebElement Home()
 		 {
 			 return driver.findElement(home);
 		 }

	
}
