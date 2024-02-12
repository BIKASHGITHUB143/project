package Task;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KervDigTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver = null;
        try {
        	
        	WebDriverManager.chromedriver().setup();
        	driver=new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.get("https://kerv.com/careers-at-kerv/");
			
		} catch (Exception e) {
			System.out.println(e);
		}
        
        
        
        
		
		driver.findElement(By.xpath("//a[@class='_brlbs-btn _brlbs-btn-accept-all _brlbs-cursor']")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("/html/body/header/div[2]/nav/div/div[6]")).click();
		driver.findElement(By.xpath("//div[@data-id='18659']")).click();
		
		driver.findElement(By.xpath("/html/body/header/div[2]/nav/div/div[6]/div[2]/div/div[2]/div[1]/a[2]")).click();
		

		((JavascriptExecutor)driver).executeScript("scroll(0,2020)");
		
		Thread.sleep(2000);
		
		
		
		List<WebElement>search_filter=driver.findElements(By.xpath("//*[@class='search-filters__group-heading']/button"));

		for(WebElement we: search_filter)
	
		{
			we.click();
		}
		Thread.sleep(2000);		

		List<WebElement> searchgroupHeading=driver.findElements(By.xpath("//*[@class='search-filters__group-items']/li/button"));

		for(WebElement sgh: searchgroupHeading)
	
		{
			String groupHeading=sgh.getText().trim();
			if(groupHeading.equals("India"))
			{
				sgh.click();
			}
	
			else if(groupHeading.equals("Full Time"))
			{
				sgh.click();
			}
			else if(groupHeading.equals("Hybrid"))
			{
				sgh.click();
			}
	
	
	
}

		
		Thread.sleep(2000);		
		
		List<WebElement> listOfJobTitle=driver.findElements(By.xpath("//*[@class='search-results__title']"));

		for(WebElement e: listOfJobTitle)
	
		{
	  String jobTitle=e.getText();
	  System.out.println(jobTitle);
		}	


		driver.findElement(By.xpath("//*[@id=\"job-search\"]/div/div/div[1]/input")).sendKeys("senior test engineer automation");
		driver.findElement(By.xpath("//*[@id=\"job-search\"]/div/div/div[1]/input")).sendKeys(Keys.ENTER);


		Thread.sleep(2000);	
		driver.findElement(By.xpath("//*[@id=\"search-results\"]/div/div[1]/a")).click();

		String parent=driver.getWindowHandle();
		System.out.println(parent);

		Set <String> allwindows=driver.getWindowHandles();

		for(String child:allwindows)
		{
			if(!parent.equals(child))
			{
		driver.switchTo().window(child);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,3000)");
		
		driver.findElement(By.xpath("//input[@id='candidate_first_name']")).sendKeys("Bikash");
		driver.findElement(By.xpath("//input[@id='candidate_last_name']")).sendKeys("Sahu");
		
		driver.findElement(By.xpath("//input[@id='candidate_email']")).sendKeys("sahu.bikash000@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='candidate_phone']")).sendKeys("7506360390");
		driver.findElement(By.xpath("//input[@id='resume']")).sendKeys("C:\\Users\\Admin\\Downloads\\Resume_Bikash Sahu.pdf");
		

        Thread.sleep(2000);	
		((JavascriptExecutor)driver).executeScript("scroll(3000,4000)");
		
		driver.findElement(By.xpath("//input[@id='notice_period']")).sendKeys("60");
		
		driver.findElement(By.xpath("//*[@id=\"cta-form\"]/div/div/div/form/button")).sendKeys(Keys.ENTER);
			}
	
		}

		
	}

}
