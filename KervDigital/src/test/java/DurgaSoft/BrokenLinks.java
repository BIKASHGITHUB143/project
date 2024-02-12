package DurgaSoft;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		//1st Object Creation-list
		List<WebElement> list = new ArrayList<WebElement>();
		list =driver.findElements(By.tagName("a"));
		
		
		//2nd Object Creation- FinalList
		List<WebElement> FinalList = new ArrayList<WebElement>();
		
		//1st condition
		for(int i=0;i<list.size();i++)
		{
			//2nd condition
			if(list.get(i).getAttribute("href") != null)
			{
			FinalList.add(list.get(i));
			System.out.println(list.get(i).getAttribute("href"));
				
			}
			
			
			
		
		}
		
		
		
		
	}

}
