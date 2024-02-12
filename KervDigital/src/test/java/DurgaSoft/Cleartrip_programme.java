package DurgaSoft;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cleartrip_programme {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		
		//ChromeOptions object
		ChromeOptions op = new ChromeOptions();
		//disable notification parameter 
		op.addArguments("--disable-notifications");
		
		// configure options parameter to Chrome driver
		WebDriver driver = new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/flights");
		driver.manage().window().maximize();
	
		//scrolling
		Actions a = new Actions(driver);
		//a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		for (int i=0; i<9; i++)
		{
			a.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		
		//Auto suggested Dropdown
		//origin
		driver.findElement(By.name("origin")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("origin")).sendKeys("BOM");
		//driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.name("origin")).sendKeys(Keys.ENTER);
		
		//destination
		driver.findElement(By.name("destination")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("destination")).sendKeys("BBI");
		//driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.name("destination")).sendKeys(Keys.ENTER);
		
		//date
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[5]/td[5]/a[1]")).click();
		
		//Dropdown
		//Adults
		Select Adults = new Select(driver.findElement(By.id("Adults")));

		//B.selectByIndex(4);
		//B.selectByVisibleText("6");
		Adults.selectByValue("3");
		
		//childrens
		Select childrens = new Select(driver.findElement(By.id("Childrens")));
		childrens.selectByValue("2");
		//Infants
		Select Infants = new Select(driver.findElement(By.id("Infants")));
		Infants.selectByValue("1");
		
		//more options
		driver.findElement(By.id("MoreOptionsLink")).click();
		
		//class dropdown
		Select Class = new Select(driver.findElement(By.id("Class")));
		Class.selectByValue("Business");
		Thread.sleep(2000);
	    driver.findElement(By.name("airline")).sendKeys("INDIG");
	    Thread.sleep(2000);
		driver.findElement(By.name("airline")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("creditShell")).click();
	    driver.findElement(By.id("SearchBtn")).click();
	    
		
	}	

}
