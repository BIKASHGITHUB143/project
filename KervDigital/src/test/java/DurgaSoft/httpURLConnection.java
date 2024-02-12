package DurgaSoft;

import java.io.IOException;
import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class httpURLConnection {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
        System.out.println(link.size());
        for (int i=0;i<link.size();i++)
        {
        	WebElement element = link.get(i);
        	String url = element.getAttribute("href");
        	
        	verifyLink(url);
        	
        	}
        
        
	}
	
	//Verify link

	public static void verifyLink(String urlLink) {
        //Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
        try {
   //Use URL Class - Create object of the URL Class and pass the urlLink as parameter 
   URL link = new URL(urlLink);
   // Create a connection using URL object (i.e., link)
   HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
   //Set the timeout for 2 seconds
   httpConn.setConnectTimeout(2000);
   //connect using connect method
   httpConn.connect();
   
   //use getResponseCode() to get the response code. 
    if(httpConn.getResponseCode()== 200) { 
     System.out.println(urlLink+" - "+httpConn.getResponseMessage());
    }
    if(httpConn.getResponseCode()== 404) {
     System.out.println(urlLink+" - "+httpConn.getResponseMessage());
    }
   }
   //getResponseCode method returns = IOException - if an error occurred connecting to the server. 
  catch (Exception e) {
   //e.printS

	
	

}
	}
}
