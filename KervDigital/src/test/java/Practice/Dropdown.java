package Practice;

import java.net.HttpURLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

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

		driver.get("https://www.spicejet.com/");
		
		
		
		
		
		//driver.switchTo().alert().accept();
		
		//driver.findElement(By.id("FromSector_show")).sendKeys(Keys.ENTER);

		
		//driver.findElement(By.id("FromSector_show")).sendKeys(Keys.TAB);

		//driver.findElement(By.xpath("//*[text()='Currency']")).click();
		
		Select sel=new Select(driver.findElement(By.xpath("//*[text()='Currency']")));
		
		sel.selectByIndex(2);
				

	}

}
