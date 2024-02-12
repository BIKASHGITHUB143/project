package DurgaSoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		/*driver.findElement(By.xpath("//input [@value='Milk']")).click();
		
		//Validate Radio Button(gives o/p like- True/False)
		driver.findElement(By.xpath("//input [@value='Milk']")).isSelected();
		System.out.println(driver.findElement(By.xpath("//input [@value='Milk']")).isSelected());*/
		
		/*//check how many radio buttons are in a page
		int count=driver.findElements(By.xpath("//input[@type='radio']")).size();
		System.out.println(count);
		
		//Click every radio buttons in a webpage
		for (int i=1;i<count;i++) {
			driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
			
		}*/
		
		//check count only 3(water,Beer & wine) out of 9 radio buttons in a webpage
				int count=driver.findElements(By.xpath("//input[@name='group2']")).size();
				System.out.println(count);
				
				//click every 3 radio buttons in a webpage
				for (int i=1;i<count;i++) {
					driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
					
				}
		
		
		

	}

}
