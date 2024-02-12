package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriverManager.chromedriver().setup();
        
        ChromeOptions options=new ChromeOptions();
        options.addArguments("disable-notifications");
        
       // options.addArguments("disable-geolocation");
      //  options.addArguments("disable-media-stream");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/indices");
		
		WebElement webTable=driver.findElement(By.xpath("//*[@class='dataTable']/tbody"));
		List <WebElement> rows= webTable.findElements(By.tagName("tr"));
		int rowsCount=rows.size();
		
		for(int i=0;i<rowsCount;i++)
		{
			List <WebElement> columns=rows.get(i).findElements(By.tagName("td"));
			
			int columnsCount=columns.size();
			
			for(int j=0;j<columnsCount;j++)
			{
				String cellText=columns.get(j).getText();
				
				if(cellText.equals("S&P BSE 200"))
				{
					System.out.println("Prev close value is: "+columns.get(i).getText());
				}
			}
		}

	}

}
