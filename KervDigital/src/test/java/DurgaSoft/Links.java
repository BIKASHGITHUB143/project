package DurgaSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		//all links count in a webpage
		driver.findElements(By.tagName("a")).size();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Footer
		WebElement footer = driver.findElement(By.xpath("//div[@class='footer-copyright-text']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//Footer table
		//WebElement footertable = driver.findElement(By.id("footerTable"));
		//System.out.println(footertable.findElements(By.tagName("a")).size());
		
	}

}
