package fetchworkbook;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practice_workbook {


	public static void main(String[] args) throws Throwable, IOException {
FileInputStream fis=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\QA\\src\\test\\resources\\book5.xlsx");
Workbook wb=WorkbookFactory.create(fis);
  double data=wb.getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
System.out.println(data);
	}

}
