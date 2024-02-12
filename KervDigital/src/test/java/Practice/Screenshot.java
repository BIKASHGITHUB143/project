package Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
WebDriverManager.chromedriver().setup();
        
        ChromeOptions options=new ChromeOptions();
        options.addArguments("disable-notifications");
        
       // options.addArguments("disable-geolocation");
      //  options.addArguments("disable-media-stream");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/");
		
		/*
		 * TakesScreenshot screenshot = (TakesScreenshot) driver; File source =
		 * screenshot.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(source,new
		 * File("D:\\Selenium Projects\\JavaMavenProject\\Screenshots\\sc.png"));
		 * 
		 * System.out.println("Successfully take a screenshot");
		 */
		
		
		
		/*
		 * //perticular pertion screenshot
		 * WebElement pageSection=driver.findElement(By.xpath("//div[@class='mx-auto text-center p-4']")); 
		 * File src=pageSection.getScreenshotAs(OutputType.FILE);
		 * 
		 * File trgt=new File("sls.png");
		 * 
		 * FileUtils.copyFile(src, trgt);
		 */
		
		//Full page screenshot
		
		TakesScreenshot ts=(TakesScreenshot)driver; //typecast this driver by using TakesScreenshot class then assign to TakesScreenshot Interface
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File trgt=new File("fullpage.png");
		FileUtils.copyFile(src, trgt);
		
		driver.close();
		
	}

}
