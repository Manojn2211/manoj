package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class notificationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("key","value");
	EdgeOptions c=new EdgeOptions();
	c.addArguments("--disable-notification");
	c.addArguments("start-maximiged");
WebDriver driver=new EdgeDriver(c);
Thread.sleep(3000);
driver.get("https://www.hdfc.com");
}
}
