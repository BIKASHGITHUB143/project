package DurgaSoft;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		/*driver.findElement(By.id("divpaxinfo")).click();
		
		//Adult
		Select Adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		//Adult.selectByIndex(3);
		Adult.selectByValue("4");
	
		//child
		Select child = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		child.selectByValue("2");
		
		//Infant
		Select Infant = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		Infant.selectByVisibleText("2");
		
		//GetText
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());*/
		
		
		
		//GetOptions
		Select Currency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		List<WebElement> op = Currency.getOptions(); //op option
		int size=op.size();
		for(int i =0; i<size ; i++){
	          String options = op.get(i).getText();
	          System.out.println(options);
	          
	          
	         
	           }

		
	}

}
