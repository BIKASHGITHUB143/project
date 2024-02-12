package DurgaSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
   
	driver.get("https://www.facebook.com/r.php");
	driver.manage().window().maximize();
	
	//driver.findElement(By.xpath("//input [@type='submit']")).click();
	
	driver.findElement(By.xpath("//input [@name='firstname']")).sendKeys("Ram");
	driver.findElement(By.xpath("//input [@name='lastname']")).sendKeys("Thakur");
	driver.findElement(By.xpath("//input [@name='reg_email__']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input [@name='reg_email_confirmation__']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input [@name='reg_passwd__']")).sendKeys("Ram@12345");
	
	Select day = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
	//day.selectByIndex(12);
	//day.selectByVisibleText("20");
	day.selectByValue("3");
	
	Select month = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
	//month.selectByIndex(8);
	//month.selectByValue("4");
	month.selectByVisibleText("May");
	
	Select year = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
	//year.selectByIndex(5);
	//year.selectByVisibleText("2012");
	year.selectByValue("2015");
	
	
	
	
	}

}
