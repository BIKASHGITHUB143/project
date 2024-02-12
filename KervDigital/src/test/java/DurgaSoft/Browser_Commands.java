package DurgaSoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Commands {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//get Title
		
		System.out.println(driver.getTitle());
		
		/* String title = driver.getTitle();
		System.out.println(title);*/
		
		//Current URL
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		
		
		//Get Page source
		
		//String page_source = driver.getPageSource();
		//System.out.println(page_source);
		
		//Maximize
		//driver.manage().window().maximize();
		
		//Minimize
		//driver.manage().window().setPosition(new Point(0, -450));
		
		//Close Browser
		//driver.close();
		
		//Quit browser
		//driver.quit();
	}

}


