package testing;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
//convert the control of selenium  from wd to takesscreenshot
TakesScreenshot ts =(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\User\\Desktop//ScreenShot//google.png+rc");
Files.copy(src, dest);
	
	}
}

