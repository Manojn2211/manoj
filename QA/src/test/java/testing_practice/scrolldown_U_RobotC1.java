package testing_practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown_U_RobotC1 {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com");
Robot r=new Robot();
r.keyPress(KeyEvent.VK_PAGE_DOWN);
r.keyRelease(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(4000);
r.keyPress(KeyEvent.VK_PAGE_UP);
r.keyRelease(KeyEvent.VK_PAGE_UP);
	}

}
