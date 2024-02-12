package TestCaptcha;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCaptcha_tesract {

	public static void main(String[] args) throws IOException, InterruptedException, TesseractException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		try {
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.get("");
			
			
			WebElement imageelement=driver.findElement(By.xpath(""));
			
			File src=imageelement.getScreenshotAs(OutputType.FILE);
			
			String path="D:\\Selenium Projects\\JavaMavenProject\\CaptchaImage\\captcha.png";
			FileUtils.copyFile(src,new File(path));
			
			
			Thread.sleep(2000);
			
			ITesseract image=new Tesseract();
			
			String str=image.doOCR(new File(path));
			
			System.out.println("image OCR done");
			System.out.println(str);
			
			String captcha=str.split("below")[1].replaceAll("[^a-zA-Z0-9]", "");
			
			System.out.println(captcha); 
			
			driver.findElement(By.xpath("")).sendKeys(captcha);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("exception caught :"+ e.getMessage());
		}
	}

}
