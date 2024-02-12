package DurgaSoft;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class easymytrip {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.easemytrip.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        /*driver.findElement(By.id("FromSector_show")).clear();
        //WebElement webElement = driver.findElement(By.id("FromSector_show"));//.sendKeys("BBI");
        //webElement.sendKeys("BBI");
        //Thread.sleep(1000);
       // webElement.sendKeys(Keys.TAB);
        
        driver.findElement(By.id("FromSector_show")).sendKeys("BBI");
        Thread.sleep(1000);
        driver.findElement(By.id("FromSector_show")).sendKeys(Keys.ENTER);
        

        
        //Thread.sleep(4000);
		//driver.findElement(By.id("FromSector_show")).sendKeys(Keys.TAB);
		driver.findElement(By.id("Editbox13_show")).sendKeys("BOM");
		Thread.sleep(1000);
		driver.findElement(By.id("Editbox13_show")).sendKeys(Keys.ENTER);
		//driver.findElement(By.id("ddate")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='snd_0_07/03/2021']")).click();
		driver.findElement(By.id("rdate")).click();
		driver.findElement(By.id("trd_1_12/04/2021")).click();
		driver.findElement(By.xpath("//*[@id=\"frmHome\"]/div[14]/div[2]/div[3]/div[1]/div[5]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"myDropdown_n\"]/div/div[2]/div[2]/div/div[3]/input")).click();
		driver.findElement(By.id("traveLer")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).click();*/
		
		
		
		WebElement Source = driver.findElement(By.id("FromSector_show"));
		Source.clear();
		Source.sendKeys("BBI");
		Thread.sleep(4000);
		Source.sendKeys(Keys.ENTER);
		Source.getText();
		//Thread.sleep(4000);
		System.out.println(Source.getText());
		
		WebElement Destination = driver.findElement(By.id("Editbox13_show"));
		Destination.sendKeys("BOM");
		Thread.sleep(4000);
		Destination.sendKeys(Keys.ENTER);
		Destination.getText();
		//Thread.sleep(4000);
		System.out.println(Destination.getText());
		
		
		

	}

}
