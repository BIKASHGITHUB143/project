package DurgaSoft;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//2 ways we can handle scroll
		
		//1st way using Actions class
		Actions a = new Actions(driver);
		//a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		for (int i=0; i<9; i++)
		{
			a.sendKeys(Keys.PAGE_DOWN).build().perform();
		}
		
		//a.sendKeys(Keys.PAGE_UP).build().perform();
		for (int i=9; i>0;i++) {
			a.sendKeys(Keys.PAGE_UP).build().perform();
		}
		
		//2nd way using javascript executor
		((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scroll(4000,0)");
	}

}
