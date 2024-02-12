package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

public class CrossBrowserTestingUsingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		
		Properties prop=new Properties();
		File file=new File("config.properties");
		FileInputStream fis=new FileInputStream(file);
		prop.load(fis);
		
		
		WebDriver driver = null;
		String browser=prop.getProperty("browser");
		
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("choose the correct browser");
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.quit();

	}

}
