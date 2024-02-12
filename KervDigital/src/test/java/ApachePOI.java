import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ApachePOI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\ApachePOIData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0); 
		
		System.out.println(sheet.getRow(0).getCell(0));
		
		Row row1=sheet.getRow(1);
		Cell cell1=row1.getCell(1);
		
		System.out.println(sheet.getRow(0).getCell(1));
		
		Row row2=sheet.getRow(2);
		Cell cell2=row1.getCell(2);
		
		System.out.println(sheet.getRow(1).getCell(1));
		System.out.println(sheet.getRow(1).getCell(2));
		
		

	}

}
