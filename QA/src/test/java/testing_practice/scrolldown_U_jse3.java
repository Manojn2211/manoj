package testing_practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown_U_jse3 {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.get("https://actitime.com");
JavascriptExecutor jse=(JavascriptExecutor)driver;
 jse.executeScript("window.scrollBy(0,4000);");
Thread.sleep(3000);
jse.executeScript("window.scrollBy(0,-2000);");
}

}
