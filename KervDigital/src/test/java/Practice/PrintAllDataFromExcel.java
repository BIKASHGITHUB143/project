package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
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
public class PrintAllDataFromExcel {

	public static FileInputStream fis;
	 public static XSSFWorkbook wb;
	 public static XSSFSheet sheet;
	 public static XSSFRow row;
	 public static XSSFCell cell;


	
	
	 public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			

	     getCellData();
			
		}
			public static void getCellData() throws IOException
			 {
			  fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\ApachePOIData.xlsx");
			  wb=new XSSFWorkbook(fis);
			  sheet=wb.getSheet("Sheet1");

			  int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

			  //Create a loop over all the rows of excel file to read it

			  for (int i = 0; i < rowCount+1; i++) {

			   Row row = sheet.getRow(i);

			   //Create a loop to print cell values in a row

			   for (int j = 0; j < row.getLastCellNum(); j++) {

			    //Print Excel data in console

			    System.out.print(row.getCell(j).getStringCellValue()+"|| ");
			    //System.out.println();

			   }

			   System.out.println();
			  }

		
		
		

	}

}
