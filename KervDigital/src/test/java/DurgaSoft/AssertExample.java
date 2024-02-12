package DurgaSoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertExample {

	
	@Test
	public static void Assertverify() {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		  driver.get("https://www.Flipkart.com/");
		  driver.manage().window().maximize();
		 
			
			 String ActualResult = driver.getCurrentUrl();
			 
			 String ExpectedResult ="https://www.flipkart.com/";
			 
			 //https://www.flipkart.com/
			  
			 
			Assert.assertEquals(ActualResult, ExpectedResult, "successful");
	}

}
