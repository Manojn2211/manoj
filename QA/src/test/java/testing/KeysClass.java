package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClass {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("manoj",Keys.TAB,"8121729010",Keys.ENTER);
	}

}
