package DurgaSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_HomeTask {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		        //all links in a webpage
				driver.findElements(By.tagName("a")).size();
				System.out.println(driver.findElements(By.tagName("a")).size());
				
				//Footer
				WebElement footer = driver.findElement(By.id("navFooter"));
				System.out.println(footer.findElements(By.tagName("a")).size());
				
				//MenuLinks
				WebElement Menu = driver.findElement(By.id("nav-main"));
				System.out.println(Menu.findElements(By.tagName("a")).size());
			
	}

}
