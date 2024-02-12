package DurgaSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		
		
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		//single checkbox
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isDisplayed());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isEnabled());
		
		
		
		/*//count all the checkbox 
		int count = driver.findElements(By.xpath("//input [@type='checkbox']")).size();
		System.out.println(count);
		
		//check all the check box
		for(int i=1;i<count;i++)
		{
			driver.findElements(By.xpath("//input [@type='checkbox']")).get(i).click();
		}*/
		

		
	 

	}

}
