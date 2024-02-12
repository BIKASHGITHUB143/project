package DurgaSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		/*driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Actions a = new Actions(driver);
			
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement Destination = driver.findElement(By.id("droppable"));
		a.dragAndDrop(Source, Destination).build().perform();*/
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/ul/li[2]/a")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Actions a = new Actions(driver);
			
		WebElement Source = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/p[1]"));
		WebElement Destination = driver.findElement(By.id("droppable"));
		a.dragAndDrop(Source, Destination).build().perform();
		
		WebElement Source2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/p[1]"));
		WebElement Destination2 = driver.findElement(By.id("droppable"));
		a.dragAndDrop(Source2, Destination2).build().perform();
		
	}

}
