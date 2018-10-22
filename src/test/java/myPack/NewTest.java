package myPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest 
{
	  WebDriver driver;
		String title;
		
		@Test
	  public void Login() 
	  {
			System.setProperty("webdriver.gecko.driver", "C:\\Testing\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("http://newtours.demoaut.com/");
			title=driver.getTitle();
			Assert.assertEquals("Welcome: Mercury Tours", title);
			System.out.println("Test Passed !!");
	  

  }
}
