package testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHandling {

	public static void main(String[] args) throws Throwable {
WebDriver driver =new ChromeDriver();
driver.get("https://www.amazon.in");
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,4000);");
Thread.sleep(4000);
jse.executeScript("window.scrollBy(0,-2000);");
	}
}
