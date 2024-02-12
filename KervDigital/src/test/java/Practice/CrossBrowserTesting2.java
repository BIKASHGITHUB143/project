package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		String browserName="chrome";
		WebDriver driver=null;
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("provide a valid browser name");
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.close();

	}

}
