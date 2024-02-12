package DurgaSoft;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_EveryLink {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i=0;i<links.size();i++) {
			
			
			if(!links.get(i).getText().isEmpty()) //Links is not empty
			{
				
				String Link_name = links.get(i).getText();
				links.get(i).click();
				/*File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcFile,new File("C:\\Selenium\\Screenshot\\"+Link_name+".jpeg"));
				links=driver.findElements(By.tagName("a"));*/
				
				TakesScreenshot screenshot = (TakesScreenshot) driver;
				File source = screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source,new File("C:\\Selenium\\Screenshot\\"+Link_name+".jpeg"));
				links=driver.findElements(By.tagName("a"));
				System.out.println("Successfully take a screenshot");
			}
			
			System.out.println("Link not Found");
			
	}
		

}
}
