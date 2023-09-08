package testing_practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_U_JSE1 {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com");
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,3000);");
Thread.sleep(3000);
jse.executeScript("window.scrollBy(0,-2000);");
}

}
