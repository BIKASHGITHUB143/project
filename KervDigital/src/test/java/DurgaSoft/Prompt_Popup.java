package DurgaSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		/*driver.switchTo().frame("iframeResult");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/button")).click();
		
		driver.switchTo().alert().accept();*/
		
		/*driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();*/

		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/button")).clear();
		driver.switchTo().alert().sendKeys("Bikash");
		
	}

}
