package DurgaSoft;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		
		driver.get("https://www.durgasoftonline.com/");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"navbarContent\"]/ul/li[5]/a")).click();
		
      //  WebDriverWait wait = new WebDriverWait(driver,10);
		
	   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginFormHtml\"]/div/div[2]/form[2]/div[5]/button[1]")));
	    driver.findElement(By.xpath("//*[@id=\"loginFormHtml\"]/div/div[2]/form[2]/div[5]/button[1]")).click();
		
	}

}
