package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePagePageFactory {
	
	WebDriver driver;
	
	
          public RediffHomePagePageFactory(WebDriver driver) {
        	  this.driver=driver;
        	  PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

		 
		 // By search=By.xpath("//input[@id='srchword']");
		 //By submitsearch= By.className("newsrchbtn");
		 
		 @FindBy(xpath="//input[@id='srchword']")
		 WebElement search;
		 @FindBy(className="newsrchbtn")
		 WebElement submitsearch;
		 
		 
		 public WebElement Search()
		 {
			 return search;
		 }
		  public WebElement SubmitSearch()
		  {
			  return submitsearch;
		  }
		 
		 
}
