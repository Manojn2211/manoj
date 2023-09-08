package fetchworkbook;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class booleanworkbook {

	public static void main(String[] args) throws Throwable {
FileInputStream fis =new FileInputStream("C:\\Users\\User\\eclipse-workspace\\QA\\src\\test\\resources\\manoj.xlsx");
Workbook wb= WorkbookFactory.create(fis);
boolean data = wb.getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
System.out.println(data);
	}

}
