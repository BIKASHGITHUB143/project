package DurgaSoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions object = new ChromeOptions();
		
		//we are not invoked the browser & get the direct output
		object.setHeadless(true);
		
		//we are invoked the browser & get the output in the console
		//object.setHeadless(false);
		WebDriver driver = new ChromeDriver(object);
		driver.get("https://www.selenium.dev/");
		driver.getTitle();
		
		String Title = driver.getTitle();
		System.out.println(Title);
	}

}
