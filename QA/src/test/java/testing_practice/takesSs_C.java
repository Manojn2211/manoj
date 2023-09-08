package testing_practice;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takesSs_C {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.get("https://www.actitime.com");
TakesScreenshot ts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\User\\Desktop\\Testing_p\\actitime.jpg");
Files.copy(src, dest);

	}

}
