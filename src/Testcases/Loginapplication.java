package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffHomePage;
import ObjectRepository.RediffHomePagePageFactory;
import ObjectRepository.RediffLoginPage;

public class Loginapplication {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPage rd= new RediffLoginPage(driver);
		rd.EmailId().sendKeys("nupur");
		rd.Password().sendKeys("gupta");
		//rd.submit().click();
		rd.Home().click();
		RediffHomePagePageFactory rh=new RediffHomePagePageFactory(driver);
		rh.Search().sendKeys("phone");
		rh.SubmitSearch().click();
		
	}
	

}
