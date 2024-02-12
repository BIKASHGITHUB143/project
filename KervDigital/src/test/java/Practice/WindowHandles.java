package Practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

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
		
		driver.get("https://www.selenium.dev/");
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		Set <String> allwindows=driver.getWindowHandles();
		
		for(String child:allwindows)
		{
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				driver.close();
			}
			driver.switchTo().window(parent);
		}


	}

}
