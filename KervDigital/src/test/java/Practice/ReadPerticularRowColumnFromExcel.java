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

public class ReadPerticularRowColumnFromExcel {
		
		public static FileInputStream fis;
		 public static XSSFWorkbook wb;
		 public static XSSFSheet sheet;
		 public static XSSFRow row;
		 public static XSSFCell cell;

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
			String Value=getCellData(8,1);
		    System.out.println("Value in excel file is "+Value);
			
			
		}
			public static String getCellData(int rownum,int colnum) throws IOException
			 {
			  // For Reading Data from excel file
			  fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\ApachePOIData.xlsx");
			  wb=new XSSFWorkbook(fis);
			  sheet=wb.getSheet("Sheet1"); //Sheet1 is the name of sheet in excel file
			  row=sheet.getRow(rownum);
			  cell=row.getCell(colnum);
			  cell.getStringCellValue();
			  fis.close();
			  return cell.getStringCellValue();

	}

}
