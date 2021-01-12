package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	
	WebDriver driver;
	
	
          public RediffHomePage(WebDriver driver) {
        	  this.driver=driver;
		// TODO Auto-generated constructor stub
	}

		 
		  By search=By.xpath("//input[@id='srchword']");
		 By submitsearch= By.className("newsrchbtn");
		 
		 
		 public WebElement Search()
		 {
			 return driver.findElement(search);
		 }
		  public WebElement SubmitSearch()
		  {
			  return driver.findElement(submitsearch);
		  }
		 
		 
}
