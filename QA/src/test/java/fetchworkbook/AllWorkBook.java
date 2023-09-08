package fetchworkbook;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllWorkBook {

	public static void main(String[] args) throws Throwable {
FileInputStream fis=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\QA\\src\\test\\resources\\allworkbook.xlsx");
Workbook wb= WorkbookFactory.create(fis);
 String data= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
 System.out.println(data);
 //fetch numaric type of data
 double data2=  wb.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
 System.out.println(data2);
 //fetch boolean data
  boolean data3= wb.getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
  System.out.println(data3);
	}

}
