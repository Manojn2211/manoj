package testing;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotIndividualElement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement abc=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		File src=abc.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\\\Users\\\\User\\\\Desktop//ScreenShot//googleLogo.png");
		Files.copy(src, dest);

	}

}
