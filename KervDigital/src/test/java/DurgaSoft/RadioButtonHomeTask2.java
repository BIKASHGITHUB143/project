package DurgaSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHomeTask2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[5]/div[1]/p")).click();
       // driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]")).click();
       // driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]")).click();
       // Thread.sleep(2000);
		
		/*driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/div[2]/div/div/div[1]/ul/li[2]/span")).isSelected();
		System.out.println(driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/div[2]/div/div/div[1]/ul/li[2]/span")).isSelected());*/
		
		//check how many radio buttons are in a page
		int count=driver.findElements(By.xpath("//input[@class='tabsCircle appendRight5']")).size();
		System.out.println(count);
		
		//Click every radio buttons in a webpage
		for (int i=1;i<count;i++) {
			driver.findElements(By.xpath("//input[@class='tabsCircle appendRight5']")).get(i).click();
			
		}
	}

}
