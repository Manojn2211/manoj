package fetchworkbook;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datafromexcelsheet {

	public static void main(String[] args) throws Throwable {
FileInputStream fis=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\QA\\src\\test\\resources\\manoj1.xlsx");
Workbook wb=WorkbookFactory.create(fis);
Sheet sh=wb.getSheet("Sheet1");
String data = sh.getRow(2).getCell(0).getStringCellValue();
System.out.println(data);
	}
	

}
