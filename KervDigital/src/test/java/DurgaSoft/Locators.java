package DurgaSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/r.php");
driver.manage().window().maximize();
//driver.findElement(By.name("firstname")).sendKeys("Rakesh");
//driver.findElement(By.name("lastname")).sendKeys("Shrama");
//driver.findElement(By.name("reg_email__")).sendKeys("7506352452");
//driver.close();

driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/input[1]")).click();
driver.findElement(By.id("email")).sendKeys("abc");
driver.findElement(By.id("pass")).sendKeys("123");
//driver.findElement(By.linkText("Forgotten account?")).click();
//driver.findElement(By.partialLinkText("Forgotten")).click();
driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[3]/label[1]/input[1]")).click();


	}

}
