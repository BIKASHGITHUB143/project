package DurgaSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownHomeTask2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
       
        driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]")).click();
        
        
      // driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[5]")).click();
        Thread.sleep(2000);
       driver.findElement(By.id("username")).sendKeys("sahu.bikash000@gmail.com");
        
        driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Minimum 6 characters.']")).sendKeys("Bikash@#92");
        driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button/span")).click();
	}

}
