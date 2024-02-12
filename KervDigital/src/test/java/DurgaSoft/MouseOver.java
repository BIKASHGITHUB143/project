package DurgaSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");

		Actions a = new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[2]/span[1]/span[1]"))).build().perform();
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("sahu.bikash000@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("bikash@92");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung note 10 lite");
        //Thread.sleep(1000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);*/
        
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("samsung note 10 lite");
        search.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
        
        String newWindow = driver.getWindowHandle();
        driver.switchTo().window(newWindow);
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();

		//a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]"))).build().perform();
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/a[13]/span[1]")).click();
	}

}
