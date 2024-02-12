package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
        
        ChromeOptions options=new ChromeOptions();
        options.addArguments("disable-notifications");
        
       // options.addArguments("disable-geolocation");
      //  options.addArguments("disable-media-stream");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		List<WebElement> list=new ArrayList<WebElement>();
		
		list=driver.findElements(By.tagName("a"));
		
		List<WebElement> finalList=new ArrayList<WebElement>();
		
		for(int i=0;i<list.size();i++)
		{
			
			//href is the attribute of ancher Tag
			
			if(list.get(i).getAttribute("href")!=null)
			{
				finalList.add(list.get(i));
				System.out.println(list.get(i).getAttribute("href"));
			}
		}
		
		
	}

}
