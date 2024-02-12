package DurgaSoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//Navigate commands
		
		//Multipleline comment
	   /*driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		driver.navigate().forward();*/
		
		driver.navigate().refresh();
		
	}

}
