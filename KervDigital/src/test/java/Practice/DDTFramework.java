package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDTFramework {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File source=new File("C:\\Users\\Admin\\Desktop\\ApachePOIData.xlsx");
		FileInputStream fis = new FileInputStream(source);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet =workbook.getSheetAt(0);
//		String data_Zero=sheet.getRow(0).getCell(0).getStringCellValue();
//		String data_One=sheet.getRow(0).getCell(1).getStringCellValue();
//		String data_Two=sheet.getRow(1).getCell(0).getStringCellValue();
//		String data_Three=sheet.getRow(1).getCell(1).getStringCellValue();
//		
//		System.out.println("Data From "+data_Zero);
//		System.out.println("Data From "+data_One);
//		System.out.println("Data From "+data_Two);
//		System.out.println("Data From "+data_Three);
		
		System.out.println(sheet.getRow(1).getCell(1));


	}

}
