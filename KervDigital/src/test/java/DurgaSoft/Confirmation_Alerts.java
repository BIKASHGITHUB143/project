package DurgaSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Alerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		//https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		/*driver.switchTo().frame("iframeResult");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/button")).click();
		
		driver.switchTo().alert().accept();*/
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();
		
		
	}

}
