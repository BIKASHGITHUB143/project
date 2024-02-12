package DurgaSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_all_the_Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		//Counts of links available in footer
		WebElement footer = driver.findElement(By.id("navLinks"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		
		//Click all the links available in footer in separate Tab 
		for (int i=0;i<footer.findElements(By.tagName("a")).size();i++) {
			String ClickOn=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).sendKeys(ClickOn);
			
			
			//print all the links available in footer
			System.out.println(footer.findElements(By.tagName("a")).get(i).getText());
		}
			
			
			
}
}


